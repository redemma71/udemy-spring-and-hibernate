package com.chadcover.springdemo.controller;

import java.util.List;

import com.chadcover.springdemo.service.CustomerService;
import com.chadcover.springdemo.utils.SortUtils;
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
    public String listCustomers(Model model, @RequestParam(required=false) String sort) {

        List<Customer> customers = null;
        if (sort != null) {
            int theSortField = Integer.parseInt(sort);
            // get customers from the service
            customers = customerService.getCustomers(theSortField);
        } else {
            // get customers from the service
            customers = customerService.getCustomers(SortUtils.LAST_NAME);
        }

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

    @GetMapping("/delete")
    public String delete(@RequestParam("customerId") int id) {
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String searchCustomers(@RequestParam("searchName") String nameToSearch, Model model) {
     List<Customer> customers = customerService.searchCustomers(nameToSearch);
     model.addAttribute("customers",customers);
     return "list-customers";
    }

}
