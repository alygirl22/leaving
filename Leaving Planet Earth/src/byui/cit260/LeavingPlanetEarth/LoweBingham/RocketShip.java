/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LeavingPlanetEarth.LoweBingham;

import java.io.Serializable;

/**
 *
 * @author aly_cheers17
 */
public class RocketShip implements Serializable {
    
    // class instance variables
    private double engine;
    private double oil;
    private double gasoline;
    private double wings;
    private double paint;

    public RocketShip() {
    }
    
    

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public double getWings() {
        return wings;
    }

    public void setWings(double wings) {
        this.wings = wings;
    }

    public double getPaint() {
        return paint;
    }

    public void setPaint(double paint) {
        this.paint = paint;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.engine) ^ (Double.doubleToLongBits(this.engine) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.oil) ^ (Double.doubleToLongBits(this.oil) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.gasoline) ^ (Double.doubleToLongBits(this.gasoline) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.wings) ^ (Double.doubleToLongBits(this.wings) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.paint) ^ (Double.doubleToLongBits(this.paint) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "RocketShip{" + "engine=" + engine + ", oil=" + oil + ", gasoline=" + gasoline + ", wings=" + wings + ", paint=" + paint + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RocketShip other = (RocketShip) obj;
        if (Double.doubleToLongBits(this.engine) != Double.doubleToLongBits(other.engine)) {
            return false;
        }
        if (Double.doubleToLongBits(this.oil) != Double.doubleToLongBits(other.oil)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gasoline) != Double.doubleToLongBits(other.gasoline)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wings) != Double.doubleToLongBits(other.wings)) {
            return false;
        }
        if (Double.doubleToLongBits(this.paint) != Double.doubleToLongBits(other.paint)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
