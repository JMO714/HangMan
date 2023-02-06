import java.io.*;
import java.util.*;

public class HangMan {
	 
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FINAL int WORD_COUNT = 183719;
		String[] words = new String[WORD_COUNT];
		readWords(words);
		// hangman implementation goes below
		hangman(words);

	}
	
   // Store the words from dictionary.txt in an array
	public static void readWords(String[] words)throws IOException {
		File dict = new File("dictionary.txt");
		try(Scanner in = new Scanner(dict);){
			int i=0;
			while(in.hasNext()) {
				words[i++]=in.next();
			}
		}
		in.close();
	}
	
	public static void hangman(String[] words) {
		Scanner joshua = new Scanner(System.in);
		PrintStream prt = System.out;
		Random rngesus = new Random();
		char[] theWord = words[rngesus.nextInt(WORD_COUNT)].toCharArray();
		char[] allX = placeholder();
		printWord(theWord.length,allX);
		char userPick = joshua.nextLine().charAt(0);
		checkWord(userPick, theWord);
		
	}
	
	public static char[] placeholder(int wordLength) {
		char[] allX = new char[wordLength];
		for(int i = 0; i < wordLength; i++) {
			allX[i] = 'x';
		}
		return allX;
	}
	
	public static void printWord(int wordLength, char[] theWord) {
		prt.printf("(Guess) Enter a letter in word\n");
		for(int i = 0; i < wordLength; i++) {
			if(i == wordLength - 1) {
				prt.printf("s% > ",theWord[i]);
				continue;
			}
			prt.printf("s%\n",theWord[i]);
		}
		
	}
	
	public static void checkWord(char userPick, char[] theWord) {
		
	}
}
