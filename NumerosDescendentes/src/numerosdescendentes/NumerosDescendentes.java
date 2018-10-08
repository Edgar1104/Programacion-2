/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosdescendentes;

import java.util.Scanner;


/**
 *
 * @author edgar
 */
public class NumerosDescendentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int a, b, c, mayor, medio, menor;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        a = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        c = leer.nextInt();
        
        if(a > b && a > c)
        {
            mayor = a;
        }
        else if(b > a && b > c)
        {
            mayor = b;
        }
        else
        {
            mayor = c;
        }
        
        if(a < b && a < c)
        {
            menor = a;
        }
        else if(b < a && b < c)
        {
            menor = b;
        }
        else
        {
            menor = c;
        }
        medio = (a + b + c) - (mayor + menor);
        System.out.println(" ");
        System.out.println("El orden Descendente es: ");
        System.out.println(mayor + "," + medio + "," + menor);
    }
}
    

