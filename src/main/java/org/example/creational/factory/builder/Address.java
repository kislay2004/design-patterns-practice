package org.example.creational.factory.builder;

public class Address {

    String addressLine1;
    String addressLine2;
    String addressLine3;
    String city;
    String state;
    String zip;

    public Address(){
        this.addressLine1 = "Default Address";
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", addressLine3='" + addressLine3 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    public Address(String addressLine1, String addressLine2, String addressLine3, String city, String state, String zip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


}
