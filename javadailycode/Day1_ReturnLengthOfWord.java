package javadailycode;

/*
     Given a string s consisting of words and spaces, return the length of the last word in the string.
     A word is a maximal substring consisting of non-space characters only. 

     Example 1:
              Input: s = "Hello World"
              Output: 5
              Explanation: The last word is "World" with length 5.
*/

public class Day1_ReturnLengthOfWord {

	public static void main(String[] args) {
		
		//First String
		String s = "Hello World";
		System.out.println("First Input String: "+s);
		
		if (s == null || s.length()== 0) {
			System.out.println("Empty String");
		}
		
		/* 
		 * This prints the space character itself too. 
		   To get rid of that, we just increment the index at which we substring by one.*/
		else  {
			String lastWord = s.substring(s.lastIndexOf(" ")+1);
			System.out.println("Last word in the string is: "+lastWord);
			System.out.println("Length of the Last Word is: " +lastWord.length());
		}
		
		//Second String
	       String s1 = "fly me   to   the moon";
	       System.out.println("Second Input String: "+s1);
		
		if (s1 == null || s1.length()== 0) {
			System.out.println("Empty String");
		}
		else  {
			String lastWord2 = s1.substring(s1.lastIndexOf(" ")+1);
			System.out.println("Last Word in the Input String: "+lastWord2);
			System.out.println("Length of the Last Word: " +lastWord2.length());
		}
		
		//Third String
		   String s2 = "luffy is still joyboy";
	       System.out.println("Third Input String: "+s2);
	      
		
		if (s2 == null || s2.length()== 0) {
			System.out.println("Empty String");
		}
		else  {
			String lastWord3 = s2.substring(s2.lastIndexOf(" ")+1);
			System.out.println("Last Word in the Input String: "+lastWord3);
			System.out.println("Length of the Last Word: " +lastWord3.length());
		}
		

	}

}
