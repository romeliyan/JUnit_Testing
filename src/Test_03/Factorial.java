package Test_03;

public class Factorial {
	
	public double factorial(double num) {
		if(num < 0) {
			num = num * -1;
			return (num * factorial(num -1));
		}
		else if(num == 0) {
			return 1;
		}
		else {
			return (num * factorial(num-1));
		}
	}

}
