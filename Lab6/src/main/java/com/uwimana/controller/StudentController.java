package com.uwimana.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uwimana.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value="/registration",method=RequestMethod.GET)	
	    public String showForm(@ModelAttribute("student") Student student, Model model){
	    	
 	        return "registration";
	    }
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)	
	    public String processForm(@Valid @ModelAttribute("student") Student student,
	    		BindingResult bindingResult,  Model model){
 
              if(bindingResult.hasErrors()){
            	  return "registration";
              }
              
              //save student
              model.addAttribute("student", student);
              
             return "success";
 
	
	    }
	    
	}

	

