public class QuadraticApp {

    public static void main(String[] args) { 

        // read in the command-line argument
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
 
        MathLib.ans(a, b, c);

    }
}

public class MathLib    {

    public static double sqrt(double x) {
        /* Newton's method to calculate square root of a positive number */
        double y = x;              // The initial estimate of the square root of x; very rough
                
        double epsilon = 1E-15;    // Floating-point error bound 

        while (Math.abs(y - x/y) > Math.max(y, x/y)*epsilon) {
            y = (x/y + y) / 2.0;
        }
        return y;
    }

    public static double discr(double a, double b, double c)    {
        double d = Math.pow(b, 2) - (4*a*c);
        return d;
    }

    public static void ans(double a, double b, double c)      {

        if (discr(a, b, c) < 0) {

            System.out.println("No real solutions");

        } else if (discr(a, b, c) == 0) {

            double x = (-b)/(2*a);
            System.out.println("x=" + x);

        } else  {

            double x1 = (-b + sqrt(discr(a, b, c)))/(2*a);
            double x2 = (-b - sqrt(discr(a, b, c)))/(2*a);
            System.out.println("x1=" + x1 + " x2=" + x2);

        }

    }


}
