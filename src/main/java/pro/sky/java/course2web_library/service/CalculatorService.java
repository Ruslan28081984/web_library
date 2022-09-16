package pro.sky.java.course2web_library.service;

import org.springframework.stereotype.Service;


public interface CalculatorService {
    public int plus(Integer a, Integer b);
    public int minus(Integer a, Integer b);
    public int multiply(Integer a, Integer b);
    public double divide(Integer a, Integer b);
}
