// CSIT111 or HCSI 111 or CSIT811 Assignment 2
// Mark: 10 / 10

public class ArithmeticWithFractions {

    public static void main(String[] args) {

        // Converts numerator and denominator to individual Strings and stores in array.
        String[] input1Strings = args[0].split("/");
        String[] input2Strings = args[1].split("/");

        // Creates a new Fraction object and assigns values provided from args[0].
        Fraction input1 = new Fraction();
        input1.numerator = Integer.parseInt(input1Strings[0]);
        input1.denominator = Integer.parseInt(input1Strings[1]);

        // Creates a new Fraction object and assigns values provided from args[1].
        Fraction input2 = new Fraction();
        input2.numerator = Integer.parseInt(input2Strings[0]);
        input2.denominator = Integer.parseInt(input2Strings[1]);

        displayResults(input1, input2);

    }

    public static void displayResults(Fraction x, Fraction y)  {

        // Creates new Calculator object passing 2 provided Fractions.
        Calculator newCalc = new Calculator(x, y);

        // Prints required output to console.
        System.out.println("--- Basic operations with fractions --");
        System.out.printf("%-23s %-23s %n", "The sum:", x.toString() + " + " + y.toString() + " = " + newCalc.addFractions().toString());
        System.out.printf("%-23s %-23s %n", "The difference:", x.toString() + " - " + y.toString() + " = " + newCalc.subtFractions().toString());
        System.out.printf("%-23s %-23s %n", "The product:", x.toString() + " x " + y.toString() + " = " + newCalc.multFractions().toString());
        System.out.printf("%-23s %-23s %n", "The quotient:", x.toString() + " \u00F7 " + y.toString() + " = " + newCalc.divFractions().toString());

    }
}

class Fraction   {

    public int numerator;
    public int denominator;

    public String toString()    {
        return (numerator + "/" + denominator);
    }
}

public class Calculator {

    private Fraction fr1;
    private Fraction fr2;

    
    // Constructor
    public Calculator(Fraction xfr1, Fraction xfr2) {

        // Exits program if invalid data is provided.
        if (xfr1.numerator < 0 || xfr2.numerator < 0 || xfr1.denominator <= 0 || xfr2.denominator <= 0) {
            System.out.println("Illegal Argument. Exit...");
            System.exit(1);
        } else  {
            fr1 = xfr1;
            fr2 = xfr2;
        }
    }

    public Fraction addFractions()  {

        Fraction ans = new Fraction();
        ans.numerator = (fr1.numerator * fr2.denominator) + (fr2.numerator * fr1.denominator);
        ans.denominator = fr1.denominator * fr2.denominator;
        return ans;

    }

    public Fraction subtFractions() {

        Fraction ans = new Fraction();
        ans.numerator = (fr1.numerator * fr2.denominator) - (fr2.numerator * fr1.denominator);
        ans.denominator = fr1.denominator * fr2.denominator;
        return ans;

    }

    public Fraction multFractions()   {

        Fraction ans = new Fraction();
        ans.numerator  = fr1.numerator * fr2.numerator;
        ans.denominator = fr1.denominator * fr2.denominator;
        return ans;

    }

    public Fraction divFractions()  {

        Fraction ans = new Fraction();
        ans.numerator  = fr1.numerator * fr2.denominator;
        ans.denominator = fr1.denominator * fr2.numerator;
        return ans;

    }
}

