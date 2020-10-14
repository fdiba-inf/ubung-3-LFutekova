package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        double average = 0.0;
        int counterPositive = 0;
        int counterNegative = 0;
        int number = input.nextInt();

        while(number != 0){

            if(number > 0){
                counterPositive++;
            }else if(number < 0){
                counterNegative++;
            }

            sum += number;

            number = input.nextInt();
        }

        average = (double) sum / (counterNegative + counterPositive);

        System.out.println("Positive numbers: " + counterPositive);
        System.out.println("Negative numbers: " + counterNegative);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
