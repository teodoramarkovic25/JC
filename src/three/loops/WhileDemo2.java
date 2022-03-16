package three.loops;

import java.util.Scanner;

// mrtva petlja skener ga umrtvi
public class WhileDemo2 {
    public static void main(String[] args) {
        boolean unesenaPetica = false;
        while (!unesenaPetica) {
            System.out.println("unesi peticu i započni igricu");
            int uneseniBroj = new Scanner(System.in).nextInt();
            if (uneseniBroj == 5) {
                unesenaPetica = true;
            }
        }
    }
}
