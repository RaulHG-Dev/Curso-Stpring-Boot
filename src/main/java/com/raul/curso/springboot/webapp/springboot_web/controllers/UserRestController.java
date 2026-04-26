package com.raul.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import models.dto.UserDto;


@RestController  // Esta anotación indica que esta clase es un controlador REST, lo que significa que los métodos de esta clase devolverán datos (como JSON) en lugar de vistas (como HTML)
@RequestMapping("/api")  // Esta anotación establece la ruta base para todos los métodos de este controlador, en este caso "/api/details-rest"
public class UserRestController {
    @GetMapping("/details-rest")
    public Map<String, Object> getMethodName() {
        User user = new User("Raul", "Hernandez");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Spring Boot");
        body.put("user", user);

        // Retorna un JSON con los datos del usuario, Spring Boot se encargará de convertir el Map a JSON automáticamente
        return body;
    }

    @GetMapping("/details-rest-dto")
    public UserDto getMethodNameDto() {
        UserDto userDto = new UserDto();
        User user = new User("Raul", "Hernandez");
        userDto.setName(user.getName());
        userDto.setLastname(user.getLastname());
        userDto.setTitle("Hola Spring Boot");

        // Retorna un JSON con los datos del usuario, Spring Boot se encargará de convertir el UserDto a JSON automáticamente
        return userDto;
    }
    
}
