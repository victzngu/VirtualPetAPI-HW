package org.wecancodeit.virtualpet.Models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Volunteer {
    
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private String streetAddress;
    private String city;
    private String state;

    @Id
    @GeneratedValue
    private long id;

    @ManyToMany (mappedBy = "volunteers")
    private Collection<Shelter> shelters;

    protected Volunteer(){
    }

    public Volunteer(String fullName, String phoneNumber, String emailAddress, String streetAddress, String city, String state) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return emailAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Volunteer [fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
                + ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + "]";
    }


    
}
