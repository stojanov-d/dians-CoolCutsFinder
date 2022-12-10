package dians.coolcutsfinder.web;

import dians.coolcutsfinder.model.Saloon;
import dians.coolcutsfinder.service.SaloonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class SaloonController {

    private final SaloonService saloonService;

    public SaloonController(SaloonService saloonService) {
        this.saloonService = saloonService;
    }

    @GetMapping("/saloons")
    public String showSaloons(Model model){
        model.addAttribute("saloons",saloonService.getAllSaloons());
        return "saloons";
    }
}
