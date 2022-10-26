package numbers;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial(1111111111);
	}
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
/*
The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number. F(n) = F(1)*F(2)…F(n-1)*F(n). We can use recursion to find the factorial of an integer.*/