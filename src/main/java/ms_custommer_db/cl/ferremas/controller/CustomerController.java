package ms_custommer_db.cl.ferremas.controller;

import ms_custommer_db.cl.ferremas.model.entities.Customer;
import ms_custommer_db.cl.ferremas.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> selectAllCustomers() {

        return customerService.selectAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer selectCustomerId(@PathVariable Long id){
        return customerService.selectIdCustomer(id);

    }
    @PostMapping("/customers")
    public String addCustomercontroller(
            String username,
            String password,
            String name,
            String lastname,
            String email
    ){
        customerService.addCustomer(username, password, name, lastname, email);
        return "";
    }
}
