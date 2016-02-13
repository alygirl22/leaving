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
public class Shelter implements Serializable{
    
    private double tarp;
    private double hammer;
    private double sticks;
    private double rope;
    private double axe;
    private double drill;

    public Shelter() {
    }
    
    

    public double getTarp() {
        return tarp;
    }

    public void setTarp(double tarp) {
        this.tarp = tarp;
    }

    public double getHammer() {
        return hammer;
    }

    public void setHammer(double hammer) {
        this.hammer = hammer;
    }

    public double getSticks() {
        return sticks;
    }

    public void setSticks(double sticks) {
        this.sticks = sticks;
    }

    public double getRope() {
        return rope;
    }

    public void setRope(double rope) {
        this.rope = rope;
    }

    public double getAxe() {
        return axe;
    }

    public void setAxe(double axe) {
        this.axe = axe;
    }

    public double getDrill() {
        return drill;
    }

    public void setDrill(double drill) {
        this.drill = drill;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.tarp) ^ (Double.doubleToLongBits(this.tarp) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.hammer) ^ (Double.doubleToLongBits(this.hammer) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.sticks) ^ (Double.doubleToLongBits(this.sticks) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.rope) ^ (Double.doubleToLongBits(this.rope) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.axe) ^ (Double.doubleToLongBits(this.axe) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.drill) ^ (Double.doubleToLongBits(this.drill) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Shelter{" + "tarp=" + tarp + ", hammer=" + hammer + ", sticks=" + sticks + ", rope=" + rope + ", axe=" + axe + ", drill=" + drill + '}';
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
        final Shelter other = (Shelter) obj;
        if (Double.doubleToLongBits(this.tarp) != Double.doubleToLongBits(other.tarp)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hammer) != Double.doubleToLongBits(other.hammer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sticks) != Double.doubleToLongBits(other.sticks)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rope) != Double.doubleToLongBits(other.rope)) {
            return false;
        }
        if (Double.doubleToLongBits(this.axe) != Double.doubleToLongBits(other.axe)) {
            return false;
        }
        if (Double.doubleToLongBits(this.drill) != Double.doubleToLongBits(other.drill)) {
            return false;
        }
        return true;
    }
    
    
    
}
