package exercise3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean prime = true;

        if(number % 2 != 0){
            int index = number - 2;
            while(index > 1){
                if(number % index == 0){
                    prime = false;
                    break;
                }
                index -= 2;
            }
        }else{
            prime = false;
        }

        System.out.println("Prime number: " + prime);
    }
}
