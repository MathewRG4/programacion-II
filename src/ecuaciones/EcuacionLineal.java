/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuaciones;

// Clase que representa un sistema de ecuaciones lineales 2x2
public class EcuacionLineal {
    // Atributos privados
    private double a, b, c, d, e, f;

    // Constructor
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Método para verificar si hay solución
 // Verifica si el sistema tiene solución
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }

    // Calcula x
    public double getX() {
        if (!tieneSolucion()) {
            System.out.println("⚠ El sistema no tiene solución");
            return Double.NaN;
        }
        return (e * d - b * f) / (a * d - b * c);
    }

    // Calcula y
    public double getY() {
        if (!tieneSolucion()) {
            System.out.println("⚠ El sistema no tiene solución");
            return Double.NaN;
        }
        return (a * f - e * c) / (a * d - b * c);
    }
}