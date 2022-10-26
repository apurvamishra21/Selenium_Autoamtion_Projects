package com.Characters;

public class CharIsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "swadheenta";
		//case-1
		char expch = 'z';
		int index = s.indexOf(expch);
		 if(index == -1) {
			 System.out.println(expch + " is not  present in " + s); 
	}
		 else{
			 System.out.println(expch + " is  present in " + s); 
		 }
		//case2
		 String exp = expch + "";
		 if(s.contains(exp))
		 {
			 System.out.println(expch + " is not  present in " + s); 
	}
		 else{
			 System.out.println(expch + " is  present in " + s); 
		 }
		 //case3
		 boolean flag = false;
		 for(int i= 0 ; i < s.length() ;i++)
			{
			 char ch = s.charAt(i);
			 if(ch == expch)
			 {
				 flag = true;
				 break;
			 }
			 if(flag)
			 {
				 System.out.println(expch + " is  present in "  + s); 
				}
					 else{
						 System.out.println(expch + " is not  present in " + s); 
			 }
			}
	}

}
