package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/control")
public class Controlador {
    @GetMapping(value = "/Hipotenusa",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public RespuestaTrigonometria  Hipotenusa(@RequestParam double num1, @RequestParam double num2){
        double hipotenusa = logica.Hipotenusa(num1, num2);
        double angulo1 = logica.Angulo1(num1, hipotenusa);
        double angulo2 = logica.Angulo1(num2, hipotenusa);
        RespuestaTrigonometria respuestaTrigonometria = new RespuestaTrigonometria();
        respuestaTrigonometria.angulo1=angulo1;
        respuestaTrigonometria.angulo2=angulo2;
        respuestaTrigonometria.hipotenusa=hipotenusa;
        return respuestaTrigonometria ;
    }

    @GetMapping(value = "/Fuerza",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public double Fuerza(@RequestParam ("masa1") double masa1,@RequestParam ("masa2") double masa2,@RequestParam ("distancia") double distancia){
        double respuesta = logica.fuerzaDeAtraccion(masa1,masa2,distancia) ;
        return respuesta;
    }

    @GetMapping(value = "/numeroPositivo")
    public long numero(@RequestParam long numero){
        long respuesta = Long.parseLong(logica.numeroPositivo(numero));
        return respuesta;
    }

    @GetMapping(value = "/calificacion")
    public double calificacion(@RequestParam double numero){
        double respuesta = Double.parseDouble(logica.califiaciones(numero));
        return respuesta;
    }


}
