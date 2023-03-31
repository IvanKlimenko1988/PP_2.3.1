package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO {
    private List<Car> cars;

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
        List<Car> result = new ArrayList<>();
        if (count > 5) {
            return getCars();
        }
        for (int i = 0; i < count; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}
