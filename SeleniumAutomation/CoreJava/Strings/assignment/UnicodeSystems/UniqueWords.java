package assignment.UnicodeSystems;

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Designed and developed data driven framework using Selenium web driver, TestNG & Maven. Worked on BDD framework. Worked on Jenkins for script scheduling. Responsible for Framework enhancement. Responsible for creating the Test Estimation, Test Summary Report, providing status in daily team meeting.";
		String[] str = s.split(" ");
		
		for(int i = 0 ; i < str.length ; i++)
		{
			String s1 = str[i];
			int count = 0;
			for(int j = 0 ; j < str.length ; j++)
			{
				String s2 = str[j];
				if(s1.equals(s2) && i > j)
					break;
				if(s1.equals(s2))
					count++;
			}
			if(count == 1)
			{
				System.out.println(str[i] + " present " + count + " times ");
			}
		}

	}

}
//priyanka@unicodesystems.org
