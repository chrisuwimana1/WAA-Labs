package com.uwimana.controller;

import com.uwimana.domain.Calculator;
import com.uwimana.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Lab3/CalculatorLab3/src/main/webapp/WEB-INF/views/calculator.jsp
@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

//    public void setCalculatorService(CalculatorService calculatorService) {
//        this.calculatorService = calculatorService;
//    }

    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String showForm(Calculator calculator) throws Exception{
        //return new ModelAndView("calculator", "calculator", new Calculator());
        return "calculator";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public String calculate(Calculator calculator) throws Exception{

//        model.addAttribute("num1", calculator.getNum1());
//        model.addAttribute("num2", calculator.getNum2());
//        model.addAttribute("num3", calculator.getNum3());
//        model.addAttribute("num4", calculator.getNum4());
//
//        model.addAttribute("sum", calculatorService.getSum());
//        model.addAttribute("product", calculatorService.getProduct());
        calculatorService.add(calculator);
        calculatorService.mult(calculator);

        return "result";
    }

}
