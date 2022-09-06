package javadailycode;

public class Day1_LengthOfLastWord {

	public static void main(String[] args) {
		
		String inputString = "Hello World";
		
		String[] words = inputString.split(" ");
		
		String lastWord = words[words.length-1];
		
		System.out.println(lastWord.length());
		
		

	}

}
