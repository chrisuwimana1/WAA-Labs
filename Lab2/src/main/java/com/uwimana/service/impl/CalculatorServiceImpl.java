package com.uwimana.service.impl;

import com.uwimana.domain.Calculator;
import com.uwimana.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

//    private Calculator calculator;
//
////    @Autowired
////    public CalculatorServiceImpl(Calculator calculator){
////        this.calculator = calculator;
////    }
    public void add(Calculator calc){
         calc.add();
    }
    public void mult(Calculator calc){
        calc.mult();
    }

}
