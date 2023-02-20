package com.group5;


import com.group5.security.JwtTokenUtil;
import com.group5.service.implementations.HouseListingServiceImpl;
import com.group5.service.implementations.UserServiceImpl;
import com.group5.service.services.HouseListingService;
import com.group5.service.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HousingSiteBusinessLogicApplicationTests {

    private HouseListingService listingService = new HouseListingServiceImpl();
    private UserService userService = new UserServiceImpl();
    private JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();

	/*

	@Test
	void contextLoads() {
		DBUser dbUser = new DBUser();
		System.out.println(dbUser.getUserById(1).getEmail());
	}
	@Test
	void creatingListing(){
		BusinessLogicService service = new BusinessLogicServiceImpl();

		List<String> image64DataList = new ArrayList<>();
		image64DataList.add("image");

		List<String> imageContentTypeList = new ArrayList<>();
		imageContentTypeList.add("png");

		List<String> imageFileNameList = new ArrayList<>();
		imageFileNameList.add("picture");

		System.out.println(service.createHouseListing("Kollegievet", 8700, "Horsens", 30, 1990, 2020,
				true, 120, 120, image64DataList, imageContentTypeList, imageFileNameList, 200000));
	}

	 */
/*
    @Test
    void createListing1(){
        Address address = new Address("Street", 9000, "Aalborg", 69);
        ImageFile imageFile = new ImageFile("dfgadfg", "adfsdf", "dsafads");
        List<ImageFile> files = new ArrayList();
        files.add(imageFile);
        HouseListingCreationDTO house = new HouseListingCreationDTO(address, 1980, 1990, false, 120, 120,
                files, 450000, "", "");
        listingService.addListing(house);
    }

    @Test
    void showListings(){
        ArrayList<HouseListingShort> listings = listingService.getHouseListings(Optional.of("1200"), Optional.of("120"), Optional.of("20"));
        System.out.println(listings);
    }

    @Test
    void showListingsByCriteria(){

    }

    @Test
    void showDetailedListing(){

    }

    @Test
    void createAnAccount(){
        UserDTO user = new UserDTO("asd", "name", "surname", "ifhjas df ");
        Optional<User> user1 = userService.registerUser(user);
        System.out.println(user1);
    }

    @Test
    void updateListing(){

    }

    @Test
    void updateListing1(){

    }

    @Test
    void updateListing2(){

    }

    @Test
    void sellerSeeListings(){

    }

    @Test
    void login(){
        boolean correctCredentials = userService.Login("email", "asd");
        System.out.println(correctCredentials);
    }

 */
    @Test
    void generateJWT(){
        System.out.println(jwtTokenUtil.generateToken("MyEmail"));
    }
}