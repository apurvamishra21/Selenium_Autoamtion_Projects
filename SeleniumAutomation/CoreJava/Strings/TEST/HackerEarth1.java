package TEST;
import java.util.*;


public class HackerEarth1 {
	
	enum Languages
	{
		Python(10-10+10*10), Java(9+9*9-9) , Angular(12*12-12-12);
		private int coders;
		Languages(int p)
		{
			coders = p;
		}
		int getCoders()
		{
			return coders;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Languages ap;
		
		for(Languages a : Languages.values())
			System.out.println(a + " " + a.getCoders() + "coders.");
		

	}

}
