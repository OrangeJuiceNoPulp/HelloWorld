import java.util.Scanner;

public class App {

    public static int getInt(Scanner scnr) {
        int num;

        String input = scnr.nextLine();

        try {
            num = Integer.parseInt(input);
        }
        catch (Exception ex) {
            System.out.println("\nINVALID INPUT!");
            System.out.println("PLEASE ENTER AN INTEGER VALUE!");
            num = getInt(scnr); //makes the user keep entering something until they enter a valid integer
        }

        return num;
       
    } //This method is to help ensure that the program does not crash when the user enters a value which is not an integer



    public static void main(String[] args) throws Exception {



        Scanner scnr = new Scanner(System.in);
        int input;
        int num1, num2;

        while (true) {
            System.out.println("\nWhat would you like to do?\n");

            System.out.println("OPTIONS:");                       //Lists the options of what this program does 
            System.out.println("1: Say \"hello\"");               //for the user to choose
            System.out.println("2: Add two integers");
            System.out.println("3: Quit\n");

            System.out.print("Please enter the number for the option that you would like: ");
            
            input = getInt(scnr); //gets user input for the option

            if (input == 1) {
                System.out.println("\nHello, World!"); //says "Hello, World!"
            }
            else if (input == 2) {
                System.out.print("\nPlease enter the first integer that you would like to add: ");
                num1 = getInt(scnr); //gets the first number to add

                System.out.print("\nPlease enter the second integer that you would like to add: "); 
                num2 = getInt(scnr); //gets the second number to add

                System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2)); //displays the sum of the numbers which the user had entered

            }
            else if (input == 3) {
                break; //breaks out of the loop as the user has selected to quit
            }
            else {
                System.out.println("\nINVALID INPUT!");
                System.out.println("PLEASE ENTER AN INTEGER VALUE CORRESPONDING TO ONE OF THE OPTIONS!");
                //informs the user that they entered an integer which does not correspond to a valid option for this program
            }



        }

        scnr.close();
        System.out.println("\nBye bye!\n"); //displays a message to say goodbye to the user after they quit

    }
}
