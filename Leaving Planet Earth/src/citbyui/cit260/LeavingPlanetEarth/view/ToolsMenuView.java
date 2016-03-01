/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.LeavingPlanetEarth.view;

/**
 *
 * @author Curtis
 */
public class ToolsMenuView {
    private String menu;

    /**
     * displays the tools menu view
     */
    public void displayToolsMenuView() {
        
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
            case "D": // build a drill
                this.buildDrill();
                break;
            case "H": // build a hammer
                this.buildHammer();
                break;
            case "A": // build an axe
                this.buildAxe();
                break;
            case "R": // make a rope
                this.makeRope();
                break;
            case "T": // make a tarp
                this.makeTarp();
                break;
            case "S": // make a screwdriver
                this.makeScrewdriver();
                break;
            case "Q": // quit/leave menu
                this.displayGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return true;
    }

    private void buildDrill() {
        System.out.println("*** buildDrill function called ***");
    }
    private void buildHammer() {
        System.out.println("*** buildHammer function called ***");
    }
    private void buildAxe() {
        System.out.println("*** buildAxe function called ***");
    }
    private void makeRope() {
        System.out.println("*** makeRope function called ***");
    }   
    private void makeTarp() {
        System.out.println("*** makeTarp function called ***");
    }
    private void makeScrewdriver() {
        System.out.println("*** makeScrewdriver function called ***");
    }
    private void displayGame() {
        System.out.println("*** displayGame function called ***");
    }
    
    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
    }
   public ToolsMenuView() {
       this.menu = "\n"
                 + "\n--------------------------------"
                 + "\n| Tools Menu                    |"
                 + "\n--------------------------------"
                 + "\nD - Build a drill"
                 + "\nH - Build a hammer"
                 + "\nA - Build an axe"
                 + "\nR - Make a rope"
                 + "\nT - Make a tarp"
                 + "\nS - Make a screwdriver"
                 + "\nQ - Return to game"
                 + "\n--------------------------------";
   }
   
   }