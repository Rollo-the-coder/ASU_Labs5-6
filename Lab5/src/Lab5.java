//========================================
//Lab5.java
//Name : Erik Christian Gotta
//ASU ID : 1222628953
//Time taken to complete this lab: 30
//========================================


import java.util.Scanner;

public class Lab5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number to check if prime");

        int num1 = sc.nextInt();
        boolean answer1 = isPrime(num1);
        System.out.println(answer1);

        System.out.println("Please enter another number to check if prime");

        int num2 = sc.nextInt();
        boolean answer2 = isPrime(num2);
        System.out.println(answer2);


        sc.close();
    }

    static boolean isPrime(int num) {

        int i;
        for (i = 2; i <= (num/2); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }            
        }
        return true;
    }
}
