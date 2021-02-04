public class DayOfWeek {
    public static void main(String[] args) { 
    	
        int day = 20;
        int month = 8;
        int year = 2020;
        
        int d0 = 0;
        /* Please insert your code from here */
        
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        d0 = (day + x + (31*m0) / 12) % 7;

        System.out.println("The day of the week is " + d0);
    }
}