/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palindroma9Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import palindroma9.Palindroma9;

/**
 *
 * @author Kevin y Ivan
 */
public class Palindroma9JUnitTest {
    static Palindroma9 pali;
    public Palindroma9JUnitTest() {
    }
    /**
     * Test para funcion comparar,como comparar
     * devuelve un boolean lo comprovamos en assertEquals
     */
    @Test
    public void testComparar(){
        pali=new Palindroma9("ana");
        System.out.println("Comparando");
        int resultado=pali.comparar("ana");
        int esperado=1;
        assertEquals(resultado,esperado);
    }
    
}
