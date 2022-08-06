package learning;

public class PowerXtoN {
	
	public static long power(int n , int x) {
		
		if(n==0) {
			return 1L;
		}
		
		long pow = power(n/2 , x);
			// if n is odd
			if( (n % 2) == 1) {
				return x * pow * pow;
			}
			
			// if n is even
			return pow * pow;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10 , x = 2;
		
		System.out.println("Inputs x = " + x + "  n = " + n);
		System.out.println("Output "+ x + " to power " + n + " is : " + power(n,x)); 
	}

}
