package hashSet;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "swadheenta";
		char[] ch = s.toCharArray();
	Set<Character> hs = new HashSet();
		
		for(char c :ch )
		{
			if(!hs.add(c))
			{
				System.out.println(c);
			}
		}

	}

}
