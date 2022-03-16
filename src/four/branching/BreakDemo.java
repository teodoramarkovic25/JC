package four.branching;

import java.util.Scanner;

/**
 * nagradna igrica
 * imamo skup brojeva
 * korisnik unese broj
 * ukoliko pogodi nagrada ako ne utješna rečenica
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] numbers = {32, 87, 3, 578, 1076, 8, 644, 127};
        System.out.println("Unesi broj i okušaj sreću");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        for(int i=0; i<numbers.length; i++){
            int broj = numbers[i];
            if(uneseniBroj==broj){
                foundIt = true;
                break;
            }
        }
String message = foundIt ? "Čestitamo" : "Više sreće drugi put";
        System.out.println(message);
    }
}
