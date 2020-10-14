package exercise3;

import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double calculatedAngle = 0;
        char type;
        char newType = ' ';

        do{
            double initialAngle = input.nextDouble();
            String typeString = input.next();
            type = typeString.charAt(0);

            if(type == 'd'){
                calculatedAngle = initialAngle * Math.PI / 180;
                newType = 'r';
            }else if(type == 'r'){
                calculatedAngle = initialAngle * 180 / Math.PI;
                newType = 'd';
            }

            System.out.println("Angle: " + calculatedAngle + newType);
        }while(type == 'd' && type == 'r');
    }
}
