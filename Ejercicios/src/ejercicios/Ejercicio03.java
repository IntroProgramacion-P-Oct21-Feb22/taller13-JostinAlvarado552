/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        String nombre;

        int i = 1;
        try {
            while (i <= 4) {
                System.out.println("Ingrese nombre: ");
                nombre = entrada.nextLine();

                if (nombre.equals("Mario") || nombre.equals("Pedro")
                        || nombre.equals("Ana") || nombre.equals("Luis")
                        || nombre.equals("Carolina")) {
                    throw new Exception("Nombres no permitidos");
                }
                System.out.println("Ingrese calificación: ");
                calificacion = entrada.nextDouble();

                entrada.nextLine();

                if (calificacion > 10 || calificacion < 0) {
                    throw new Exception("Nota fuera de rango permitido");
                }
                System.out.printf("Nombre: %s\n"
                        + "Calificación: %.1f\n",
                        nombre, calificacion);
                i = i + 1;
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.printf("Existe un error de tipo %s\n",
                    inputMismatchException);
        } catch (Exception e) {
            System.out.printf("Existe un error %s\n", e);
        }
        System.out.printf("%s\n", "Gracias por usar el sistema, para reiniciar su proceso, vuelva a ejecutar");
    }

}
