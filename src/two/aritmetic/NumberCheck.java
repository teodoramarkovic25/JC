package two.aritmetic;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        System.out.println("Unesi cijeli broj:");

        int number = new Scanner(System.in).nextInt();

        int remainder = number % 2;
        boolean paran = remainder == 0;
        if(paran) {
            System.out.println("Paran");
        }
            else{
                System.out.println("Neparan");


        }
    }
}
