package ip_op;

public class RemoveTrailingAndLeadingSpacesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  abc  def\t";
		
		//s = s.strip();//strip is added in java 11
				
		System.out.println(s);

	}

}
/*
Java String class contains two methods to remove leading and trailing whitespaces - trim(), and strip(). The strip() method was added to the String class in Java 11. However, the strip() method uses Character.isWhitespace() method to check if the character is a whitespace. This method uses Unicode code points whereas the trim() method identifies any character having codepoint value less than or equal to �U+0020� as a whitespace character. The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard.

String s = "  abc  def\t";
		
s = s.strip();
		
System.out.println(s);
Since String is immutable, we have to assign the strip() output to the string.*/