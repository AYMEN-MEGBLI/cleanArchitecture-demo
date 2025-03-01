package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.repository;
import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import fr.wayUp.cleanArchitecture_demo.domain.repository.StaffRepository;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.repository.jpa.StaffJpaRepository;
import fr.wayUp.cleanArchitecture_demo.web.DTO.StaffDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import  fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper.StaffMapper;

import java.util.List;
import java.util.Optional;

@Repository
public class SatffRepoImp  implements StaffRepository {

    private final StaffJpaRepository staffRepo;

    public SatffRepoImp(StaffJpaRepository staffRepo) {
        this.staffRepo = staffRepo;
    }

    @Override
    public StaffDTO save(StaffDTO staff) {
        return  StaffMapper.toDTO(staffRepo.save(StaffMapper.toEntity(staff)));
    }

    @Override
    public List<Staff> findAllStaff() {
        // to domain
        return staffRepo.findAll()
                .stream()
                .map(StaffMapper :: toDomain)
                .toList();
    }

    @Override
    public Optional<Staff> findStaffById(Long id) {
        return staffRepo.findById(id)
                .map(StaffMapper::toDomain);

    }
    @Override
   public  void   deleteStaffById(Long id) {
        staffRepo.deleteById(id);

    }
}
