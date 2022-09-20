package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/calculator")
    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }

}
