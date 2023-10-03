package app.controllers;

import app.services.calculation.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        if (name != null || surname != null) {
            model.addAttribute("message", "Hello, " + name + " " + surname);
        } else {
            model.addAttribute("message", "Hello, stranger!");
        }
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculation(@RequestParam(value = "a") String a,
                              @RequestParam(value = "b") String b,
                              @RequestParam(value = "action") String action,
                              Model model,
                              @Autowired CalculationService calculationService) {

        int firstInt = Integer.parseInt(a);
        int secondInt = Integer.parseInt(b);

        System.out.println(calculationService.map);
        System.out.println(calculationService);

        model.addAttribute("message", firstInt + " " +
                calculationService.getActionSign(action) +
                " " + secondInt + " = " +
                calculationService.calculate(firstInt, secondInt, action));

        return "first/calculation";
    }
}
