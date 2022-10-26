package strings;

public class LCS {


	
	public String lcs(String s1 , String s2) {
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		for(int i = 1 ; i < s1.length() ; ++i) {
			for(int j = 1 ; j < s2.length(); ++j) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1+ dp[i-1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				
					
			}
			String lcs = "";
			int x = s1.length();
			int y = s2.length();
			
			while(x>0 && y>0)
			{
				if(s1.charAt(x-1) == s2.charAt(y-1)) {
					lcs += s1.charAt(x-1);
					x -= 1;
					y -= 1;
				}else if(dp[x-1][y] > dp[x][y-1]) {
					x -= 1;
				}else {
					y -= 1;
				}
			}
			return new StringBuilder(lcs).reverse().toString();
		}
		return null;
		
		
	}

}
