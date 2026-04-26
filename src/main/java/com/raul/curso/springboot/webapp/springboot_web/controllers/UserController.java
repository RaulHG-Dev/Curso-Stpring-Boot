package com.raul.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    @GetMapping("/details")    
    public String details(
        Model model,
        Map<String, Object> map
    ) {
        // You can use both Model and Map to pass data to the view, they are essentially the same
        model.addAttribute("title", "Hola Spring Boot");
        model.addAttribute("name", "Raul");
        map.put("age", 30);
        // Retorna el nombre de la plantilla Thymeleaf que se va a renderizar, en este caso "details.html"
        return "details";
    }
}
