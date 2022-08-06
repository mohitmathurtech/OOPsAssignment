package learning;

public class CheckPallindrome {
/**
 * To check the string is pallindrome JAVA LEVEL AKA
 * @param args
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AKA";
		
		System.out.println(str);
		System.out.println(checkPal(str));
	}
	
	public static boolean checkPal(String str) {
		boolean result =  false;
		int n = str.length();
			if(str.length() % 2 == 0) {
			return result;
			}
		else {
			result = true;
			for(int i=0; i < (n+1)/2; i++) {
				if(str.charAt(i) != str.charAt(n-1-i)) {
					return false;
				}
			}
		
			}
			return result;
	}
}
