package teste.api.rickmorty.integrations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {

    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;

}
