package three.control.flow;

import java.util.Scanner;

/**
 * switch - case - break
 * case - vlastiti blok koda
 * case 1 3 5 - jedan te isti blok koda
 * <p>
 * <p>
 * input:
 * broj godine i broj mjeseca u godini
 * <p>
 * <p>
 * output
 * broj dana u mjesecu
 * <p>
 * <p>
 * Prestupna godina je:
 * - dijeljiva sa 4, a ne sa 100
 * - ili dijeljive godine sa 400
 */

public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("unesi broj godine");
        int year = new Scanner(System.in).nextInt();
        System.out.println("Unesi broj mjeseca u godini");
        int month = new Scanner(System.in).nextInt();

        int monthDayNumbers = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthDayNumbers = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                monthDayNumbers = 30;
                break;
            case 2:
                if((year%4==0 && year%100!=0)||(year%400==0)) {
                    monthDayNumbers = 29;
                }
                    else{
                        monthDayNumbers = 28;
                    }

                    break;
                }
                if(monthDayNumbers==0) {
                    System.out.println("Invalid month");
                }

                    else{
                        System.out.println("Mjesec"+ month + "ima" + monthDayNumbers + "dana u godini" +year);
                    }
                }



        }


