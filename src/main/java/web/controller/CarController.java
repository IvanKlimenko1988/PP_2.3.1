package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> carList;

    @GetMapping("/cars")
    public String showAllCars(Model model) {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "red", 7));
        carList.add(new Car("Volvo", "blue", 90));
        carList.add(new Car("KIA", "white", 2020));
        carList.add(new Car("Mazda", "black", 6));
        carList.add(new Car("Ford", "gray", 8));
        model.addAttribute("cars", carList);
        return "cars";
    }

    @GetMapping("/cars?={count}")
    public String showCountCar(@RequestParam("count") int count, Model model) {
        //получим список машин
        List<Car> resultList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            resultList.add(carList.get(i));
        }
        model.addAttribute("countCar", resultList);
        return "countCar";
    }

}
