package fr.wayUp.cleanArchitecture_demo.web.DTO;

import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ServiceDTO {
    private Long id ;
    private String speciality ;
    private Staff responsible ;

    @Override
    public String toString() {

            return "ServiceDTO{" +
                    "id=" + id +
                    ", speciality='" + speciality + '\'' +
                    ", responsible=" + (responsible != null ? responsible.toString() : "null") +
                    '}';

    }
}
