package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) String count, ModelMap model ) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> resulCar = carService.getListCar(count);
        model.addAttribute("resulCar", resulCar);
        return "cars";
    }
}
