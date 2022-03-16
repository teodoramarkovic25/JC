package one;

import javax.swing.*;

/*
TIP varijabla = podatak;
 */
public class Program {

    public static void main(String[] args) {
        //32-bitni
        int number1 = 26;
        int number2 = 23;
        byte number3 = 24;
        //automatsku konverziju tipa
        int broj = number3;
        long longNumber = 234L;
        //eksplicitna konverzija tipa
        broj = (int) longNumber;
        int broj2 = 23;
        System.out.println(broj2);
        broj2 = 34;
        System.out.println(broj2);


        float decimalniBroj = 23.45F; //32
        double decimalniBroj1 = 23.45;

        char slovo = 65; //automatska konverzija u slovo A


        boolean condition = false;

       /* int[] numbers = {23,34,12};
        int x=23; y=12; z=23;*/

    }


}
