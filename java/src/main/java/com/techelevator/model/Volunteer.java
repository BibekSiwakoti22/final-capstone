package com.techelevator.model;

import javax.validation.constraints.NotEmpty;

public class Volunteer {

    private int volunteerId;
    @NotEmpty
    private String phoneNumber;
    @NotEmpty
    private String address;

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}