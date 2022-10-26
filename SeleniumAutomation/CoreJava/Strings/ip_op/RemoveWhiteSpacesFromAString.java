package ip_op;

public class RemoveWhiteSpacesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(removeWhiteSpaces(" mo bus "));
	}
	static String removeWhiteSpaces(String input){
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for(char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		
		return output.toString();
	}

}
//We can use Character.isWhitespace() method to remove whitespaces from the string.