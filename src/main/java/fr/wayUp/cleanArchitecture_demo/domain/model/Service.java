package fr.wayUp.cleanArchitecture_demo.domain.model;


import lombok.*;

@Builder
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Service {

        private Long id ;
        private String speciality ;
        private Staff responsible;
    }
