package com.kei.kei.employee.service;

import com.kei.kei.employee.model.Employee;
import com.kei.kei.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee store(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> findEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

}
