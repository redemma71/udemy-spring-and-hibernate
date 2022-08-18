package com.chadcover.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.chadcover.springdemo.mvc.UtilityMethods.castToTitleCase;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String letsShoutDude(@RequestParam("firstName") String firstName, Model model) {
        firstName = castToTitleCase(firstName);
        String result = "WASSUP, " + firstName + "!";
        model.addAttribute("message", result);
        model.addAttribute("firstName", firstName);
        return "helloworld";
    }

}
