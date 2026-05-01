package com.raul.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import models.User;



@Controller
public class UserController {
    @GetMapping("/details")    
    public String details(
        Model model,
        Map<String, Object> map
    ) {
        // You can use both Model and Map to pass data to the view, they are essentially the same
        // model.addAttribute("title", "Hola Spring Boot");
        // model.addAttribute("name", "Raul");
        // map.put("age", 30);
        User user = new User("Raul", "Hernandez");
        // user.setEmail("raul.hernandez@example.com");
        model.addAttribute("title", "Esto es un título");
        model.addAttribute("user", user);
        // Retorna el nombre de la plantilla Thymeleaf que se va a renderizar, en este caso "details.html"
        return "details";
    }

    @GetMapping("/list")
    public String list(
        ModelMap model
    ) {
        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
            new User("Raul", "Hernandez"),
            new User("Maria", "Gomez", "maria.gomez@example.com"), 
            new User("Juan", "Perez")
        );
    }
    
}
