public class CalculatePI {
    
    public static void main(String[] args) {

        double input = Double.parseDouble(args[0]);
        
        // Prints results
        System.out.println("\nThe value of Pi is " + Math.PI + " in the Java Math class.");
        System.out.println("The value of Pi is " + calPI_flag(input) + " with " + input + " accuracy.");
        System.out.println("The value of Pi is " + calPI_event(input) + " with " + input + " tolerance.");

    }

    static double calPI_flag(double x) {

        double pi = 0;

        boolean isAccurate = false;
        int count = 0;


        while (!isAccurate) {
            pi += (Math.pow(-1, count) / (2 * count + 1)*4);
            count++;

            if (Math.abs(pi - Math.PI) <= x ) {
                isAccurate = true;                
            }

        }
        return pi;

    } 

    static double calPI_event(double x) {

        double pi = 0;
        double previousPi = 0;
        int count = 0;

        pi = (Math.pow(-1, count) / (2 * count + 1)*4);
        count++;

        while (Math.abs(pi - previousPi) >= x || count == 1) {
            previousPi = pi;
            pi += (Math.pow(-1, count) / (2 * count + 1)*4);
            count++;
        }

        return pi;

    }

}
