package com.example.migration_test.repository;

import com.example.migration_test.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository  extends JpaRepository<Car, Long> {

}
