import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question4Test {

    @Test
    void reverseNumber() {
        int num1 = 1;
        int num2 = 11;
        int num3 = 345;
        int num4 = 12345;
        int num5 = 54345;
        int num6 = 112211;
        int num7 = 141321;
        int reversed = Question4.reverseNumber(num1);
        int reversed2 = Question4.reverseNumber(num2);
        int reversed3 = Question4.reverseNumber(num3);
        int reversed4 = Question4.reverseNumber(num4);
        int reversed5 = Question4.reverseNumber(num5);
        int reversed6 = Question4.reverseNumber(num6);
        int reversed7 = Question4.reverseNumber(num7);
        System.out.println(reversed);
        System.out.println(reversed2);
        System.out.println(reversed3);
        System.out.println(reversed4);
        System.out.println(reversed5);
        System.out.println(reversed6);
        System.out.println(reversed7);
    }

    @Test
    void isPalindrome() {

    }

    @Test
    void makePalindrome() {
    }

    @Test
    void sumDigits() {
        int num = 32525255;
        int sum = Question4.sumDigits(num);
        System.out.println(sum);
    }

}

 
