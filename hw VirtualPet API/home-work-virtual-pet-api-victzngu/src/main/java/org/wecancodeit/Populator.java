package org.wecancodeit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.virtualpet.Models.Pet;
import org.wecancodeit.virtualpet.Models.Shelter;
import org.wecancodeit.virtualpet.Models.Volunteer;
import org.wecancodeit.virtualpet.Repository.PetRepository;
import org.wecancodeit.virtualpet.Repository.ShelterRepository;
import org.wecancodeit.virtualpet.Repository.VolunteerRepository;

import jakarta.annotation.Resource;

//component runs with commandlinerunner every time the DB is launched
@Component
public class Populator implements CommandLineRunner {
    
    //we don't need to do the new arraylist, resource automates for us
    //resource injects those dependencies 
    @Resource
    private PetRepository petRepository;

    @Resource
    private ShelterRepository shelterRepository;

    @Resource
    private VolunteerRepository volunteerRepository;

    @Override
    public void run(String... args) throws Exception {
        Volunteer volunteer1 = new Volunteer("Midori Smith", "703-666-5555", "midorismith@gmail.com", "2222 Cedar Ave", "Greenwich", "California");
        Volunteer volunteer2 = new Volunteer("Evelynn Brand", "571-222-1010", "evelynn123@gmail.com", "234 Apple Lane", "Arlington", "Texas" );
        Volunteer volunteer3 = new Volunteer("Julian Menas", "703-234-0000", "jujudmv@yahoo.com", "700 West Palm St", "Gosling", "New Jersey");
        Volunteer volunteer4 = new Volunteer("Cassidy Little", "202-700-1010", "lovebug@gmail.com", "2002 Highlander Dr", "Forks", "Washington");
        volunteerRepository.save(volunteer1);
        volunteerRepository.save(volunteer2);
        volunteerRepository.save(volunteer3);
        volunteerRepository.save(volunteer4);
        Shelter shelter1 = new Shelter("Freedom Center", 6, "888-600-5000", "www.FreedomCenter.com", "606 Freedom Blvd", "Maryland", volunteer1, volunteer2);
        Shelter shelter2 = new Shelter("Friends of Animals", 5, "888-444-3333", "www.FriendsofAnimals.com", "456 Lee Hwy", "Florida", volunteer2, volunteer4);
        Shelter shelter3 = new Shelter("Fairfax Fur babies", 8, "888-909-8080", "www.Ffxfurbabies.com", "667 Sunrise Valley Rd", "Georgia", volunteer3, volunteer4);
        shelterRepository.save(shelter1);
        shelterRepository.save(shelter2);
        shelterRepository.save(shelter3);
        Pet pet1 = new Pet("Khaleesi", "Dog", true, 100, 100, shelter1);
        Pet pet2 = new Pet("Asia", "Dog", true, 60,40, shelter1);
        Pet pet3 = new Pet("Bowser", "Cat", false, 50, 60, shelter3);
        Pet pet4 = new Pet("Bella", "Cat", false, 50, 70, shelter2);
        Pet pet5 = new Pet("Ryker", "Dog", true, 60, 80, shelter2);
        petRepository.save(pet1);
        petRepository.save(pet2);
        petRepository.save(pet3);
        petRepository.save(pet4);
        petRepository.save(pet5);
    }
}