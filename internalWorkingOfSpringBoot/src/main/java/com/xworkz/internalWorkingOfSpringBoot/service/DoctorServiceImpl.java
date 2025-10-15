package com.xworkz.internalWorkingOfSpringBoot.service;

import com.xworkz.internalWorkingOfSpringBoot.dto.DoctorDTO;
import com.xworkz.internalWorkingOfSpringBoot.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    @Cacheable("doctor")
    public List<DoctorDTO> getAllDoctor() {

        return doctorRepository.getAllData();
    }
}
