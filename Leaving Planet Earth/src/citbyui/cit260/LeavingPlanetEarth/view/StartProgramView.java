package citbyui.cit260.LeavingPlanetEarth.view;

import byui.cit260.LeavingPlanetEarth.LoweBingham.Player;
import byui.cit260.LeavingPlanetEarth.control.GameControl;
import java.util.Scanner;

/**
 * @author aly_cheers17
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name:";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {

        System.out.println(
                "\n**********************************************"
                + "\n* Welcome to Leaving Planet Earth.           *"
                + "\n* The year is 2072, and the planet is dying, *"
                + "\n* and you need to leave so that you don't    *"
                + "\n* die with it                                *"
                + "\n*                                            *"
                + "\n* Collect your supplies for the journey,     *"
                + "\n* build your own rocket ship, and travel     *"
                + "\n* to a new planet for a new life. Good luck! *"
                + "\n**********************************************"
        );
    }

    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);

    }

    private String getPlayersName() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // players name value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; // end the loop
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;

        }
        // display next view
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n==========================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have tons of funs!"
                + "\n=========================================="
        );

        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }

    private static class player {

        private static String getName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public player() {
        }
    }

}