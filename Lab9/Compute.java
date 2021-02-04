public class Compute {
    
    public static void main (String args [ ])
    {
        int result, x ;
        x = 1 ;
        result = 0;
        while (x <= 10) {
            if (x%2 == 0) result += x ;
            ++x ;
        }
        System.out.println(result) ;
    }
}