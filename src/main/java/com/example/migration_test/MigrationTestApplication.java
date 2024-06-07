package com.example.migration_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import service.CarService;

@SpringBootApplication
public class MigrationTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MigrationTestApplication.class, args);
        CarService carService = context.getBean(CarService.class);
        carService.printAllCars();

        context.close();

        /*
        SpringApplication.run(MigrationTestApplication.class, args);
        CarService test = new CarService();
        test.printAllCars();

        Тут ловил NullPointerException
         */
    }

}
