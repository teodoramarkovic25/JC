package three.control.flow;

import java.util.Locale;
import java.util.Scanner;

// 1.7 - switch String
public class StringSwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesi ime dana na Njemačkom:");
        String weekdayName = new Scanner(System.in).nextLine();
        String upperCaseName = weekdayName.toUpperCase();
        int weekDayNumber = 0;
        switch (upperCaseName) {
            case "MONTAG":
                weekDayNumber = 1;
                break;
            case "DIENNSTAG":
                weekDayNumber = 2;
                break;

            case "MITTWOCH":
                weekDayNumber = 3;
                break;

            case "DONERSTAG":
                weekDayNumber = 4;
                break;

            case "FRIETAG":
                weekDayNumber = 5;
                break;

            case "SAMSTAG":
                weekDayNumber = 6;
                break;

            case "SONNTAG":
                weekDayNumber = 7;
                break;

        }
        if (weekDayNumber == 0) {
            System.out.println("Žao nam je više sreće drugi put ");
        }
        else {
            System.out.println("Odlično. Probajte unijeti i drugi dan. Redni broj unesenog dana na njemačkom je " + weekDayNumber);
        }
    }
}
