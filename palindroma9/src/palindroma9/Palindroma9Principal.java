/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma9;

import java.util.Scanner;

/**
 *
 * @author dawbio
 */
public class Palindroma9Principal {
    public static Scanner scanner =new Scanner(System.in);
    public static void main(String [] args ) 
	{
             Palindroma9 pali = new Palindroma9();
              System.out.println("Frase a comprobar");
              pali.setFrase(scanner.next());
              pali.comparar(pali.getFrase());
        }
    
}
