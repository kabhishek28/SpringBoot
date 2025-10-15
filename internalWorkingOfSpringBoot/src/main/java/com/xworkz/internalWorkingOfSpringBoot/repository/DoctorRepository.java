package com.xworkz.internalWorkingOfSpringBoot.repository;

import com.xworkz.internalWorkingOfSpringBoot.dto.DoctorDTO;

import java.util.List;

public interface DoctorRepository {
    List<DoctorDTO> getAllData();
}
