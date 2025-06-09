package ms_custommer_db.cl.ferremas.model.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosCustomer(
        @JsonAlias("username") String userName,
        String password,
        String name,
        @JsonAlias("lastname") String lastName,
        String email
) {
}
