package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	
	static String[] array = new String[] {"1","2","3","4","5"};
	
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		printArray(array);
		System.out.println();
		printBackwardsArray(array);
		System.out.println();
		printSkipArray(array);
		System.out.println();
		printRandomArray(array);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printArray(String[] val) {
		for(int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printBackwardsArray(String[] val) {
		for(int i =  val.length-1; i > -1; i--) {
			System.out.println(val[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printSkipArray(String[] val) {
		for(int i = 0; i < val.length; i+=2) {
			System.out.println(val[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	static void printRandomArray(String[] val) {
		String[] random = new String[val.length];
		
		for(int i = 0; i < val.length; i++) {
			int r;
			if(random[r = new Random().nextInt(val.length)] == null) {
				random[r] = val[i];
			} else {
				i--;
			}
		}
		
		for(int i = 0; i < random.length; i++) {
			System.out.println(random[i]);
		}
	}
}
