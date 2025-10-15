package com.xworkz.internalWorkingOfSpringBoot.controller;

import com.xworkz.internalWorkingOfSpringBoot.dto.DoctorDTO;
import com.xworkz.internalWorkingOfSpringBoot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;


    @GetMapping("/doctor")
    public List<DoctorDTO> getDoctors(){
        return doctorService.getAllDoctor();
    }

    @GetMapping("/doctor/{name}")
    public DoctorDTO getDoctor(@PathVariable String name){
    if(name.equals("abhi")){
        return new DoctorDTO(1,"abhi","abhi@gmail.com");
    }
       return new DoctorDTO(12,"****","********");
    }
}
