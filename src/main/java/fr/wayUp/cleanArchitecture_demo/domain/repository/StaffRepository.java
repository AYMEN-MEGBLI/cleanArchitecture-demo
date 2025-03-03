package fr.wayUp.cleanArchitecture_demo.domain.repository;
import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity.StaffEntity;
import fr.wayUp.cleanArchitecture_demo.web.DTO.StaffDTO;

import java.util.List;
import java.util.Optional;

public interface StaffRepository {
    StaffDTO save(StaffDTO staff);
    List<Staff> findAllStaff();
    Optional<Staff>  findStaffById(Long id);
    void  deleteStaffById(Long id);



}
