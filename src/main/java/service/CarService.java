package service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CarRepository;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public void printAllCars() {
        List<Car> cars = carRepository.findAll();

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
