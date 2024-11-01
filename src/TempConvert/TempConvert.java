package TempConvert;

import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {
    	
    	// this is a test
    	
        // Welcome message
        System.out.println("--------");
        System.out.println("Hi! Welcome to Celsius to Fahrenheit Converter!");
        
        // Create a scanner object to read input
        Scanner tempinput = new Scanner(System.in);
        String continueConversion= "yes";

        // Loop to allow user to convert multiple times
        do {
            // Request user to input the temperature
            System.out.println("What is the temperature you would like to convert today? ");
            
            // Validate input and perform the conversion
            if (tempinput.hasNextDouble()) {
                double temp = tempinput.nextDouble();
                
                // Convert the temperature from Celsius to Fahrenheit
                double ctof = temp * 1.8 + 32;
                
                // Display the result to 2 decimal places for accuracy
                System.out.printf("The temperature in Fahrenheit is: %.2f\n", ctof);
            } else {
                // If the input is invalid, print an error message
                System.out.println("You have entered an invalid number. Please try again.");
                tempinput.next(); // Consume the invalid input
                continue; // Restart the loop
            }
            
            // Ask the user if they want to convert another temperature
            System.out.println("Do you want to convert another temperature? (yes/no)");
            continueConversion = tempinput.next();

        } while (continueConversion.equalsIgnoreCase("yes"));
        
        // Close the Scanner object
        tempinput.close();
        
        System.out.println("Thank you for using the Celsius to Fahrenheit Converter!");
        System.out.println(" ");
        
        //put name on work
        System.out.println("Go Hatters!!");
        System.out.println("Program by: Tapiwa Karumekayi");
        
        System.out.println(" ");
        
        System.out.println("---------");
        
    }
}
