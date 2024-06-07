package com.example.migration_test;

import com.example.migration_test.service.CarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class MigrationTestApplication {
    private final CarService carService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MigrationTestApplication.class, args);
        carService.printAllCars();

        context.close();
    }
}