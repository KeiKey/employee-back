package com.kei.kei.employee.repository;

import com.kei.kei.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /**
     * TODO:
     * Find why it doesnt work - Try delete by email
     */
//    void deleteEmployeeById(Long employeeId);

}
