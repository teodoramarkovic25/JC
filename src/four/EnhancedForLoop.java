package four;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 345, 5678, 78, 53, 1000};
        int duzina = numbers.length;
        System.out.println("DUZINA =" + duzina);
        //C++ style
        System.out.println("C++ ispis ");
        for(int i=0; i<numbers.length; i++){
            int number = numbers[i];
            System.out.println("Elementi na ideksu " + i + "=" + numbers[i]);
        }
        System.out.println();
        //kada nas ne zanimaju indeksi napredna java petlja
        System.out.println("Java Enhanced Style");
        for(int number:numbers){
            System.out.println("Element = " + number);
        }

    }
}
