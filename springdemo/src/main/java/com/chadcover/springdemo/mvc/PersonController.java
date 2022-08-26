package com.chadcover.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

    // @InitBinder pre-processes all requests coming in from the web page.
    // add custom business logic here to handle edge & corner cases,
    // like leading whitespaces & null/all-whitespace entries
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("person", new Person());
        return "person-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("person") Person person,
            BindingResult bindingResult) {

        // console logging for learning's sake:
        System.out.println("bindingResult: " + bindingResult);
        /*
        * This will show errors in the console, for example, when lastName is blank:
        *
        * bindingResult: org.springframework.validation.BeanPropertyBindingResult: 1 errors
        *  Field error in object 'person' on field 'lastName':
        * rejected value [null];
        * codes [NotNull.person.lastName,NotNull.lastName,NotNull.java.lang.String,NotNull];
        * arguments [org.springframework.context.support.DefaultMessageSourceResolvable:
        * codes [person.lastName,lastName];
        * arguments [];
        * default message [lastName]]; default message [is required]
        * look in messages.properties, where default message is overridden, like so:
        * NotNull.person.lastName=Everyone should have a last name
        * */

        if (bindingResult.hasErrors()) {
            return "person-form";
        } else {
            return "person";
        }
    }
}
