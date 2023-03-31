package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    private List<Car> countCars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "red", 7));
        cars.add(new Car("Volvo", "blue", 90));
        cars.add(new Car("KIA", "white", 2020));
        cars.add(new Car("Mazda", "black", 6));
        cars.add(new Car("Ford", "gray", 8));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> showCountCars(int count) {
        countCars = new ArrayList<>();
        if (count > 5) {
            return getCars();
        }
        for (int i = 0; i < count; i++) {
            countCars.add(cars.get(i));
        }
        return countCars;
    }
}
