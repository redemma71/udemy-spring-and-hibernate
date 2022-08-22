package com.chadcover.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import static com.chadcover.springdemo.mvc.UtilityMethods.castToTitleCase;



@Controller
@RequestMapping("/person")
public class PersonController {
    @Value("#{footballTeams}")
    private Map<String,String> footballTeams;

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // TODO: create a new person object
        Person person = new Person();

        // TODO: add person to the model
        model.addAttribute("person", person);

        // TODO: add football teams map
        model.addAttribute("footballTeams", footballTeams);

        return "person-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("person") Person person) {
        System.out.println("firstName: " + castToTitleCase(person.getFirstName()));
        System.out.println("lastName: " + castToTitleCase(person.getLastName()));
        System.out.println("footballTeam: " + person.getFootballTeam());
        return "person";
    }


}
