package com.group5.controller;


import com.group5.model.HouseListingCreationDTO;
import com.group5.model.HouseListing;
import com.group5.model.HouseListingShort;
import com.group5.service.implementations.HouseListingServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/listing")
public class HouseListingController {
    private HouseListingServiceImpl houseListingService;
    public HouseListingController(HouseListingServiceImpl houseListingService)
    {
        this.houseListingService=houseListingService;
    }

    @GetMapping("/houselisting/{id}")
    public HouseListing getHouseListingById(@PathVariable("id") long id){
        return houseListingService.getHouseListingById(id);
    }

    @GetMapping("/houselisting")
    public ArrayList<HouseListingShort> getHousingListings(@RequestParam("maxPrice") Optional<String> maxPrice,
                                                           @RequestParam("minArea")Optional<String> minArea,
                                                           @RequestParam("city")Optional<String> city){
        return houseListingService.getHouseListings(maxPrice,minArea,city);
    }
    @GetMapping("/mylistings")
    public ArrayList<HouseListingShort> getHousingListingsByEmail(@RequestParam("email") String email){
        return houseListingService.getHouseListingsByEmail(email);
    }
    
    @PostMapping(value= "/houselisting" , consumes = "application/json;charset=UTF-8" )
    public HouseListing addHousingListing(@RequestBody HouseListingCreationDTO dto)
    {
        return houseListingService.addListing(dto);
    }

    @PutMapping(value= "/houselisting/{id}" , consumes = "application/json;charset=UTF-8" )
    public HouseListing updateListing(@RequestBody HouseListing listing, @PathVariable long id)
    {
        return houseListingService.updateListing(listing,id);
    }
}
