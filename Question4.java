/*import java.util.Scanner;

public class Question4 {

    public static int sumDigits(int num) {
        if (num < 1) {
            return 0;
        }
        int count = 0;
        while (num >= 1) {
            num = num / 10;
            count++;
        }
        return count;
    }
/*
    /**
     *
     * @param num the number given to reverse it
     * @return the number given written in reverse
     */
    //123

    /*
    public static int reverseNumber(int num) {
       int power = 0;
       int d = sumDigits(num);
       int reversed = 0;
       int digit = 0;
       for(int i = d-1; i>=0; i--){
           power=(int)Math.pow(10,i);
           digit =num%10;
            reversed += digit*power;
            num/=10;
       }
       return reversed;
    }

    /**
     *
     * @param num the number given to check is it's palindrome or not
     * @return true or false depending on if the  number given is palindrome or not
     */
/*
    public static boolean isPalindrome(int num) {
        int reversed = reverseNumber(num);
        if(num==reversed){
            return true;
        }
        else{
            return false;
        }
    }
    //12345

    /*
    /**
     *
     * @param num the number given to make a palindrome
     * @return a palindrome number
     */
/*
    public static int makePalindrome(int num) {
        while (!isPalindrome(num)) {
            num = reverseNumber(num);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IO.println("Please enter a number: ");
        int num = input.nextInt();
        int numPalindrome = makePalindrome(num);
        System.out.println("the palindrome number is: " + numPalindrome);
        input.close();
    }

}

*/
