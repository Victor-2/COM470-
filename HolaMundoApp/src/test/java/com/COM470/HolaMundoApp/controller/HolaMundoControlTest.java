
package com.COM470.HolaMundoApp.controller;

import org.junit.Test;
import static org.junit.Assert.*;

public class HolaMundoControlTest 
{    
    @Test
    public void testHola() {
        System.out.println("Hola");
        HolaMundoControl instance = new HolaMundoControl();
        String expResult = "Hola Mundo";
        String result = instance.Hola();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
