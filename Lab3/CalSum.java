public class CalSum{
	public static void main(String[] args) {
		
		int[] a = {2,4,6,8,10};
		int sum = 0;
		
		for(int i=0; i<=4; i++){
			sum=sum+a[i];
		}
		System.out.println("Sum is "+sum);
	}
}