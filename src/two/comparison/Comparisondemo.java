package two.comparison;

import java.util.Scanner;

/*
Operatori poređenja:
1. == equal to
2. != not equal to
3. >
4. >=
5. <
6. <=
 */
public class Comparisondemo {

    public static void main(String[] args) {
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        int number2 = new Scanner(System.in).nextInt();
        if (number1 == number2) {
            System.out.println("Jednaki brojevi");
        }
        if (number1 != number2) {
            System.out.println("nejednaki brojevi");
        }
if(number1>number2){
    System.out.println("prvi veći od drugog broja");

}
        if(number1>=number2){
            System.out.println("prvi veći ili je jednak drugom");

        }

        if(number1<number2){
            System.out.println("prvi manji od drugog broja");

        }
        if(number1<=number2){
            System.out.println("prvi manji ili je jednak drugom");

        }
    }
}
