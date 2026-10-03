package Methods.withoutargwithreturn;

public class Factorial {
	public static int factorial(int n) {
		
		//base condition
		if( n==0 || n==1) {
			//System.out.println();
			return 1;
		}
		
		//Recursive call
		 int result = n*factorial(n-1);
		 return result;
	}

	public static void main(String[] args) {
		
		int num = 5;
		int result = factorial(num);
		System.out.println(result);
	}

}
