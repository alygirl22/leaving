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
public class Tools implements Serializable{
    
    private double drill;
    private double hammer;
    private double shovel;
    private double screwdriver;
    private double axe;
    private double canteen;
    private double tarp;
    private double rope;

    public Tools() {
    }
    
    

    public double getDrill() {
        return drill;
    }

    public void setDrill(double drill) {
        this.drill = drill;
    }

    public double getHammer() {
        return hammer;
    }

    public void setHammer(double hammer) {
        this.hammer = hammer;
    }

    public double getShovel() {
        return shovel;
    }

    public void setShovel(double shovel) {
        this.shovel = shovel;
    }

    public double getScrewdriver() {
        return screwdriver;
    }

    public void setScrewdriver(double screwdriver) {
        this.screwdriver = screwdriver;
    }

    public double getAxe() {
        return axe;
    }

    public void setAxe(double axe) {
        this.axe = axe;
    }

    public double getCanteen() {
        return canteen;
    }

    public void setCanteen(double canteen) {
        this.canteen = canteen;
    }

    public double getTarp() {
        return tarp;
    }

    public void setTarp(double tarp) {
        this.tarp = tarp;
    }

    public double getRope() {
        return rope;
    }

    public void setRope(double rope) {
        this.rope = rope;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.drill) ^ (Double.doubleToLongBits(this.drill) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.hammer) ^ (Double.doubleToLongBits(this.hammer) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.shovel) ^ (Double.doubleToLongBits(this.shovel) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.screwdriver) ^ (Double.doubleToLongBits(this.screwdriver) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.axe) ^ (Double.doubleToLongBits(this.axe) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.canteen) ^ (Double.doubleToLongBits(this.canteen) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.tarp) ^ (Double.doubleToLongBits(this.tarp) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rope) ^ (Double.doubleToLongBits(this.rope) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Tools{" + "drill=" + drill + ", hammer=" + hammer + ", shovel=" + shovel + ", screwdriver=" + screwdriver + ", axe=" + axe + ", canteen=" + canteen + ", tarp=" + tarp + ", rope=" + rope + '}';
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
        final Tools other = (Tools) obj;
        if (Double.doubleToLongBits(this.drill) != Double.doubleToLongBits(other.drill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hammer) != Double.doubleToLongBits(other.hammer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.shovel) != Double.doubleToLongBits(other.shovel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.screwdriver) != Double.doubleToLongBits(other.screwdriver)) {
            return false;
        }
        if (Double.doubleToLongBits(this.axe) != Double.doubleToLongBits(other.axe)) {
            return false;
        }
        if (Double.doubleToLongBits(this.canteen) != Double.doubleToLongBits(other.canteen)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tarp) != Double.doubleToLongBits(other.tarp)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rope) != Double.doubleToLongBits(other.rope)) {
            return false;
        }
        return true;
    }
    
    
    
}
