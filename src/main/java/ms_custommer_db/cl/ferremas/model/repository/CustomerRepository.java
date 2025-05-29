package ms_custommer_db.cl.ferremas.model.repository;

import ms_custommer_db.cl.ferremas.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
