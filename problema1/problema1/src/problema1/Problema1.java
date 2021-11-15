/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoKilovatio;
        double valorConsumidos;
        int edad;
        double descuento;
        double porcentaje;
        double valorTotal;
        
        porcentaje = 10;
        //funciones
        System.out.println("Ingrese el costo por kilovatio");
        costoKilovatio = entrada.nextDouble();
        
        System.out.println("Ingrese el número de kilovatios consumidos");
        valorConsumidos = entrada.nextDouble();
        
        System.out.println("Ingrese edad de la persona");
        edad = entrada.nextInt();
        
        valorTotal = costoKilovatio * valorConsumidos;
        
        if(edad > 65){
            descuento = (porcentaje * valorTotal)/100;
            valorTotal = valorTotal - descuento;
        }
        System.out.printf("El valor total a pagar es: %.2f\n", valorTotal);
    }
    
}
