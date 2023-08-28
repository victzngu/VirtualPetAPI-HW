package org.wecancodeit.virtualpet.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Shelter {
    @Id
    @GeneratedValue
    private long id;

private String shelterName;
private int capacityOfPets;
private String phoneNumber;
private String website;
private String address;
private String state;

    @ManyToMany(cascade = CascadeType.MERGE)
    private Collection<Volunteer> volunteers;

    @OneToMany(mappedBy = "shelter")
    private Collection<Pet> pets;


    //Default constructor used by JPA
    public Shelter(String shelterName, int capacityOfPets, String phoneNumber, String website, String address, String state, Volunteer...volunteers) {
        this.shelterName = shelterName;
        this.capacityOfPets = capacityOfPets;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.address = address;
        this.state = state;
        this.volunteers = new ArrayList<Volunteer>(Arrays.asList(volunteers));
    }

    protected Shelter(){
        
    }

    public Collection<Pet> getPets() {
        return pets;
    }

    public Collection<Volunteer> getVolunteers(){
        return volunteers;
    }

    public long getId() {
        return id;
    }

    public String getShelterName() {
        return shelterName;
    }

    public int getCapacityOfPets() {
        return capacityOfPets;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }

    public String getState() {
        return state;
    }


}