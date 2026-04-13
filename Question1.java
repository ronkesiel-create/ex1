import java.util.Scanner;

/*public class Question1 {
    /**
     *
     * @param num the number given to check is it prime or not
     * @return true or false depending on the number given
     */

/*
    public static boolean isPrime(int num) {
        // 1 & 2 special cases to for is the number prime or not
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * this function is given a on prime number to factor into its prime number that multiply it
     * @param num the given number
     */
/*
    public static void factor(int num) {
        int numToFactor = num;
        int divider = 2;
        //running while the number can be divided
        while (!isPrime(numToFactor)) {
            if (numToFactor % divider == 0) {
                System.out.print(divider+" * ");
                numToFactor /= divider;
            }
            else  {
                divider++;
            }
        }
        //
        System.out.println(numToFactor+" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number greater than 0: ");
        int num = input.nextInt();
        if (num < 1) {
            throw new IllegalArgumentException("the a number must be greater than 0.");
        }
        System.out.println("1 is not prime. ");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime. ");
            }
            //?
            else {
                System.out.println(i + " is not prime. ");
                factor(i);
            }
        }
        input.close();
    }
/*}
/*
*/