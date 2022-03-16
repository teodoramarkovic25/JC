package four.branching;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] twoDimArray = {
                {32, 87, 34, 589},
                {818, 1076, 234, 1111},
                {622, 999, 77, 190}
        };
        System.out.println("Unesite broj i okušaj sreću:");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        TEA: for (int i = 0; i < twoDimArray.length; i++) {
            int[] element = twoDimArray[i];
            for (int j = 0; j < element.length; j++) {
                int broj = twoDimArray[i][j];
                if (uneseniBroj == broj) {
                    foundIt = true;
                    break TEA;
                }

            }
        }
String message = foundIt ? "čestitamo" : "Okušajte sreću drugi put";
        System.out.println(message);
    }
}
