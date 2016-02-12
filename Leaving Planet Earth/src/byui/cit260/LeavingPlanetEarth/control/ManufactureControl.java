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
public class ManufactureControl {
    
    public double calcBuildRocket(double engine, double gasoline, double wings, double paint, double oil){
        
        if (engine < 0 || gasoline < 0 || wings < 0 || paint < 0 || oil < 0) { // anything less than zero
           return -1;
        }
        if (engine > 6 || gasoline > 60 || wings > 4 || paint > 10 || oil > 50) { // greater than the boundaries
           return -1;
       }
        double buildRocket = engine + gasoline + wings + paint + oil;
       
       return buildRocket;
    }
}
