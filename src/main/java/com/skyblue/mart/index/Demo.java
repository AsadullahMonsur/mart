package com.skyblue.mart.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class Demo{
    @RequestMapping("demo")
    private String display(Model model) {
        return "responsive_01";
    }
}