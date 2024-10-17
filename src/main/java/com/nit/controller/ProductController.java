package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.binding.Product;

import jakarta.validation.Valid;

@Controller
public class ProductController {

    @GetMapping("/")
    public String showProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "index"; // This should point to the correct form page, such as index.html
    }

    @PostMapping("/product")
    public String saveData(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
        if (result.hasErrors()) {
        	System.out.println("****************************************************************************");
        	System.out.println(result.getAllErrors());
            return "index"; // Return the form page again with validation errors
        }

        System.out.println(product);
        model.addAttribute("msg", "Product is saved!!");

        return "index";
    }
}
