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
     * 
     */
       private String frase;
       
    public Palindroma9() {
        
         }
    /**
     * 
     * @param frase is a string and is a palindroma
     */
    public Palindroma9(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    /**
     * Determinate the frase is a palindroma or not
     * @param frase is string
     * @return boolean 1 is a palindorma 0 isn't palindroma
     */
       public int comparar(String frase)
       {
         
        frase=frase.replace(" ","");
         frase=frase.replace("á","a");
         frase=frase.replace("é","e");
         frase=frase.replace("í","i");
         frase=frase.replace("ó","o");
         frase=frase.replace("ú","u");
         frase=frase.replaceAll("[-+.^:,]","");
        String frase2=new StringBuilder(this.frase).reverse().toString();
        
             if(frase.equals(frase2))
             {
                 return 1;
             }
        
            else
            {
               return 0;          
            }
       }
}


    

