package two.control.flow;
import javax.swing.*;
/*
byte Byte
char
float
double
short  Short
long
int   Integer
boolean
 */
public class IfElseDemo {
    public static void main(String[] args) {
        String numberText = JOptionPane.showInputDialog("Profa unesi broj poena na ispitu:");
        int score = Integer.parseInt(numberText);
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Ocjena na ispitu je:"+ grade);
    }
}
