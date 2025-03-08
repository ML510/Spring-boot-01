package edu.icet.contoller;

import edu.icet.model.Customer;
import edu.icet.service.custom.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  //---> @Controller + @ResponseBody + @Component
public class CustomerController {

    @Autowired
    ProductService service;

    // ******************* PathVariable **********************
    // -------> 56373372v
    @GetMapping("/search-customer/{nic}")
    public Customer getCustomer(@PathVariable String nic){
        System.out.println(nic);
        return null;
    }

    // ******************* RequestParam **********************
    // ------> wp/5364747v
    @GetMapping("/search-customer")
    public Customer getCustomer2(@RequestParam(name = "nic") String nic){ // http://localhost:8080/search-customer?nic=wp/5364747v
        System.out.println(nic);
        return null;
    }
}
