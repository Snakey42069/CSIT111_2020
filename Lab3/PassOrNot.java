public class PassOrNot {

	public static void main(String[] args) {
		
		int marks = Integer.parseInt(args[0]);

		if(marks >= 48) {
			if (marks >= 50) {
				System.out.println("Passed");
            } else if (marks <=49) {
                System.out.println("WS");
            }    
        } else {
			System.out.println("Fail");
        }
	}
}