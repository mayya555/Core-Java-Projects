package Methods.withoutargwithreturn;


//program demonstrating recursion
public class Recursion {
	
	public static void printNumbers1ToN(int n) {
		
		//base condition
		if(n==0) {
			return;
		}
		
		//recursive call
		printNumbers1ToN(n - 1);
		System.out.println(n);
	}
	

	public static void main(String[] args) {
		
		int n=10;
		System.out.println("Numbers from 1 to  "+ n);
		printNumbers1ToN(n);

	}

}
