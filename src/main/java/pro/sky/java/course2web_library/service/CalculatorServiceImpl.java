package pro.sky.java.course2web_library.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public double divide(Integer a, Integer b) {
        if (b==0) {
            throw new IllegalArgumentException(" на ноль делить нельзя, ты ввёл в делители 0 ");}
        return a / b;
    }
}
