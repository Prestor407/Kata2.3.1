package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(2000, "Kia", 120));
        cars.add(new Car(2025, "BMW", 695));
        cars.add(new Car(2010, "Audi", 300));
        cars.add(new Car(2002, "Ford", 95));
        cars.add(new Car(1965, "Honda", 228));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0) {
            count = 0;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
