import java.util.Scanner;

public class Question2 {

        public static int sumArray(int[] arr){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
            return sum;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++){
                System.out.println("enter the number in the place of"+(i));
                arr[i] = input.nextInt();
            }
            int sum = sumArray(arr);
            System.out.println("the sum of the array is "+sum);
            input.close();
        }
    }


 
