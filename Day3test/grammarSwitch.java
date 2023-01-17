package day_4;

public class grammarSwitch {

	public static void main(String[] args) {
		
		char c = (char) (Math.random() * 26 + 'a'); //execute random character using math class
		System.out.println("The character is " + c + "."); //print out the random character
		
		switch(c) { 
		
		case 'a' :		//print vowel if the random character is a vowel
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("It's a vowel.");
			break;
			
			
		default:	//print consonant if the random character is a cosonant
			System.out.println("It's a consonant.");
			
		}

	}

}
