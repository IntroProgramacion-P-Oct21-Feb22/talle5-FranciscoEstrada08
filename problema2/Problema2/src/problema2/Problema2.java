/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoArticulo;
        String descripcion;
        int cantidadRequerida;
        double precioUnitario;
        double porcentaje;
        double descuento;
        double valorTotal;

        porcentaje = 15;

        System.out.println("Ingrese la descripcion del articulo");
        descripcion = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad requerida");
        cantidadRequerida = entrada.nextInt();

        System.out.println("Ingrese el precio unitario del articulo");
        precioUnitario = entrada.nextDouble();
 
        valorTotal = precioUnitario * cantidadRequerida;
        if (cantidadRequerida < 0) {
            System.out.println("Los datos ingresados no son validos");
        } else {
            if (cantidadRequerida > 50) {
                descuento = (porcentaje * valorTotal) / 100;
                valorTotal = valorTotal - descuento;
            }
            System.out.printf("Descripcion:%s\nEl valor total a pagar es: %.2f\n"
                    , descripcion,valorTotal);
        }
    }

}
