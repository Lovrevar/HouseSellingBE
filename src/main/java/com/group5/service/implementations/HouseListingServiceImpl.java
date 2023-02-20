package com.group5.service.implementations;
import com.group5.database.DatabaseServerConn;
import com.group5.model.*;
import com.group5.proto.Listing.*;
import com.group5.service.services.HouseListingService;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

@Service
public class HouseListingServiceImpl implements HouseListingService {
    ListingServiceGrpc.ListingServiceBlockingStub blockingStub;
    ListingServiceGrpc.ListingServiceStub stub;

    public HouseListingServiceImpl() {
        blockingStub=DatabaseServerConn.getListingBlockingStub();
        stub=DatabaseServerConn.getListingStub();
    }

    @Override
    public HouseListing getHouseListingById(long id) {
        HouseResponse response = null;
        try{
            response = blockingStub.getListingById(IdRequest.newBuilder().setId(id).build());
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
            return null;
        }
        return new HouseListing(response.getId(),new Address(response.getAddress().getStreet(), response.getAddress().getPostNumber(), response.getAddress().getCity(),
                response.getAddress().getHouseNo()), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(),
                response.getFloorArea(), ImageFile.fromGrpc(response.getImagesList()), response.getPrice(), response.getUserEmail(), response.getDescription());
    }

    @Override
    public ArrayList<HouseListingShort> getHouseListings(Optional<String> maxPrice, Optional<String> minArea, Optional<String> city) {
        ListingFiltersRequest.Builder builder=ListingFiltersRequest.newBuilder();
        ArrayList<HouseListingShort> listingShorts=new ArrayList<>();
        {
            if(maxPrice.isPresent())
            {
                builder.setMaxPrice(Long.parseLong(maxPrice.get()));
            }
            if (minArea.isPresent()) {
                builder.setMinArea(Long.parseLong(minArea.get()));
            }
            if (city.isPresent()) {
                builder.setCity(city.get());
            }
            ListingFiltersRequest request=builder.build();

            Iterator<ShortListingResponse> response;

            response = blockingStub.getFilteredListings(request);
            return getHouseListingShorts(listingShorts, response);
        }
    }

    @Override
    public HouseListing addListing(HouseListingCreationDTO listing) {
        HouseResponse response = null;
        try {
            response = blockingStub.createListing(CreateHouseListingRequest.newBuilder()
                    .setConstructionYear(listing.getConstructionyear())
                    .setLastRebuilt(listing.getLastrebuilt())
                    .setHasInspection(listing.isHasinspection())
                    .setGroundArea(listing.getGroundarea())
                    .setFloorArea(listing.getFloorarea())
                    .setAddress(AddressMessage.newBuilder().setStreet(listing.getAddress().getStreet()).setHouseNo(listing.getAddress().houseno)
                            .setCity(listing.getAddress().city).setPostNumber(listing.getAddress().postnumber).build())
                            .addAllImages(HouseListing.getAllImageFileMessages(listing.getImages()))
                    .setPrice((double)listing.getPrice())
                    .setUserEmail(listing.getEmail())
                            .setDescription(listing.getDescription())
                    .build());
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
            return null;
        }
        return new HouseListing(response.getId(),new Address(response.getAddress().getStreet(), response.getAddress().getPostNumber(), response.getAddress().getCity(),
                response.getAddress().getHouseNo()), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(),
                response.getFloorArea(), ImageFile.fromGrpc(response.getImagesList()), response.getPrice(), response.getUserEmail(), response.getDescription());
    }

    @Override
    public HouseListing updateListing(HouseListing listing, long id)
    {
        HouseResponse response = null;
        try {
            response = blockingStub.updateListing(HouseResponse.newBuilder()
                    .setConstructionYear(listing.getConstructionYear())
                    .setLastRebuilt(listing.getLastRebuilt())
                    .setHasInspection(listing.isHasInspection())
                    .setGroundArea(listing.getGroundArea())
                    .setFloorArea(listing.getFloorArea())
                    .setAddress(AddressMessage.newBuilder().setStreet(listing.getAddress().getStreet()).setHouseNo(listing.getAddress().houseno)
                            .setCity(listing.getAddress().city).setPostNumber(listing.getAddress().postnumber).build())
                    .addAllImages(HouseListing.getAllImageFileMessages(listing.getImages()))
                    .setPrice((double)listing.getPrice())
                    .setUserEmail(listing.getUserEmail())
                    .setDescription(listing.getDescription())
                    .build());
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
            return null;
        }
        return new HouseListing(response.getId(),new Address(response.getAddress().getStreet(), response.getAddress().getPostNumber(), response.getAddress().getCity(),
                response.getAddress().getHouseNo()), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(),
                response.getFloorArea(), ImageFile.fromGrpc(response.getImagesList()), response.getPrice(), response.getUserEmail(), response.getDescription());

    }
@Override
    public ArrayList<HouseListingShort> getHouseListingsByEmail(String email) {

        ArrayList<HouseListingShort> listingShorts=new ArrayList<>();

            EmailRequest request= EmailRequest.newBuilder().setEmail(email).build();

            Iterator<ShortListingResponse> response;

            response = blockingStub.getListingsByEmail(request);
    return getHouseListingShorts(listingShorts, response);
}

    private ArrayList<HouseListingShort> getHouseListingShorts(ArrayList<HouseListingShort> listingShorts, Iterator<ShortListingResponse> response) {
        while(response.hasNext()) {
            ShortListingResponse listing = response.next();
            listingShorts.add(new HouseListingShort(listing.getId(),
                    new ImageFile(listing.getImage().getImageBase64Data(), listing.getImage().getImageFileName(),listing.getImage().getImageContentType()),
                    new Address(listing.getAddress().getStreet(), listing.getAddress().getPostNumber(), listing.getAddress().getCity(),
                            listing.getAddress().getHouseNo()), listing.getPrice()));
        }
        return listingShorts;
    }
}

