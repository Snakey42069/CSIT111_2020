public class CircleApp  {

    public static void main(String[] args) {

        double r = Double.parseDouble(args[0]);
        double t = Double.parseDouble(args[1]);

        if (t >= 0 && t <= 2 * Math.PI) {

            System.out.println("r = " + r + ", t = " + t);

            Circle myCircle = new Circle(r);

            System.out.println("C = " + myCircle.getCirc());
            System.out.println("A = " + myCircle.getArea());
            myCircle.displayXY(t);

        } else {
            System.out.println("Please provide a valid parametric variable value.");
            return;
        }

    }


}

public class Circle {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getCirc()  {

        double C = 2 * Math.PI * this.radius;
        return C;
        
    }

    public double getArea() {

        double A = Math.PI * (this.radius * this.radius);
        return A;

    }

    public void displayXY(double t) {

        double x = this.radius * Math.cos(t);
        double y = this.radius * Math.sin(t);
    
        System.out.println("x = " + x + ", y = " + y);

    }

}