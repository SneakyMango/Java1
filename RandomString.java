package RandomString;
import java.util.Random;

/*
 * this code show how to display random strings 
 * https://www.youtube.com/watch?v=CZYeTblcOU8
 */

public class RandomString {

	private static char randomString;

	public static void main(String[] args) {
		//a string of array is just indexes of values
		
		String characters = "ACBDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		//set string of how long you want to make it.
		int length = 5; //5 is how long it will be .
		
		Random rand = new Random();  //creating random object
		
		//use character array char is the type . name it is "text".
		//char[] is empty of array of characters.. it holds five value as length =5 l
		char[] text = new char[length];  //size is length. use length to store words
		
		//for loops to add each individual random character
		for(int i = 0; i < length; i++) {
			//call the array
			//inside .charArt is the index.you add random and max number to what you what it to stop (bound)
			text[i] = characters.charAt(rand.nextInt(characters.length())); //characters.length is the characters of 26  
		
		}
		
		//turn array into one string 
		//add characters from the array to the string
		//"int" is type. 
		for(int i = 0; i< text.length; i++) {
			randomString += text[i];  //array of that index"i"
			
		}
		
		System.out.println(randomString);

	}

}
