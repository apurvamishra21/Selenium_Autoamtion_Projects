package com.words;



public class ShortestWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = "Today is the happiest day of my life";
	
	    String[] words = s.split(" ");
		String shortestword = words[0];
	    for (int i = 1; i < words.length; i++){
	        if ( words[i].length() < shortestword.length() ){
	            shortestword = words[i];

	        }
	    }
	    System.out.printf(shortestword);

	}

}
