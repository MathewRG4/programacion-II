/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcuacionCuadratica;

import java.util.Scanner;
import java.util.Locale;

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Ingrese a, b y c separados por espacio:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        EcuacionCuadratica sistema = new EcuacionCuadratica(a, b, c);
        double disc = sistema.getDiscriminante();
        
        if(disc > 0){
            System.out.println("La ecuacion tiene dos raices: " 
                    + sistema.getRaiz1() + " y " + sistema.getRaiz2());
        }else if(disc == 0){
            System.out.println("La ecuacion tiene una raiz: " + sistema.getRaiz1());
        }else{
            System.out.println("La ecuacion no tiene raices reales.");
        }
        
     
    }
}
