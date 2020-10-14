package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;

        do{
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();

            if(a + c > b && a + b > c && b + c > a){
              double s = (a + b +c) / 2;
              double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
              String triangleType;

              if(a == b && a == c){
                  triangleType = "equilateral";
              }else if(a == b || a == c){
                  triangleType = "isosceles";
              }else {
                  triangleType = "scalene";
              }

              System.out.println("Area: " + area);
              System.out.println("Triangle: " + triangleType);
            }else{
                System.out.println("Values are not correct!");
            }
        }while(a <= 0 || b <= 0 || c <= 0);
    }
}
