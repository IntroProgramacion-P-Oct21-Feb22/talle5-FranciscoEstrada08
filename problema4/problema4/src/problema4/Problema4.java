/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double porcentaje1;
        double porcentaje2;
        double porcentaje3;
        double descuento1;
        double descuento2;
        double descuento3;
        int numeroDias;
        double precioDiario;
        double subtotal;
        double valorTotal;

        porcentaje1 = 10;
        porcentaje2 = 15;
        porcentaje3 = 20;
        valorTotal = 0;

        //funciones
        System.out.println("Ingrese el numero de dias que desea hospedarse");
        numeroDias = entrada.nextInt();

        System.out.println("Ingrese el precio diario de la habitacion");
        precioDiario = entrada.nextDouble();

        subtotal = precioDiario * numeroDias;
        valorTotal = numeroDias * precioDiario;
        if (numeroDias < 0) {
            subtotal = 0;
            valorTotal = 0;
        } else {

            if (numeroDias <= 5 && numeroDias >= 0) {
                valorTotal = subtotal;
            } else {

                if (numeroDias > 5 && numeroDias <= 10) {
                    descuento1 = (porcentaje1 * subtotal) / 100;
                    valorTotal = subtotal - descuento1;
                } else {
                    if (numeroDias > 10 && numeroDias <= 10) {
                        descuento2 = (porcentaje2 * subtotal) / 100;
                        valorTotal = subtotal - descuento2;
                    } else {
                        descuento3 = (porcentaje3 * subtotal) / 100;
                        valorTotal = subtotal - descuento3;
                    }

                }
            }
        }
        System.out.printf("El total a pagar es: %.2f\n", valorTotal);
        System.out.printf("El subtotal es: %.2f\n", subtotal);
    }
}
