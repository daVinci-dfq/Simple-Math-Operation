package com.example.math.Controller;

import com.example.math.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @Autowired
    MainService MainService;

    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return MainService.add(num1, num2);
    }

    @GetMapping("/subtract")
    public Double subtract(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return MainService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public Double multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return MainService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public Object divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        if (num2 != 0) {
            return MainService.divide(num1, num2);
        } else {
            return ("Division by zero is not allowed.");
        }
    }
}
