package com.chadcover.springdemo.controller;

import java.util.List;

import com.chadcover.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.chadcover.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        // get customers from the service
        List<Customer> customers = customerService.getCustomers();

        // add customers to model
        model.addAttribute("customers", customers);

        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFowFormForAdd(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showCustomerForUpdate(@RequestParam("customerId") int id, Model model) {
        // get customer from service
        Customer customer = customerService.getCustomer(id);
        // set customer as a model to populate the form
        model.addAttribute("customer", customer);
        // send customer to update form
        return "customer-form";
    }

}
