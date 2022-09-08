package com.example.insurancecard.service;

import com.example.insurancecard.dto.EmployeeDto;
import com.example.insurancecard.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAll();

    EmployeeDto save(EmployeeDto em);

    EmployeeDto update(EmployeeDto em, Long id);

    Boolean remove(Long id);
}
