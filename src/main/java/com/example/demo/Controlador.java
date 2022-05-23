package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonBuilderUtils;
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


        @GetMapping(value="/representacion", consumes = MediaType.APPLICATION_JSON_VALUE)
        public LongitudTerreno representacion (@RequestParam double num1, @RequestParam double num2, @RequestParam double num3){
            double hectometros = logica.hectometros(num1);
            double decametros =  logica.decametros(num2);
            double metros =      logica.metros(num3);

            LongitudTerreno longitudTerreno= new LongitudTerreno();
            longitudTerreno.hectometros=hectometros;
            longitudTerreno.decametros=decametros;
            longitudTerreno.metros=metros;
            return longitudTerreno;

    }

         @RequestMapping("/saludos")
               String hellow(){
              return "Hello World!";
              }


         @RequestMapping ("/operadores")

         public static double suma (){
          int num1=5;
          int num2=6;
             double adicion= num1+num2;

          return adicion;
         }
         //estes un comentario


    }



