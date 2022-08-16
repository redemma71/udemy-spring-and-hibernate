package com.chadcover.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
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
    public String letsShoutDue(HttpServletRequest request, Model model) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        firstName = firstName.toUpperCase();
        lastName = lastName.toUpperCase();
        String fullName = firstName + " " + lastName;
        String result = "WASSUP, " + firstName + "!";
        model.addAttribute("fullName", fullName);
        model.addAttribute("message", result);

        // playing around with an object, instead of a string
        List<String> sillyNames = new ArrayList<String>();
        sillyNames.add("Eanie");
        sillyNames.add("Meanie");
        sillyNames.add("Minie");
        sillyNames.add("Larry");
        sillyNames.add("Curly");
        sillyNames.add("Moe");
        Random rando = new Random();
        model.addAttribute("randomName", sillyNames.get(rando.nextInt(sillyNames.size())));
        return "helloworld";
    }

}
