package com.words;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "what you seek is seeking you";
		
		String[] words = s.split(" ");
		String revString = "";
		for(String word : words)
		{
			String revWord = "";
			for(int i = word.length()-1 ; i >= 0 ; i--)
			{
				revWord = revWord + word.charAt(i);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);

	}

}
