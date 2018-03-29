package edu.lpnu.cad.newtoncotes.controller;

import edu.lpnu.cad.newtoncotes.model.Result;
import edu.lpnu.cad.newtoncotes.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

    @Autowired
    private CalculationService calculationService;

    @GetMapping(value = "/")
    public String indexPage() {
        return "index";
    }

    @PostMapping(value = "/calculate")
    public ModelAndView indexPage(@RequestParam("function") String function,
                                  @RequestParam("min") double min,
                                  @RequestParam("max") double max,
                                  ModelAndView modelAndView) {
        modelAndView.setViewName("results");
        Result result = calculationService.calculate(function, min, max);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}
