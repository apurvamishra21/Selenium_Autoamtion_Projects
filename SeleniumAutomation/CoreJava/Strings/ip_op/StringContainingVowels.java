package ip_op;

public class StringContainingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false

	}

	public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}

}
