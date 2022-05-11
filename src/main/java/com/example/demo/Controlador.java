package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.logica.*;

@RestController
public class Controlador {
    @GetMapping(value = "/Hipotenusa", consumes = MediaType.APPLICATION_JSON_VALUE)
    public RespuestaTrigonometria  Hipotenusa(@RequestParam double num1, @RequestParam double num2){
        double hipotenusa = logica.Hipotenusa(num1, num2);
        double angulo1 = logica.Angulo1(num1, hipotenusa);
        double angulo2 = logica.Angulo1(num2, hipotenusa);
        RespuestaTrigonometria respuestaTrigonometria = new RespuestaTrigonometria();
        respuestaTrigonometria.angulo1=angulo1;
        respuestaTrigonometria.angulo2=angulo2;
        respuestaTrigonometria.hipotenusa=hipotenusa;
        //return JsonStream.serialize(respuestaTrigonometria);
        return respuestaTrigonometria ;
    }

    @RequestMapping("/Fuerza")
    public double Fuerza(){
        double res = fuerzaDeAtraccion();
        return res;
    }

    @RequestMapping("/numeroPositivo")
    public String numero(){
        var res = numeroPositivo();
        return res;
    }

    @RequestMapping("/calificacion")
    public String calificacion(){
        var res=califiaciones();
        return res;
    }


    public class controlador {
        @GetMapping(value="/representacion", consumes = MediaType.APPLICATION_JSON_VALUE)
        public longitudTerreno representacion (@RequestParam double num1, @RequestParam double num2)


    }





}
