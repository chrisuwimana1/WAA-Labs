package com.uwimana.controller;

import com.uwimana.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdviceController {

    @Autowired
    AdviceService adviceService;

    @RequestMapping(value={"/advice"}, method = RequestMethod.GET)
    public String showLoginForm(Model model) throws Exception {

        model.addAttribute("roasts", adviceService.getAllRoasts());
        return "advice";
    }

    @RequestMapping (value="/advice",method = RequestMethod.POST)
    public String adviceList( Integer roastKey, Model model) throws Exception {
        String roast = adviceService.getRoast(roastKey);
        List<String> roastList  = adviceService.getListByType(roast);

        model.addAttribute("roast",roast);
        model.addAttribute("roastList",roastList);

        return "display" ;

    }





}
