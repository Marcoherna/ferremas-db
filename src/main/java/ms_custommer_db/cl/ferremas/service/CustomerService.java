package ms_custommer_db.cl.ferremas.service;

import ms_custommer_db.cl.ferremas.model.entities.Customer;
import ms_custommer_db.cl.ferremas.model.entities.DatosCustomer;
import ms_custommer_db.cl.ferremas.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> selectAllCustomers() {
        List<Customer>  listaCustomers = customerRepository.findAll();
        return listaCustomers;
    }

    public Customer selectIdCustomer(Long id){
        Customer customer = customerRepository.getReferenceById(id);
        return customer;
    }

    public Customer addCustomer(DatosCustomer datosCustomer){
        Customer customer = new Customer();
        customer.setUsername(datosCustomer.username());
        customer.setPassword(datosCustomer.password());
        customer.setName(datosCustomer.name());
        customer.setLastName(datosCustomer.lastname());
        customer.setEmail(datosCustomer.email());

        customerRepository.save(customer);

        return customer;
    }


}
