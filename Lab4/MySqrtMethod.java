public class MySqrtMethod { 
    public static void main(String[] args) { 

        // read in the command-line argument
        double x = Double.parseDouble(args[0]);
		
 
        // Print out the estimate of the square root of x
        // and the square root calculated using the Math function
        System.out.println("Newton' Method: " + sqrt(x));
        System.out.println("Math  function: " + Math.sqrt(x));          
    }

    public static double sqrt(double x) {
        /* Newton's method to calculate square root of a positive number */
        double y = x;              // The initial estimate of the square root of x; very rough
                
        double epsilon = 1E-15;    // Floating-point error bound 

        while (Math.abs(y - x/y) > Math.max(y, x/y)*epsilon) {
            y = (x/y + y) / 2.0;
        }
        return y;
    }
}