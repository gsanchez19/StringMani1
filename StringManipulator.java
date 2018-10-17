package sTRINGmANIPULATOR;

public class StringManipulator {

	
	
	public StringManipulator() 
	{
		
	}
	
	
	public static String noVowels(String userString)
	{
		String newString = userString;
		for(int i = 0; i < userString.length(); i++)
			if(userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i')
			{
				newString = newString.substring(0, i) + '*' + newString.substring(i+1);
			}
		
			else if(userString.charAt(i) == 'o' || userString.charAt(i)=='u')
			{
				newString = newString.substring(0, i) + '*' + newString.substring(i + 1);
			}
		
			else if(userString.charAt(i) == 'A' || userString.charAt(i)=='E' || userString.charAt(i)=='I')
			{
				newString = newString.substring(0, i) + '*' + newString.substring(i + 1);
			}
		
			else if(userString.charAt(i) == 'O' || userString.charAt(i)=='U')
			{
				newString = newString.substring(0, i) + '*' + newString.substring(i + 1);
			}
		
		return newString;
	}
	
		public static String reverseRev(String userString)
		{
			String newString = userString;
			for(int i = 0; i < userString.length(); i++) 
			{
				newString = newString.substring(userString.length(), i) + newString.charAt(i) + userString.substring(i, 0);
			}
			
			return newString;
		}
	
	
	
	
	
	
	
	
	
	
	
}
