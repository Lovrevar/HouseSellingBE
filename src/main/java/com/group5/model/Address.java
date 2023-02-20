package com.group5.model;

public class Address {
    public String street;
    public int postnumber;
    public String city;
    public int houseno;

    public Address(String street, int postnumber, String city, int houseno)
    {
        this.street = street;
        this.postnumber = postnumber;
        this.city = city;
        this.houseno = houseno;
    }

    public String getStreet() {
        return street;
    }

    public int getPostnumber() {
        return postnumber;
    }

    public String getCity() {
        return city;
    }

    public int getHouseno() {
        return houseno;
    }
}
