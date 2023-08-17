package org.wecancodeit.virtualpet.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.Models.Shelter;
import org.wecancodeit.virtualpet.Repository.ShelterRepository;

import jakarta.annotation.Resource;

@Controller
public class ShelterController {
    @Resource
    private ShelterRepository shelterRepository;

    @RequestMapping({"/shelters", "/", ""})
    public String displayShelters(Model model) {
        model.addAttribute("shelters", shelterRepository.findAll());
        return "sheltersView";
    }

    @RequestMapping({"/shelter/{id}"})
    public String displaySingleShelter(@PathVariable Long id, Model model) {
        Shelter shelter = shelterRepository.findById(id).get();
        model.addAttribute("shelter", shelter);
        return "shelterView";
    }
}
