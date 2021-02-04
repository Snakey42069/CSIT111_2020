public class Circle {

    public static void main(String[] args) {

        double r = 1;
        double t = 1.5;

        System.out.println("r = " + r + ",  t = " + t);

        double C, A;

        C = 2 * Math.PI * r;
        System.out.println("C = " + C);

        A = Math.PI * r * r;
        System.out.println("A = " + A);

        double x, y;

        x = r * Math.cos(t);
        y = r * Math.sin(t);
        System.out.println("x = " + x + ",  y = " + y);

        boolean test = (x*x) + (y*y) == (r*r);
        System.out.println("The calculation is " + test);

    }
    
}