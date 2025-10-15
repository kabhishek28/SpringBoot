package com.xworkz.internalWorkingOfSpringBoot.repository;

import com.xworkz.internalWorkingOfSpringBoot.dto.DoctorDTO;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class DoctorRepositoryImpl implements DoctorRepository{

    @Override
    public List<DoctorDTO> getAllData() {
        System.out.println("data base");
        List<DoctorDTO> doctorDTOS = new ArrayList<>();
        DoctorDTO doctorDTO = new DoctorDTO(1,"abhi","abhi@gmail.com");
        DoctorDTO doctorDTO1 = new DoctorDTO(2,"amith","amith@gmail.com");
        doctorDTOS.add(doctorDTO);
        doctorDTOS.add(doctorDTO1);
        return doctorDTOS;
    }
}
