package com.example.insurancecard.service;

import com.example.insurancecard.dto.InformationDto;
import com.example.insurancecard.entity.Information;

import java.util.List;

public interface StaffService {

    List<InformationDto> getAll();
    InformationDto save(InformationDto information);
    InformationDto update(InformationDto information, Long id);
    boolean remove(Long id);
    InformationDto getStaffById(Long id);
    
}
