package org.wecancodeit.virtualpet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.Models.Pet;
import org.wecancodeit.virtualpet.Models.Shelter;
import org.wecancodeit.virtualpet.Models.Volunteer;
import org.wecancodeit.virtualpet.Repository.PetRepository;
import org.wecancodeit.virtualpet.Repository.ShelterRepository;
import org.wecancodeit.virtualpet.Repository.VolunteerRepository;

import jakarta.annotation.Resource;

@Controller
public class ShelterController {
    @Resource
    private ShelterRepository shelterRepository;
    @Resource
    private PetRepository petRepository;
    @Resource
    private VolunteerRepository volunteerRepository;

    @RequestMapping({ "/shelters", "/", "" })
    public String displayShelters(Model model) {
        model.addAttribute("shelters", shelterRepository.findAll());
        return "sheltersView";
    }

    @RequestMapping({ "/shelter/{id}" })
    public String displaySingleShelter(@PathVariable Long id, Model model) {
        Shelter shelter = shelterRepository.findById(id).get();
        model.addAttribute("shelter", shelter);
        return "shelterView";
    }

    @RequestMapping({ "/pets/{id}" })
    public String displaySinglePet(@PathVariable Long id, Model model) {
        Pet pet = petRepository.findById(id).get();
        model.addAttribute("pet", pet);
        return "petView";
    }
    @RequestMapping({"/volunteers/{id}"})
    public String displaySingleVolunteer(@PathVariable Long id, Model model) {
        Volunteer volunteer = volunteerRepository.findById(id).get();
        model.addAttribute("volunteer", volunteer);
        return "volunteerView";
    }
}
