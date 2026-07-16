package com.example.demo.controller;

import com.example.demo.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    ExcelService excelService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/save")
    @ResponseBody
    public String saveText(@RequestParam String text) {
        excelService.save(text);
        return "Saved: " + text;
    }
}
