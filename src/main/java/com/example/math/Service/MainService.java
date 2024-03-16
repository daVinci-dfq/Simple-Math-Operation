package com.example.math.Service;

import org.springframework.stereotype.Service;

@Service

public class MainService {
    public Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    public Double subtract(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiply(Double num1, Double num2) {
        return num1 * num2;
    }

    public Object divide(Double num1, Double num2) {
        return num1 / num2;
    }
}
