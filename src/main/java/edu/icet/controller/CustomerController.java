package edu.icet.controller;

import edu.icet.dto.CustomerDto;
import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add-customer")
    public boolean addCustomer(@RequestBody Customer customer){
       return customerService.addCustomer(customer);
    }
//
//    @PutMapping("/update-customer")
//    public void updateCustomer(@RequestBody Customer customer){
//        customerService.updateCustomer(customer);
//    }

//    @DeleteMapping("/delete-customer/{id}")
//    public void deleteCustomer(@PathVariable Integer id){
//        customerService.deleteCustomer(id);
//    }
//
//    @GetMapping("/search-customer/{id}")
//    public CustomerDto searchCustomer(@PathVariable Integer id){
//        return customerService.searchCustomer(id);
//    }

    @GetMapping("/get-all")
    public List<CustomerDto> getAll(){

        return customerService.getAll();
    }
}

