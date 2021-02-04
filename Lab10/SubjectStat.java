import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class SubjectStat {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Find out the maxmum and minimum marks in a class");
		findMaxMin();
		
		System.out.println("\nFind out the grade distribution in a class");
		calGradeDistribution();

	}

	public static void findMaxMin() {

		ArrayList<Integer> markList = new ArrayList<Integer>();
        
        System.out.print("Number of students in the class:");
        int students = input.nextInt();
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= students) {
            System.out.print("Input student " + gradeCounter + " mark:");
            int x = input.nextInt();
            total += x;
            markList.add(x);
            gradeCounter++;
        }

		System.out.println("The maximum mark is " + Collections.max(markList));
		System.out.println("The minimum mark is " + Collections.min(markList));
	}

	public static void calGradeDistribution() {
		
		ArrayList<String> gradeList = new ArrayList<String>();

        boolean cont = true;

        System.out.print("Input student grade:");
        
        String x = input.next();

        if (x.compareToIgnoreCase("q") == 0) {
            cont = true;
        } else {
            gradeList.add(x.toUpperCase());
        }

        while (cont) {
            System.out.print("Input student grade:");
            String y = input.next();

            if (y.compareToIgnoreCase("q") == 0) {
                cont = false;
            } else {
                gradeList.add(y.toUpperCase());
            }

        }
		
		System.out.println("\n\nGrade distribution");
		System.out.println("==============================");
		System.out.println("Fail:\t\t\t" + Collections.frequency(gradeList, "F"));
		System.out.println("Pass:\t\t\t" + Collections.frequency(gradeList, "P"));
		System.out.println("Credit:\t\t\t" + Collections.frequency(gradeList, "C"));
		System.out.println("Distinction:\t\t" + Collections.frequency(gradeList, "D"));
		System.out.println("High Distinction:\t" + Collections.frequency(gradeList, "HD"));

	}

}