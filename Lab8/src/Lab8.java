//========================================
//Lab8.java
//Name : Erik Christian Gotta
//ASU ID : 1222628953
//Time taken to complete this lab: 60 mins
//========================================
import java.util.Scanner;
class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //collecting string input
        System.out.println("Please enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        //sharing the length of each string
        System.out.println("String one length: " + str1.length());
        System.out.println("String two length: " + str2.length());

        //testing the strings for alphanumberic
        if (str1 != null && str1.matches("^[a-zA-Z0-9]*$")) {
            System.out.println("String One is Alphanumberic");
        } else {
            System.out.println("String One is NOT Alphanumberic");
        }

        if (str2 != null && str2.matches("^[a-zA-Z0-9]*$")) {
            System.out.println("String two is Alphanumberic");
        } else {
            System.out.println("String two is NOT Alphanumberic");
        }

        //calling of string comparision and output
        boolean comparison = compareStrings(str1, str2);

        if (comparison == true) {
            System.out.println("str1 and str2 are equal!");
        } else {
            System.out.println("str1 and str2 are not equal!");
        }
        
        sc.close();
    }
    //method for checking if strings are the same, considering case
    static boolean compareStrings(String s1, String s2) {
        if ( s1.equals(s2) == true )
        {
          return true;  
        }
        else
        {
          return false;
        }
        
    }

}
