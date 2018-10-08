/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendita;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Tiendita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int cantprod;
        float precio = (float) 6.25;
        float descuento;
        float preciotot;
        float preciofin;
        for(int i = 0;i < 10;i++)
        {
            System.out.println("Cuantas productos va a comprar");
            cantprod = leer.nextInt();
        if(cantprod == 36 )
        {
            preciotot = precio*cantprod;
            descuento = (float) (preciotot * 0.15);
            preciofin = preciotot - descuento;
            System.out.println("El precio Final es: "+preciofin);
            System.out.println("El producto total es: "+cantprod);
            
        }
        else if(cantprod < 36)
        {
            preciotot = precio*cantprod;
            descuento = (float) (preciotot * 0.10);
            preciofin = preciotot - descuento;
            System.out.println("El precio Final es: "+preciofin);
            System.out.println("El producto total es: "+cantprod);
        }
        else if (cantprod >= 37)
        {
            preciotot = precio*cantprod;
            descuento = (float) (preciotot * 0.15);
            preciofin = preciotot - descuento;
            cantprod = cantprod+1;
            System.out.println("El precio Final es: "+preciofin);
            System.out.println("El producto total es: "+cantprod);
            
            }
        }
            
            
    }
        
}
    

