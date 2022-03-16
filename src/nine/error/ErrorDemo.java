package nine.error;

import seven.oop.Person;

// Regularan tok izvršavanja programa:
//1.kreiram niz 2. ubacim vrijednosti u niz 3. ispisujem elemente u konzolu
public class ErrorDemo {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0]= 23;
        numbers[1]= 123;
        numbers[2]= 1000;
        numbers[3]= 120;
       // numbers[4]= 1203; // ArrayIndexOutOfBoundsException = new;
        Person p = null;
     //   consumePerson(p);

        double number1 = 23.0;
        double result = number1/0; // greška infinity
        System.out.println(result);

        for(int number:numbers){
            System.out.println(number);
        }
    }
    static void consumePerson(Person p){
        System.out.println(p.getName());//NullPointerException
    }
}
