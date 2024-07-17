package com.curso.spring.camilo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // sirve para decirle a spring que esta clase debe crear una instancia, es un
// controlador y los controladores estan compuestos por metodos
public class SaludoController {

    // esto sirve para conectar un metodo especifico desde la peticion del cliente
    //si el cliente ingresa saludo se mostrara este metodo saludo clasificado con 
    //GetMapping value=saludo y retorna el texto plano que hayamos asignado
    @GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo (){
        return "Microservicios con Spring Boot";

    }


}
