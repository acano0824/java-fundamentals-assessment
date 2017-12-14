import java.util.Scanner;


public class Assessment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter a number to square: ");
//        int num = in.nextInt();
//        System.out.println("Your number squared is: " + square(num));

//        System.out.println("Please enter two numbers to add: ");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        System.out.println("Your sum is: " + sum(num1, num2));
//

        System.out.println("Please enter length of the array: ");

        Scanner scnr = new Scanner(System.in);
        int length = scnr.nextInt();
        int[] input = new int[length];

        System.out.println("Please enter numbers: ");

        for (int i = 0; i < length; i++) {
            input[i] = scnr.nextInt();
        }

        double average = average(input);

        System.out.println("Average of all numbers in array is " + average);
        scnr.close();
    }

    public static int square(int num) {

     return num * num;

    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double average(int[] input) {
        double sum = 0f;
        for (int number : input) {
            sum = sum + number;
        }
        return sum / input.length;
    }



}
