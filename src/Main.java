import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userInput = "";
        String continueProgram = "Y";


        while (continueProgram.equalsIgnoreCase("y")) {

            Scanner keyboard = new Scanner(System.in);


            System.out.println("Enter a string:  ");
            userInput = keyboard.nextLine();
            System.out.println();
            System.out.println(userInput);
            System.out.println();
            System.out.println();


            System.out.println("Do you want to continue? : Please enter 'Y' to continue ");
            continueProgram = keyboard.next();
            System.out.println();
            System.out.println();


        }


    }

}
