package com.carsapi.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")

public class CarsController {

  @PostMapping
  public void RegisterCar (@RequestBody CarsDTO req){
    System.out.println(req.anoModelo());
 
}
    
}
