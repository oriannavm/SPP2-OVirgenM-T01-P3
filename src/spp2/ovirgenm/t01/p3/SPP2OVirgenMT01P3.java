/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.t01.p3;
import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        Scanner keyboard = new Scanner (System.in);
        double x1;
        double x2;
        double y1;
        double y2;
        double distancia;
        
        
        //Ejecución del programa
        System.out.println("Introduzca valor de x1: ");
        x1 = keyboard.nextDouble();
        System.out.println("Introduzca valor de y1: ");
        y1 = keyboard.nextDouble();
        System.out.println("Introduzca valor de x2: ");
        x2 = keyboard.nextDouble();
        System.out.println("Introduzca valor de y2: ");
        y2 =  keyboard.nextDouble();
        
        distancia = Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y1-y2),2));
         
        System.out.println("La distancia entre dos puntos es: " + distancia);
    }
    
}
