package com.example.studentfeedback.repository;
import java.util.List;
import com.example.studentfeedback.model.Management;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementRepository extends JpaRepository<Management, Long> {
    Management findByNameAndPasswordAndPosition(String name, String password, String position);
    List<Management> findByPosition(String position);
}
