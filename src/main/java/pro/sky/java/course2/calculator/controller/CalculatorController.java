package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showCalculatorPlus(@RequestParam(required = false) Integer num1,
                                     @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введено не корректное значение!";
        int plus = calculatorService.Plus(num1, num2);
        return num1 + " + " + num2 + " = " + plus;
    }

    @GetMapping("/minus")
    public String showCalculatorMinus(@RequestParam(required = false) Integer num1,
                                      @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введено не корректное значение!";
        int minus = calculatorService.Minus(num1, num2);
        return num1 + " + " + num2 + " = " + minus;
    }

    @GetMapping("/multiply")
    public String showCalculatorMultiply(@RequestParam(required = false) Integer num1,
                                         @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введено не корректное значение!";
        int multiply = calculatorService.Multiply(num1, num2);
        return num1 + " + " + num2 + " = " + multiply;
    }

    @GetMapping("/divide")
    public String showCalculatorDivide(@RequestParam(required = false) Integer num1,
                                       @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введено не корректное значение!";
        if(num2 == 0) return "На ноль делить нельзя!";
        int divide = calculatorService.Divide(num1, num2);
        return num1 + " + " + num2 + " = " + divide;
    }

}
