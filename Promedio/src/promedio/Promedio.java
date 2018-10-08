/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.util.Scanner;



/**
 *
 * @author edgar
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        float peso[] = new float [20];
        float altura[] = new float[20];
        
        float prom1 = 0;
        float prom2 = 0;
        
        int i,lim,j;
        System.out.println("Ingrese el numero de personas");
        lim = leer.nextInt();
        
        for (i=0;i<lim;i++)
        {
            System.out.println("Ingrese el peso: ");
            System.out.println("W["+(i+1)+"]= ");
            peso[i]= leer.nextFloat();
        }
        for (j=0;j<lim;j++)
        {
            System.out.println("Ingrese la altura: ");
            System.out.println("H["+(j+1)+"]= ");
            altura[j]= leer.nextFloat();
        }
        
        for (i = 0;i<lim;i++)
        {
            System.out.print("Los pesos son: ");
            System.out.println(peso[i]+", ");
            prom1 += peso[i]/lim; 
        }
        System.out.println("El promedio de el peso es: "+prom1); 
        
        for (j = 0;j<lim;j++)
        {
            System.out.print("Las alturas son: ");
            System.out.println(altura[j]+", ");
            prom2 += altura[j]/lim; 
            
        }
        System.out.println("El promedio de la altura es: "+prom2);
        
        
    }
}