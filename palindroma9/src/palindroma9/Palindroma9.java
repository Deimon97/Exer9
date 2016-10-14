/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma9;

/**
 *
 * @author alumne
 */
public class Palindroma9 {

    /**
     * @param args the command line arguments
     */
       private String frase;
       
    public Palindroma9() {
        
         }
    
    public Palindroma9(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
       public void comparar(String frase)
       {
         int fin=frase.length()-1;
         int compro=0;
         int i=0;
        while(i<fin)
         {
             if(frase.charAt(i) != frase.charAt(fin))
             {
                 compro=1;
             }
             i++;
             fin--;
         }
        
            if(compro==1)
            {
                System.out.println("No es un palindromo");
            }
            else
            {
                System.out.println("Si es palindromo");
            }
        
        
       }
       
       
    }


    

