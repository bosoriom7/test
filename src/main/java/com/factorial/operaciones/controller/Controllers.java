package com.factorial.operaciones.controller;

import com.factorial.operaciones.service.Operaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controllers {

    private Operaciones operaciones;

    @Autowired
    public Controllers(Operaciones operaciones){
        this.operaciones = operaciones;
    }

    @GetMapping("/")
    public Map<String, String> home(){
        return new HashMap<>(){{put("message", "Hello unit tests");}};
    }

    @GetMapping("/factorial")
    public Map<String, String> factorial(@RequestParam int numero) {
        return new HashMap<>() {{
            put("$.message", "Resultado: " + operaciones.factorial(numero));
        }};
    }

}
