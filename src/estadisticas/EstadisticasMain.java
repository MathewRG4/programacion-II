/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadisticas;

import java.util.Scanner;
import java.util.Locale;

public class EstadisticasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        double[] numeros = new double[10];
        System.out.println("Vamos a calcular el promedio y la desviacion estandar de 10 numeros.");
        System.out.println("Ingrese los 10 numeros separados por espacio:");
        
        for(int i = 0; i < 10; i++){
            numeros[i] = sc.nextDouble();
        }
        
        double prom = Estadisticas.promedio(numeros);
        double desv = Estadisticas.desviacion(numeros);
        
        System.out.println("El promedio de tus numeros es: " + prom);
        System.out.println("La desviacion estandar es: " + desv);
        
        sc.close();
    }
}
