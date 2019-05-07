package Test_01;

public class Calculator {
	
	public static void main(String [] args) {
		
		//without using JUnit Testing 
		
		MathUtilities math1 = new MathUtilities();
		
		int sum = math1.add(5, 10);
		
		if(sum != 15) {
			System.out.println("Test failed");
		}
		else {
			System.out.println("Test passed");
		}
		
	}

}
