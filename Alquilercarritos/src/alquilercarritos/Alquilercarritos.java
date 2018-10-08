/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilercarritos;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class Alquilercarritos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        double kilometros;
        double precio = 0;
        
        System.out.println("Ingrese los Kilometros que recorrio el vehiculo");
        kilometros = leer.nextDouble();
        
        if(kilometros <= 300)
        {
            precio = 30.00;
        }
        else if (kilometros > 300 && kilometros <= 1000)
        {
            precio = 30.00 + (kilometros - 300)*0.15;    
        }
        else if (kilometros > 1000)
        {
            precio = 30.00 +(kilometros - 300)* 0.10;
        }
        System.out.println("El precio total sera: $"+precio);
    }
    
}
