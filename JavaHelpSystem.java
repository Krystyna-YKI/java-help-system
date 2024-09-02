/**
 * name: Krystyna Chernykh
 * ID: 3652122
 * date: March 26, 2023
 */
/**
 * DOCUMENTATION...
 */
/**                                                                               
 *
 *<H1>Problem 4. Java help system</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
  This program provides an interactive help system for Java programming, offering definitions for common Java terms.
 *</P>
 *<H3>
 * Special instructions to compile and execute the program:
 *</H3>
 *<P>
 * Save the code in a file named 'JavaHelpSystem.java'.
 * Open a terminal or command prompt.
 * Navigate to the directory where 'JavaHelpSystem.java' is saved.
 * Compile the program using the command: 'javac JavaHelpSystem.java'
 * Execute the program using the command: 'java JavaHelpSystem'
 *</P>
 /**
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the program.
 * EXPECTED:
 * The help menu is displayed correctly, showing options for different Java terms and an exit option.
 * ACTUAL:
 * The help menu is displayed correctly.
 *</P>
 *<P>
 * 2. Select a specific Java term (for example, enter '2' for "switch").
 * EXPECTED:
 * The program should display the definition for the selected term.
 * ACTUAL:
 * The program shows the definition for the selected term.
 *</P>
 *<P>
 * 3. Enter an invalid input.
 * EXPECTED:
 * The program should display an error message and prompt for a valid input.
 * ACTUAL:
 * The program handles the invalid input correctly by displaying an error message and prompting for a valid input: 'Invalid selection. Please try again.'
 *</P>
 *<P>
 * 4. Exit the program by entering x.
 * EXPECTED:
 * The program exits after displaying the farewell message.
 * ACTUAL:
 * The program exited after displaying the farewell message: 'Thank you. Good bye.'
 *</P>
 */
/**
 * CODE...
*/
import java.util.Scanner;

public class JavaHelpSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nJava Help Menu");
            System.out.println("Select Help on:");
            System.out.println("1. If");
            System.out.println("2. Switch");
            System.out.println("3. For");
            System.out.println("4. While");
            System.out.println("5. Do-while");
            System.out.println("x. Exit\n");

            System.out.print("Selection: ");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    System.out.println("\nif: An if statement is a control flow statement that allows for executing some code only if a specified condition is true.\n");
                    break;
                case "2":
                    System.out.println("\nswitch: A switch statement allows a variable to be tested for equality against a list of values, and it executes the corresponding block of code based on the match.\n");
                    break;
                case "3":
                    System.out.println("\nfor: A for loop is a control flow statement for specifying iteration, which allows code to be executed repeatedly.\n");
                    break;
                case "4":
                    System.out.println("\nwhile: A while loop is a control flow statement that allows code to be executed repeatedly based on a given boolean condition.\n");
                    break;
                case "5":
                    System.out.println("\ndo-while: A do-while loop is a control flow statement that executes a block of code at least once, and then repeatedly executes the block, as long as the specified boolean condition is true.\n");
                    break;
                case "x":
                    System.out.println("\nThank you. Good bye.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\nInvalid selection. Please try again.");
                    break;
            }
        }
    }
}
