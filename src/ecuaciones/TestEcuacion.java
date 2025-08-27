/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuaciones;

import java.util.Scanner;

// Clase de prueba
public class TestEcuacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        // Crear objeto ecuación
        EcuacionLineal sistema = new EcuacionLineal(a, b, c, d, e, f);

        // Mostrar resultado
        if (sistema.tieneSolucion()) {
            System.out.println("El sistema tiene solución:");
            System.out.println("x = " + sistema.getX());
            System.out.println("y = " + sistema.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
    }
}