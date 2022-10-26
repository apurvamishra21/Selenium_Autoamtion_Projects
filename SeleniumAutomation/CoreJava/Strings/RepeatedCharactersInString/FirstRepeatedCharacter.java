package RepeatedCharactersInString;

import java.util.HashSet;

public class FirstRepeatedCharacter {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Map<Character, Long> collect =  "abcsdnvs".chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(findFirstRepeatingCharOfStr(str));
	}
	static char findFirstRepeatingCharOfStr(String str) {
	    str = str.toLowerCase(); // to avoid any case sensitive issue

	    for (int i = 0; i < str.length(); i++) {
	      if (str.lastIndexOf(str.charAt(i)) > i) {
	        return str.charAt(i);
	      }
	    }

	    return 0; // 0 or null if no char is repeating
	  }*/
	
	    // This function prints the first repeated
	    // character in str[]
	    static char firstRepeating(char str[])
	    {
	        // Creates an empty hashset
	        HashSet<Character> h = new HashSet<>();
	 
	        // Traverse the input array from left to right
	        for (int i=0; i<=str.length-1; i++)
	        {
	            char c = str[i];
	 
	            // If element is already in hash set, update x
	            // and then break
	            if (h.contains(c))
	                return c;
	 
	            else // Else add element to hash set
	                h.add(c);
	        }
	 
	        return '\0';
	    }
	 
	    // Driver method to test above method
	    public static void main (String[] args)
	    {
	        String str = "geeksforgeeks";
	        char[] arr = str.toCharArray();
	        System.out.println(firstRepeating(arr));
	    }
	}


//https://stackoverflow.com/questions/39529831/how-to-find-first-repeated-and-non-repeated-character-in-a-string-using-java8 first approach
//For non-repeating simple change if (str.lastIndexOf(str.charAt(i)) == i) 2nd approach