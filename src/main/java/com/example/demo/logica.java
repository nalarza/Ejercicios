package com.example.demo;

public class logica {
public static double Hipotenusa(double num1, double num2){

    double parcial = (num1*num1)+(num2*num2);
    double resultado=Math.sqrt(parcial);
    return resultado;
}
    public static double Angulo1 (double num1, double hipotenusa){
        double resultado=Math.asin(num1/hipotenusa);
        resultado= RadianesAGrados(resultado);
        return resultado;
    }
    public static double RadianesAGrados (double radianes){
        double resultado=radianes*(180/Math.PI);
        return resultado;
    }

public static double fuerzaDeAtraccion(double masa1, double masa2, double distancia){
    double g = 6.673*(10^-8);
    //var g = 0.00000006673;
    double resultado = (g*masa1*masa2) / (distancia/distancia);
    return resultado;
}

public static String numeroPositivo(long numero){
    if (numero >= 0){
        return "el numero es positivo";
    }else {
        return "el numero es negativo";
    }
}

public static String califiaciones(double numero){
    if (numero >=0 && numero<=59){
        return "su calificacion es ( E )";
    }else if (numero >=60 && numero <=69){
        return "su calificacion es ( D )";
    }else if (numero >=70 && numero <=79){
        return "su calificacion es ( C )";
    }else if (numero >= 80 && numero <=89){
        return "su calificacion es ( B )";
    }else if (numero >= 90 && numero <=100){
        return "su calificacion es ( A )";
    }
    return "SU CALIFICACION NO PUDO SER PROCESADA";
}
}

