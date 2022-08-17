package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceImpl;

import java.util.Optional;

@Controller
@ComponentScan("web")
public class CarsController {
    private final ServiceImpl serviceImpl;

    public CarsController(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }


    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
    model.addAttribute("cars", serviceImpl.getCars(count.orElse(0)));
    return "cars";
}

}
