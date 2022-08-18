package com.chadcover.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.chadcover.springdemo.mvc.UtilityMethods.castToTitleCase;

@Controller
@RequestMapping("/silly")
public class SillyController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "silly-form";
    }

    @RequestMapping("/processForm")
    public String showSillyForm(@RequestParam("name") String name, Model model) {;
        model.addAttribute("message", "Wassup, Baltimore!");
        name = castToTitleCase(name);
        model.addAttribute("name", name);
        return "silly";
    }

}
