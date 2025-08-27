/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estadisticas;

public class Estadisticas {

    // calcula el promedio
    public static double promedio(double[] numeros){
        double suma = 0;
        for(double n : numeros){
            suma += n;
        }
        return suma / numeros.length;
    }
    
    // calcula la desviacion estandar
    public static double desviacion(double[] numeros){
        double prom = promedio(numeros);
        double suma = 0;
        for(double n : numeros){
            suma += Math.pow(n - prom, 2);
        }
        // usamos n-1 porque es muestra
        return Math.sqrt(suma / (numeros.length - 1));
    }
}
