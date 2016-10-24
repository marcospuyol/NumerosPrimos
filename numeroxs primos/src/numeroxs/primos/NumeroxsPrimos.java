/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroxs.primos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NumeroxsPrimos {

     //Devuelve true si es primo, false en caso de que no sea primo
    public static boolean ComprobarPrimo(int num){
        boolean primo = true;
        
        for (int i = 2; i < num; i++){
            if ((num % i)== 0){
                primo = false;
                i = num + 1;
            }
        }

        return primo;
    }
    
    public static int SiguientePrimo(int num){
        int primo = 0;
        boolean bandera = true;
        for (int i = (num+1); bandera == true; i++ ){
            if (ComprobarPrimo(i)){
                bandera = false;
                primo = i;
            }
        }
        
        
        return primo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        boolean bandera = true;
        int numero = 0;
        
        while (bandera){
            System.out.println("Dime un número para comprobar");
             numero = leer.nextInt();
             
             if (ComprobarPrimo(numero)){
                 System.out.println("El número " + numero + " es primo");
                 System.out.println("El siguiente número es: " + SiguientePrimo(numero));
             }else{
                 System.out.println("El número " + numero + " no es primo");
                 System.out.println("El siguiente primo es: " + SiguientePrimo(numero));
             
                    }
             if (numero == 0){
                 bandera = false;
             }         
             
                 

             
        }
    
}
}
