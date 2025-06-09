package ms_custommer_db.cl.ferremas.controller;

import ms_custommer_db.cl.ferremas.model.entities.Customer;
import ms_custommer_db.cl.ferremas.model.entities.DatosCustomer;
import ms_custommer_db.cl.ferremas.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping()
    public List<Customer> selectAllCustomers() {

        return customerService.selectAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer selectCustomerId(@PathVariable Long id){
        return customerService.selectIdCustomer(id);

    }
//    @PostMapping("/?username={username}&password={password}&name={name}&lastname={lastname}&email={email}")
//    public String addCustomercontroller(@PathVariable username,@PathVariable password, name, lastname, email){
//        Customer customer = new Customer(username, password, name, lastname, email);
//        customerService.addCustomer(
//                customer.getUsername(), customer.getPassword(), customer.getName(),
//                customer.getLastName(), customer.getEmail());
//        return "Customer added";
//    }

    @PostMapping
    public ResponseEntity<String> addCustomer(@RequestBody DatosCustomer datosCustomer){
        customerService.addCustomer(datosCustomer);
        String response = "Customer: " + datosCustomer.username() +" added";
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
