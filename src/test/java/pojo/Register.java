package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "set")
public class Register {
    private String Username;
    @JsonProperty("Email address")
    private String Emailaddress;
    private String Password;

}
