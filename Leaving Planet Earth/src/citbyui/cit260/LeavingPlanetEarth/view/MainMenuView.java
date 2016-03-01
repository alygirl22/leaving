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
public class MainMenuView {
    private String menu;

    /**
     * displays the start program view
     */
    public void displayMainMenuView() {
        
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }
   private void startNewGame() {
        GameControl.createNewGame(LeavingPlanetEarth.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
   

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }
   public MainMenuView() {
       this.menu = "\n"
                 + "\n--------------------------------"
                 + "\n| Main Menu                    |"
                 + "\n--------------------------------"
                 + "\nN - Start new game"
                 + "\nG - Get and start saved game"
                 + "\nH - Get help on how to play the game"
                 + "\nS - Save game"
                 + "\nQ - Quit"
                 + "\n--------------------------------";
   }
   
   }
    

