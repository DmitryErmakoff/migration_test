package com.example.migration_test.service;

import lombok.RequiredArgsConstructor;
import com.example.migration_test.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.migration_test.repository.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    @Autowired
    private final CarRepository carRepository;

    public void printAllCars() {
        List<Car> cars = carRepository.findAll();

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
