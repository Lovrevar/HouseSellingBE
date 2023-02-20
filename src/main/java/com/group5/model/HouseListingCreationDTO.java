package com.group5.model;

import com.group5.proto.Listing.ImageFileMessage;

import java.util.ArrayList;
import java.util.List;

public class HouseListingCreationDTO {
    private Address address;
    private int ConstructionYear;
    private int LastRebuilt;
    private boolean HasInspection;
    private double GroundArea;
    private double FloorArea;
    private List<ImageFile> images;
    private long price;

    private String description;
    private String email;
    public HouseListingCreationDTO(Address address, int ConstructionYear, int LastRebuilt, boolean HasInspection, double GroundArea,
                                   double FloorArea, List<ImageFile> images, long price, String description, String email)
    {
        this.address = address;
        this.ConstructionYear = ConstructionYear;
        this.LastRebuilt = LastRebuilt;
        this.HasInspection = HasInspection;
        this.GroundArea = GroundArea;
        this.FloorArea = FloorArea;
        this.images = images;
        this.price = price;
        this.description=description;
        this.email=email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getConstructionyear() {
        return ConstructionYear;
    }

    public void setConstructionyear(int constructionyear) {
        this.ConstructionYear = constructionyear;
    }

    public int getLastrebuilt() {
        return LastRebuilt;
    }

    public void setLastrebuilt(int lastrebuilt) {
        this.LastRebuilt = lastrebuilt;
    }

    public boolean isHasinspection() {
        return HasInspection;
    }

    public void setHasinspection(boolean hasinspection) {
        this.HasInspection = hasinspection;
    }

    public double getGroundarea() {
        return GroundArea;
    }

    public void setGroundarea(double groundarea) {
        this.GroundArea = groundarea;
    }

    public double getFloorarea() {
        return FloorArea;
    }

    public void setFloorarea(double floorarea) {
        this.FloorArea = floorarea;
    }

    public List<ImageFile> getImages() {
        return images;
    }

    public void setImages(List<ImageFile> images) {
        this.images = images;
    }

    public long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public void setPrice(long price) {
        this.price = price;
    }



}
