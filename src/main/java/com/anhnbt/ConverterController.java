/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhnbt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author anhnbt
 */
@Controller
@RequestMapping("converter")
public class ConverterController {
    @GetMapping
    public String converter() {
        System.out.println("Spring Converter");
        return "index";
    }

    @PostMapping
    public String save(
            @RequestParam(name = "usd", required = true) double usd,
            @RequestParam(name = "vnd", required = true) double vnd,
            Model model) {
        double result = usd * vnd;
        model.addAttribute("result", result);
        return "index";
    }
}
