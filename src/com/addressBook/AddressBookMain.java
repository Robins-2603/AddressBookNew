package com.addressBook;

public class AddressBookMain {
    public static void main(String[] args) {
            System.out.println("--------Welcome to Address Book Program---------");
            //Creating object
            Contacts contacts = new Contacts();
            contacts.setFirstName("Robins");
            System.out.println("First Name: "+contacts.getFirstName());
            contacts.setLastName("chandna");
            System.out.println("Last Name: "+contacts.getLastName());
            contacts.setAddress("vijay nagar");
            System.out.println("Address: "+contacts.getAddress());
            contacts.setCity("Ghaziabad");
            System.out.println("City: "+contacts.getCity());
            contacts.setState("uttarPradesh");
            System.out.println("State: "+contacts.getState());
            contacts.setZipCode("201009");
            System.out.println("Pin Code: "+contacts.getZipCode());
            contacts.setContactNumber("1234567890");
            System.out.println("Contact Number: "+contacts.getContactNumber());
            contacts.setEmailAddress("robindhaka26@gmail.com");
            System.out.println("Email Address: "+contacts.getEmailAddress());
        }
}
