import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class AverageMark{
	
   public static void main(String[] args) throws IOException
   {
    

	float average = 0.0f;
	int count = 0;
	
	// Add your code here

    Scanner input = new Scanner(System.in);
    System.out.print("Enter input file name:");
    String fileName = input.nextLine();
    input.close();
    Scanner read = new Scanner(Paths.get(fileName));

    // boolean nextTrue = true;
    
    float sum = 0f;
         
    for (int i = 1; i<11; i++ )    {
        // numbers[i] = Double.parseDouble(read.next());
        sum = sum + Float.parseFloat(read.next());
        count = count + 1;
    }
    

    average = sum / count;

	/* display the number of marks and average marks on the screen */
	System.out.printf("The number of marks read:  %d\n", count);	
	System.out.printf("The average mark:  %.1f", average);

   }
}