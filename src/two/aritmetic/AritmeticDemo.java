package two.aritmetic;

import java.util.Scanner;

/*<li> 1. Additive + </li>
<li> 2. Subtraction - </li>
<li> 3. Multiplication * </li>
<li> 4. Division   /  </li>
<li> 5. Remainder ili modulo operator  %   </li>*/

public class AritmeticDemo {

    public static void main(String[] args) {
        System.out.println("Unesi prvi broj:");

        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi sada i drugi broj:");
        int  number2 = new Scanner(System.in).nextInt() ;
     int suma = number1 + number2;
        System.out.println("Suma brojeva je:" + suma);
        int razlika = number1 - number2;
        System.out.println("Razlika unesenih brojeva je:" + razlika);

        int product = number1 * number2;
        System.out.println("Proizvod je:" + product);

        int division = number1/number2;
        System.out.println("Rezultat dijeljenja je:"+ division);

        int remainder = number1%number2;
        System.out.println("Modulo result:" + remainder);

    }
}
