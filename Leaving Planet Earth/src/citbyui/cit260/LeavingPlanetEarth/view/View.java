/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.LeavingPlanetEarth.view;

/**
 *
 * @author aly_cheers17
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
            } while (!done);
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        // while a valid name has not been retrieved
        while (!valid) {
            
            // prompt for the player's name
            System.out.println("\n" + this.displayMessage);
            
            // get the value entered from the keyboard
            value = keyboard.netLine();
            value = value.trim();
            
            if (value.length() <1) { // blank value entered
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            
            break;
        }
        return value; //return the name
        }
    }
    
}
