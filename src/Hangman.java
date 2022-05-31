import java.util.*;
public class Hangman {
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		
		String [] dog = "dog".split("");
		System.out.println(Arrays.toString(dog));
		
		String s[] = {"Hello", "Goodbye" , "Computer" , "Science" , "um" , "Do" , "What", "Now"};
		int a[] =  {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2, 53, 4, 5, 62, 7 }; 
		int b[] = {1, 3, 4, 90, -4, 60, 12, 13, 4, -4, -1, 2, 4, 4, 9, 8};
		
		System.out.println(a.length + "a length");
		System.out.println(b.length+ "a length");
		//1
		//2
		int count = 0;
		for ( int i =0; i< a.length; i++) {
			int x = a[i];
			int y = b[i]; 
			
			 int diff = x-y;
			 if(x-y < 0) {
				 diff = -diff;
			 }
			 if( diff < 2 ) {
				 count ++;
			 }
		
		}
		System.out.println(count);
		//3
		for(int i =0; i< a.length -1; i++) {
			if( (a[i] == 2 && a[i+1] == 2) ||  (a[i] == 4 && a[i+1] == 4)) {
				System.out.println("Two/Four!");
				 
			}
			else {
				System.out.println("Not Two/Four!");
			}
			
		}
		
		//4
		int c[] = new int[a.length];
		int j = 0;
		for(int i = a.length-1; i >=0; i--) {
			c[j] = a[j];
			j++;
		}
		 System.out.println(Arrays.toString(a));
		 System.out.println(Arrays.toString(c));
	
	
		//5 
		int max1 = a[0];
		int min1 = a[0];
		for(int i = 0; i< a.length; i++) {
		min1 = Math.min(Math.min(a[i], b[i]), min1);	
		max1 = Math.max(Math.max(a[i], b[i]), max1);	
		}
		System.out.println("min" +min1);
		System.out.println("max" +max1);
		System.out.println("range = "+ (max1 - min1));
		//6
		
		//7
		for(int i =0; i<s.length; i++) {
			System.out.print(s[i].substring(0,1)+" ");
		}
		
		//8
		int e =0;
		
		for(int i =0; i < s.length; i++) {
			if(s[i].substring(s[i].length()-1).equals("e")) {
				e++;
			}}
		
			System.out.println("e =" + e);
			
		//9
			int charcaters = 0;
			for(String words : s) {
				charcaters += words.length();
			}
			
		//10
			int sevenPlusLetters = 0;
			for(int i =0; i< s.length; i++) {
				if(s[i].length() >= 7) {
					sevenPlusLetters++;
				}
				if(sevenPlusLetters >= 2 ) {
					System.out.println("Two len. 7");
					
				}
				else {
					System.out.println("Less than 2 len. 7");
				}
			}
			
		//12 
			int e1 =0;
			
			for(int i =0; i < s.length; i++) {
				for(int j2 =0; j2< s[i].length(); j2++) {
				if(s[i].substring(j2, j2+1).equals("e")) {
					e1++;
				}}}
			
				System.out.println("e =" + e);
		
		//13
			String hiBye[] = {"byhigh", "hit", "byebye!", "hilt"};
			int hi = 0; 
			int bye = 0; 
			for(int i =0; i< hiBye.length; i++) {
				for(int j3 =0; j3 < hiBye[i].length()-2; j3++) {
					if(hiBye[i].substring(j3, j3+2).equals("hi")) {
						hi++;
					}}
					for(int j4 =0; j4 < hiBye[i].length()-3; j4++) {
						if(hiBye[i].substring(j4, j4+3).equals("bye")) {
							bye++;
						}
				}
					System.out.println("hi = " + hi);
					System.out.println("bye = " + bye);
					System.out.println("word = "+ hiBye[i]);
				
			}
		
		
		
		
		
		
		
		
		
		
		
		//Hangman App
		
		String secretWord[] =  "computer".split("");
		System.out.println(Arrays.toString(secretWord));
		String masked[] = new String [secretWord.length];
		for (int i =0; i < masked.length; i++) {
			masked[i] = "_";
		
		}
		System.out.println(Arrays.toString(masked));
		
		for(int i =0; i< masked.length; i++) {
			System.out.print(masked[i] + "");
		}
		System.out.print("Guess a letter : ");
		String letter = scan.next();
		
		int guesses = 5; 
		while(guesses> 0) {
			boolean foundLetter = false;
			for(int i =0; i< secretWord.length; i++) {
				if(letter.equals(secretWord[i])) {
					foundLetter = true;
					masked[i] = letter;
				}
				if(!foundLetter) {
					guesses--;
					
					
				}
				
				for(int i2 =0; i2< masked.length; i2++) {
					System.out.print(masked[i2] + "");
				}
				boolean won = false; 
				for(String blank : masked) {
					if(!blank.equals("_")) {
						won = false;
					}
					
					if(won) {
						System.out.println("You won!");
					}
				}
				
				System.out.println();
				System.out.println("guesses" + guesses);
				System.out.print("Guess a letter:");
				letter = scan.next();
				
			}
		}
}
	}
