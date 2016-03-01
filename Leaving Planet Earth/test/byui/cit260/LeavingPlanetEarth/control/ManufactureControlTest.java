/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aly_cheers17
 */
public class ManufactureControlTest {
    
    public ManufactureControlTest() {
    }

    /**
     * Test of calcBuildRocket method, of class ManufactureControl.
     */
    @Test
    public void testCalcBuildRocket() {
        
        System.out.println("calcBuildRocket");
        
        /************** Test Case #1 *******************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double engine = 4.0;
        double gasoline = 20.0;
        double wings = 4.0;
        double paint = 2.0;
        double oil = 24.0;
        
        double expResult = 54.0; //expected output returned value
        
        //create instance of ManufactureControl class
        ManufactureControl instance = new ManufactureControl();
        
        //call function to run test
        double result = instance.calcBuildRocket(engine, gasoline, wings, paint, oil);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
    }
    
}
