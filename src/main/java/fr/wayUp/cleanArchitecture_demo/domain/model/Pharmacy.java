package fr.wayUp.cleanArchitecture_demo.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Builder
public class Pharmacy{
private Long id ;
private Long medicationId;
private int stockQuantity ;
private Date expirationDate ;


}
