/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        //porcentajes cada pais
        double porcentaje_japon = 30;
        double porcentaje_alemania = 20;
        double porcentaje_italia = 15;
        double porcentaje_usa = 8;
        //impuestos
        double impuesto_japon;
        double impuesto_alemania;
        double impuesto_italia;
        double impuesto_usa;

        double precioVenta;

        System.out.println("Ingrese la marca");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo");
        costo = entrada.nextDouble();

        if (costo < 0) {
            System.out.println("Valor invalido");
        } else {
            if (origen.equals("Alemania")) {
                impuesto_alemania = (costo * porcentaje_alemania) / 100;
                precioVenta = impuesto_alemania + costo;
                System.out.printf("El impuesto por pagar es: %.2f\n"
                        + "El precio de venta total es: %.2f\n",
                        impuesto_alemania, precioVenta);
            } else {
                if (origen.equals("Japon")) {
                    impuesto_japon = (costo * porcentaje_japon) / 100;
                    precioVenta = impuesto_japon + costo;
                    System.out.printf("El impuesto por pagar es: %.2f\n"
                            + "El precio de venta total es: %.2f\n", impuesto_japon,
                            precioVenta);
                } else {
                    if (origen.equals("Italia")) {
                        impuesto_italia = (costo * porcentaje_italia) / 100;
                        precioVenta = impuesto_italia + costo;
                        System.out.printf("El impuesto por pagar es: %.2f\n"
                                + "El precio de venta total es: %.2f\n",
                                impuesto_italia,
                                precioVenta);
                    } else {
                        if (origen.equals("USA")) {
                            impuesto_usa = (costo * porcentaje_usa) / 100;
                            precioVenta = impuesto_usa + costo;
                            System.out.printf("El impuesto por pagar es: %.2f\n"
                                    + "El precio de venta total es: %.2f\n",
                                    impuesto_usa,
                                    precioVenta);
                        } else {
                            System.out.printf("No requiere pagar impuesto\n"
                                    + "El precio de venta total es: %.2f\n", costo);
                        }
                    }
                }
            }
        }
    }
}