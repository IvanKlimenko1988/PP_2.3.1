package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService {
    private CarDAO carDAO;
    @Autowired
    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCarsList() {
        return carDAO.getCars();
    }

    @Override
    public List<Car> showCountCars(int count) {
        return carDAO.showCountCars(count);
    }

}
