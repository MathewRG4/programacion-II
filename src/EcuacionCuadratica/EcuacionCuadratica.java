/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcuacionCuadratica;

import java.util.Scanner;
import java.util.Locale;

public class EcuacionCuadratica {
    
    // atributos de la ecuacion
    private double a;
    private double b;
    private double c;
    
    // constructor
    public EcuacionCuadratica(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // discriminante
    public double getDiscriminante(){
        return (b * b) - (4 * a * c);
    }
    
    // raiz 1
    public double getRaiz1(){
        double d = getDiscriminante();
        if(d < 0){
            return 0;
        }
        return (-b + Math.sqrt(d)) / (2 * a);
    }
    
    // raiz 2
    public double getRaiz2(){
        double d = getDiscriminante();
        if(d < 0){
            return 0;
        }
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}

    
    
