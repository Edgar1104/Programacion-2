/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaperiodica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class TablaPeriodica {

    /**
     * @param args the command line arguments
     */
    static  Elemento tmp;
    static  Elemento tmp_ant;
    static  Elemento tmp2;
    static  Elemento tmp_ant2;
    public static void main(String[] args) {
        // TODO code application logic here 
        
        ArrayList<Elemento> elementos = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de elementos: ");
        
        int n = scan.nextInt();
        System.out.println(" ");
        
        for(int i = 0;i<n;i++)
        {
            Elemento e =new Elemento ();
            System.out.println("Ingrese el nombre:   ");
            e.nombre = scan.next();
            System.out.println(" ");
            System.out.println("Ingrese la conductividad Termica:   ");
            e.conductividad_termica= scan.nextFloat();
            System.out.println(" ");
            System.out.println("Ingrese la conductividad Electrica:   ");
            e.conductividad_electrica = scan.nextFloat();
            System.out.println(" ");
            elementos.add(e);
        }
        tmp = elementos.get(0);
        tmp_ant = tmp;
        int mayor = 0;
        tmp2 = elementos.get(0);
        tmp_ant2 = tmp2;
        int menor = 0;
        
        elementos.forEach(item -> {
            if(item.conductividad_electrica > tmp.conductividad_electrica && item.conductividad_termica> tmp.conductividad_termica){
                tmp_ant = tmp;
                tmp = item;
            }    
        });
        elementos.forEach(item ->{
            if(item.conductividad_electrica < tmp2.conductividad_electrica && item.conductividad_termica < tmp2.conductividad_termica){
                tmp_ant2 = tmp2;
                tmp2 = item;
            }
        });
        
        
            System.out.println("Conductividad Electrica mayor "+tmp.conductividad_electrica);
            System.out.println("Conductividad termica mayor "+tmp.conductividad_termica);
            System.out.println(tmp.nombre);
            System.out.println("Conductividad Electrica menor "+tmp2.conductividad_electrica);
            System.out.println("Conductividad termica menor "+tmp2.conductividad_termica);
            System.out.println(tmp2.nombre);
    }
    
}
