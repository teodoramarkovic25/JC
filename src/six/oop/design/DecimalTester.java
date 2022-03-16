package six.oop.design;

public class DecimalTester {
    //ne znamo sa ovim prostim kada će biti tačno kada ne, razlikuju se u nekoj decimali   bigdecimal koristićemo
    public static void main(String[] args) {
        float number1 = 0.1f;
        double number2 = 0.1;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number1==number2);//true
    }
}
