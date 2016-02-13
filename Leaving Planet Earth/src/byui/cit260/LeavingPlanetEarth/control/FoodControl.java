/*
 * To change this license header choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.control;

/**
 *
 * @author aly_cheers17
 */
public class FoodControl {
   public double calcFoodAmount(double fruit, double vegetable) {
     
       if (fruit < 0 || vegetable < 0) { // fruit or vegetable less than zero
           return -1;
       }
       if (fruit > 50 || vegetable > 50) { // fruit or vegetable greater than 50
           
       }
       double totalFood = fruit + vegetable;
       
       return totalFood;
               
   }
}
