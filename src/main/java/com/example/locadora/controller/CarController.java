package com.example.locadora.controller;

import com.example.locadora.Car.Car;
import com.example.locadora.Car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarRepository repository;
    @GetMapping
    public List<Car> getAll(){

        List<Car> carList = repository.findAll();
        return carList;

    }
}
