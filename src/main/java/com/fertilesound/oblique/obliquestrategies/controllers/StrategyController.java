package com.fertilesound.oblique.obliquestrategies.controllers;

import com.fertilesound.oblique.obliquestrategies.services.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StrategyController {

    private StrategyService strategyService;

    @Autowired
    public StrategyController(StrategyService strategyService) {
        this.strategyService = strategyService;
    }

    @RequestMapping({"/", ""})
    public String showStrategy (Model model) {
        model.addAttribute("strategy", strategyService.getStrategy());

        return "obliquestrategy";
    }
}
