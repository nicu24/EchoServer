package com.Vikea.Vikea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/data")
@RestController
public class Controller {

    @GetMapping("/get/{message}")
    public String test(@PathVariable String message) {
        System.out.println("Serverul a fost accesat cu mesajul: "+ message);
        return "Serverul a fost accesat: "+ message;
    }
}
