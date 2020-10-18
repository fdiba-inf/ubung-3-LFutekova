package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        int counter = 0;
        int numberToPrint = 0;
        for (int i = 100; i <= 1000; i++) {
            if(i % 5 == 0 && i % 6 == 0){
                numberToPrint = i;
            }else{
                continue;
            }
            if(counter < 9){
                System.out.print(numberToPrint + " ");
                counter++;
            }else if(counter == 9){
                System.out.println(numberToPrint);
                counter = 0;
            }
        }
    }
}
