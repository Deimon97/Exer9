/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma9;

import java.util.Scanner;

/**
 * Is a princiapal for the app palindroma9
 * @author Kevin y Ivan
 */
public class Palindroma9Principal {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String [] args ) 
	{
            int resul=0; 
            Palindroma9 pali = new Palindroma9();
              System.out.println("Frase a comprobar");
              pali.setFrase(scanner.next());
             resul=pali.comparar(pali.getFrase());
             if(resul==1)
             {
                System.out.println("Si es palindroma"); 
             }
             else 
             {
                 System.out.println("No es palindroma");
             }
        }
    
}
