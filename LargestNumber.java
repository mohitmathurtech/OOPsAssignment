package learning;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {11, 2, 2};
		greatestNumber(input);
		System.out.println("Output = " +  Arrays.toString(input));
	}
	
	//to sort the input arrray
	public static String greatestNumber(int[] num) {
		int n = num.length;
		for (int i =0; i<n; i++) {
			for(int j=i; j<n ; j++) {
				if(num[j]< num[i]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}	
		return num.toString();
	}	
}

