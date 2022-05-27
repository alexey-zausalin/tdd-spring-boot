package com.github.alexeyzausalin.tddspringboot;

import com.github.alexeyzausalin.tddspringboot.domain.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car/{name}")
    private Car getCar(@PathVariable String name) {
        return carService.getCarDetails(name);
    }
}
