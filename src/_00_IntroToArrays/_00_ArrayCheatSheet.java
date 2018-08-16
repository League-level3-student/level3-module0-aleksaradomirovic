package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = new String[5];
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "potato";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < array.length; i++) {
			array[i] = "potato";
		}
		//6. use a for loop to print all the values in the array
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//7. make an array of 50 integers
		int[] intarray = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random rnd = new Random();
		for(int i = 0; i < intarray.length; i++) {
			intarray[i] = rnd.nextInt();
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestIndex = 0;
		for(int i = 0; i < intarray.length; i++) {
			if(intarray[i] < intarray[smallestIndex]) {
				smallestIndex = i;
			}
		}
		System.out.println(intarray[smallestIndex] + "\n");
		
		//10 print the entire array to see if step 8 was correct
		for(int i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}
		//11. print the largest number in the array.
		int largestIndex = 0;
		for(int i = 0; i < intarray.length; i++) {
			if(intarray[i] > intarray[largestIndex]) {
				largestIndex = i;
			}
		}
		System.out.println("\n"+intarray[largestIndex]+"\n");
		//12. print only the last element in the array
		System.out.println(intarray[intarray.length-1]);
	}
}
