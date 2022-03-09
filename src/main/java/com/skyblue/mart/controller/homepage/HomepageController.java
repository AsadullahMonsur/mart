package com.skyblue.mart.controller.homepage;

import com.skyblue.mart.model.drawer.type.CustomerType;
import com.skyblue.mart.model.other.Data;
import com.skyblue.mart.model.other.Selection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("view")
public class HomepageController{
    private CustomerType ct;
    private int counter = 0;
    public HomepageController() {
        System.out.println("UI Processing");
        ct = new CustomerType();
    }

    @RequestMapping("home")
    private String display(Model model) {
        System.out.println("processing Request for Reload");
        System.out.println("counter: "+counter);
        counter++;
        model.addAttribute("data",
                            new Data());
        model.addAttribute("customer_type", ct);
        model.addAttribute("all_options",ct.getAll_options());
        model.addAttribute("options",ct.getOptions());
        model.addAttribute("all_options_check_flag",
                            ct.getAll_options_check_flag());
        model.addAttribute("options_check_flag",
                            ct.getOptions_check_flag());

        return "homepage";
    }

    @PostMapping("home")
    public String add(@Valid Data data, BindingResult bindingResult) {
        System.out.println("search value");
        System.out.println(data.toString());

        return "redirect:/view/home";
    }

    @RequestMapping("/home/do")
    public String delete(CustomerType ct,BindingResult result){
       System.out.println(ct.getOptions());
        System.out.println("checked data");
       return "redirect:/view/home";
    }
}