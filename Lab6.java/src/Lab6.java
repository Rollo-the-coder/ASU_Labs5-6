class Lab6 {
    public static void main(String[] args) {
        int primePalindromes = 0;
		int number = 1;
        
        //System.out.println("Please enter a number to check if its a prime Palindrome! ");

        for (number = 1; number <= 100000; number++) {
			if (isPrime(number) == true && isPalindrome(number) == true) {
				primePalindromes++;
			}
		}
        System.out.println("There is " + primePalindromes + " prime Palindromes in the number 100,000");
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
