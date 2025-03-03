package fr.wayUp.cleanArchitecture_demo.application.usecase.staff;

import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import fr.wayUp.cleanArchitecture_demo.domain.repository.StaffRepository;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.repository.jpa.StaffJpaRepository;

import java.util.Optional;

public class GetStaffUseCase {
    private final StaffRepository staffRepository;


    public GetStaffUseCase(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Optional<Staff> execute(Long id){return this.staffRepository.findStaffById(id);}



}
