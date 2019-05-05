package com.uwimana.controller;

import java.io.IOException;

import com.uwimana.domain.Calculator;
import com.uwimana.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value = {"/", "/calculator"}, method = RequestMethod.GET)
    public String showCalcForm() throws Exception {

        return "calculator";
    }

    @RequestMapping(value= "/calculator" , method = RequestMethod.POST)
    public String handleCalc(Calculator calculator, Model model, RedirectAttributes redirectAttributes ) throws Exception {

        if (calculator.getNum1() != null &&
                calculator.getNum2() != null)
            calculatorService.add(calculator);

        if (calculator.getNum3() != null &&
                calculator.getNum4() != null)
            calculatorService.mult(calculator);

        redirectAttributes.addFlashAttribute( "calculator", calculator);
        String heading = "Nice Job, Christian!";
        redirectAttributes.addAttribute( "heading","Christian!");
        //redirectAttributes.addAttribute(heading);

        return "result" ;
    }
}
