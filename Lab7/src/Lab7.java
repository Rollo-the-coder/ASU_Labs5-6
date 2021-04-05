//========================================
//Lab7.java
//Name : Erik Christian Gotta
//ASU ID : 1222628953
//Time taken to complete this lab: 45 mins
//========================================
import java.util.Scanner;

class Lab7 {
	// Write your main function here
	public static void main(String args[]) {
		// Create an object of the Scanner class for user input
        Scanner sc = new Scanner(System.in);

		// Declare variables needed to store the size of the array
        int sizeArray, index;

		// Declare an integer array
        int array[];

		// Prompt and accept the size of the array from the user
        System.out.println("Please enter the size of the array: ");
        sizeArray = sc.nextInt();

		// Create an array with the given size
        array = new int[sizeArray];

		// Prompt and accept the elements of the array from the user
        for (index = 0; index < sizeArray; index++) {
            System.out.println("Please enter the element of index[" + index + "]");
            array[index] = sc.nextInt();
        }
		// Call displayArray() function to display the array
        System.out.println("Array index and values: ");
        displayArray(array);
		// Call displayNegativeNumbers() function to display the negative numbers in the array
        System.out.println();
        System.out.println("The negative values of the array are: ");
        displayNegativeNumbers(array);
		// Close Scanner object
        sc.close();
	}

	// Function to display array elements
	static void displayArray(int arr[]) {
		// Declare and define a variable to hold the size of the array.    
        int sizeArray = arr.length;

		// Declare a loop variable
        int index;

		// Using an iteration statement, traverse the array in the forward direction and print the elements
        for (index = 0; index < sizeArray; index++) {
            System.out.print("Index [" + index + "] Element Value = " + arr[index] + ", ");
        }
	}

	// Function to display the negative numbers in an array 
	static void displayNegativeNumbers(int arr[]) {
		// Declare and define a variable to hold the size of the array. 
        int sizeArray = arr.length;
		// Declare a loop variable
        int index;
		// Using an iteration statement, traverse the array in the forward direction 
		// Use an if statement to determine if an element of the array is positive or negative.
		// Display the negative elements
        for (index = 0; index < sizeArray; index++) {
            if (arr[index] < 0) {
                System.out.print(arr[index] + ", ");
            } 
        }
	}
}
