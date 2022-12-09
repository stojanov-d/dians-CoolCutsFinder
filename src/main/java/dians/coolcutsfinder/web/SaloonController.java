package dians.coolcutsfinder.web;

import dians.coolcutsfinder.service.SaloonService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping
//@Validated
//@CrossOrigin(origins="*")
public class SaloonController {

    private final SaloonService saloonService;
    public SaloonController(SaloonService saloonService) {
        this.saloonService = saloonService;
    }

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
