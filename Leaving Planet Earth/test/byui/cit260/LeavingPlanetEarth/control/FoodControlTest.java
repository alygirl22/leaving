/*
 * To change this license header choose License Headers in Project Properties.
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
public class FoodControlTest {
    
    public FoodControlTest() {
    }

    /**
     * Test of calcFoodAmount method, of class FoodControl.
     */
    @Test
    public void testCalcFoodAmount() {
        System.out.println("calcFoodAmount");
        
        /********************Test Case #1 ****************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double fruit = 14.0;
        double vegetable = 50.0;
        
        double expResult = 64.0; //expected output returned value
        
        //create instance of FoodControl class
        FoodControl instance = new FoodControl();
        
        // call function to run test
        double result = instance.calcFoodAmount(fruit, vegetable);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
   
        
    }
    
}



