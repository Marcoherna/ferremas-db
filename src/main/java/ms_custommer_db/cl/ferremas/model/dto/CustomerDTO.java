package ms_custommer_db.cl.ferremas.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class CustomerDTO {

    @JsonProperty("customer_id")
    private Long id;
    @JsonProperty("customer_username")
    private String username;
    @JsonProperty("customer_name")
    private String name;
    @JsonProperty("customer_last_name")
    private String lastName;
    @JsonProperty("customer_email")
    private String email;


}
