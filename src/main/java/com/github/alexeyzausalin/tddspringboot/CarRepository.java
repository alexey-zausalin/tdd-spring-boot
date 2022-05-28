package com.github.alexeyzausalin.tddspringboot;

import com.github.alexeyzausalin.tddspringboot.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

    Car findByName(String name);
}
