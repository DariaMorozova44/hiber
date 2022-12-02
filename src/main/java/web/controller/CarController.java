package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.dao.CarDaoimpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        CarDaoimpl carDaoimpl = new  CarDaoimpl();
        model.addAttribute("cars", carDaoimpl.getCars(count));
        return "cars";
    }
}