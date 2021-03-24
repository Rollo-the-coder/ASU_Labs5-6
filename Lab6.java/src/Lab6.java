//========================================
//Lab6.java
//Name : Erik Christian Gotta
//ASU ID : 1222628953
//Time taken to complete this lab: 60
//========================================

class Lab6 {
    public static void main(String[] args) {
        int primePalindromes = 0;
		int number;
        
        // for loop to check 1 - 100,000 for prime palindrome numbers. Starts at 2 since one is not a prime palindrome
        for (number = 1; number <= 100000; number++) {
			if (isPrime(number) == true && isPalindrome(number) == true) {
				primePalindromes++;
                System.out.print(number + ",");
			}
		}
        System.out.println("There is " + primePalindromes + " prime Palindromes in the total of 100,000");
    }

    //function to check if prime
    static boolean isPrime(int num) {
        int i;
        for (i = 2; i <= (num/2); i++) {
            if (num % i == 0 || (num == 2)) {
                return false;
            }            
        }
        return true;
    }

    //function to check if Palindrome number
    static boolean isPalindrome(int num) {
        int copy = num;
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }


        if (copy == reversed) {
            return true;
        } else {
            return false;
        }
    }
}
