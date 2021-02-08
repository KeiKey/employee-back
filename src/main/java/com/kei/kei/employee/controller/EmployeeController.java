package com.kei.kei.employee.controller;

import com.kei.kei.employee.model.Employee;
import com.kei.kei.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * TODO:
 * Work on functions naming convention for Spring for Controllers and Services
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> index() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> show(
            @PathVariable("id") Long id
    ) {
        Optional<Employee> employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<Optional<Employee>>(employee, HttpStatus.OK);
    }

    /**
     * TODO:
     * Fix why the pfp url doesnt go throw -> Saving+update
     */
    @PostMapping("/create")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.store(employee), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> update(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.update(employee), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(
            @PathVariable("id") Long id
    ) {
        employeeService.delete(id);
    }

}
