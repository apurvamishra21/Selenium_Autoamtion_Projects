package Swap;

public class Swap2StringsWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping : ");
		System.out.println("The value of a is : " + a );
		System.out.println("The value of a is : " + b );
		
		//1.append a and b
		a = a+ b;
		//2.store initial string a in string b
		b = a.substring(0, a.length()-b.length());
		//3.store initial string b in string a
		a = a.substring(b.length());
		
		System.out.println("The value of a and b after swapping : ");
		System.out.println("The value of a is : " + a );
		System.out.println("The value of a is : " + b );

	}

}
