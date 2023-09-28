package com.ventas.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/")
    public String inicio() {
        return "hola wey";
    }

}
