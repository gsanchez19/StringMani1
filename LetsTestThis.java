package sTRINGmANIPULATOR;
import java.util.Scanner;
public class LetsTestThis
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		Scanner fatRESPONSE = new Scanner(System.in);
		System.out.println("Let's get this bread and give me a word: ");
		String stringUser = userInput.nextLine();
		System.out.println("Which method do you want to run? 1 for noNowels, 2 for reverse" );
		String response = fatRESPONSE.nextLine();
		
		if(response == "1")
		{
			System.out.println(StringManipulator.noVowels(stringUser));
		}
		
		else if(response == "2")
		{
			System.out.println(StringManipulator.reverseRev(stringUser));	
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}