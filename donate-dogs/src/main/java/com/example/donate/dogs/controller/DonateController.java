package com.example.donate.dogs.controller;


import com.example.donate.dogs.donate.Donate;
import com.example.donate.dogs.donate.DonateRepository;
import com.example.donate.dogs.donate.DonateRequestDTO;
import com.example.donate.dogs.donate.DonateResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("donate")
public class DonateController {

    @Autowired
    private DonateRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveDonate(@RequestBody DonateRequestDTO data){
        Donate donateData = new Donate(data);
        repository.save(donateData);
        return;
    }

    @GetMapping
    public List<DonateResponseDTO> getAll(){
        List<DonateResponseDTO> donateList = repository.findAll().stream().map(DonateResponseDTO::new).toList();
        return donateList;
    }
}
