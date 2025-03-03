package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.repository.jpa;

import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.domain.repository.ServiceRepository;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServiceJpaRepository extends JpaRepository<ServiceEntity, Long> {


}

