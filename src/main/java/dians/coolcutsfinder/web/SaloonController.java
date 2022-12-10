package dians.coolcutsfinder.web;

import dians.coolcutsfinder.model.Saloon;
import dians.coolcutsfinder.service.SaloonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


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

    @GetMapping("/saloons/{id}")
    public String viewSaloonInfo(Model model, @PathVariable Long id){
        List<Saloon> saloonList = saloonService.getAllSaloons();
        Saloon saloon = this.saloonService.getSaloonById(id);
        model.addAttribute("saloonList",saloonList);
        model.addAttribute("saloon",saloon);
        return "saloonInfo";
    }
}
