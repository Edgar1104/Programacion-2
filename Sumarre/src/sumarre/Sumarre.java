/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarre;

/**
 *
 * @author edgar
 */
public class Sumarre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = {2,5,7,10,12,15,17,1800};
        int suma = 0;
        
        for(int i = 0;i < numeros.length;i++)
        {
            System.out.print(suma+" + ");
            suma += numeros[i];
            System.out.println(numeros[i]+"-->"+suma );
            
        }
        System.exit(0);
    }
    
}
