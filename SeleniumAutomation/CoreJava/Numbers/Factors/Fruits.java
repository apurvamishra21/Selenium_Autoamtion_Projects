package Factors;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check(100);

	}
	
	public static void check(int num) {
		
		for(int i = 1 ; i <= num ; i++) {
			
			if(i % 3 == 0 && i % 8 == 0)
			{
				System.out.println("mango");
			}else {
				if(i % 3 == 0 && (i% 8) != 0) {
					
					System.out.println("apple");
					
				}else {
					if((i % 8) == 0 && (i% 3) != 0)
							{
						System.out.println("banana");
							}
				}
			}
			
		}
		
	}

}




/*
print num from 1 to 100
mul of 3 print apple
mul of 8 print banana
mul of both print mango*/