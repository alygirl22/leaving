/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.LeavingPlanetEarth.view;

import byui.cit260.LeavingPlanetEarth.control.GameControl;
import leaving.planet.earth.LeavingPlanetEarth;

/**
 *
 * @author aly_cheers17
 */
public class HelpMenuView {
       private String menu;

    /**
     * displays the start program view
     */
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
            } while (!done); 
        }
    

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "O": // objective of the game
                this.displayObjective();
                break;
            case "M": // show moves in game
                this.displayMove();
                break;
            case "B": // display how to build shelter
                this.displayBuildShelter();
                break;
            case "F": // display how to get food and tools for game
                this.displayHowToFindPieces();
                break;
            case "R": // display main menu
                this.displayMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
   private void displayObjective() {
        GameControl.createNewGame(LeavingPlanetEarth.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    private void displayMove() {
        System.out.println("*** startExistingGame function called ***");
    }
    private void displayBuildShelter() {
        System.out.println("*** startExistingGame function called ***");
    }
    private void displayHowToFindPieces() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    private void displayMainMenu() {
        System.out.println("*** displayMainMenu function called ***");
    }
   

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }
   public HelpMenuView() {
       this.menu = "\n"
                 + "\n--------------------------------"
                 + "\n| Help Menu                     |"
                 + "\n--------------------------------"
                 + "\nO - Objective of the game"
                 + "\nM - How to move in the game"
                 + "\nF - How to find pieces of the rocket"
                 + "\nR - Return to main menu"
                 + "\n--------------------------------";
   }
}
