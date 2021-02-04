import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class CtoF{

   public static void main(String[] args) throws IOException {
	   
	String inputFileName = args[0];  // the filename provided from command line
	double fahrenheit = 0;
	String month = ""; // a empty string

	// Add your code here
    /* Open the input and output files. */
    Scanner read = new Scanner(Paths.get(inputFileName));
	
	/* read the month name and average temperature from the file */
    month = read.next();
    double celsius = Double.parseDouble(read.next()); 
    System.out.println(celsius);

	/* convert the temperature from Celsius to Fahrenheit */
    fahrenheit = (celsius*(9.0/5.0))+32;
	
	/* display the month name and the temperature in Fahrenheit */
	System.out.printf(month + " %.1f", fahrenheit);
   
   }
}