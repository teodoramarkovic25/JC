package nine.collection;

import nine.oop.Cat;
import nine.oop.Dog;
import nine.oop.Hamster;
import six.oop.design.human.Penzioner;
import six.oop.design.human.Profesor;
import six.oop.design.human.Student;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //double width, double height, String color
        Table teble1 = new Table();
        //double width, double height, String color
        Table teble2 = new Table();
        //double width, double height, String color
        Table teble3 = new Table();

        //Integer, Double, String
        Box<Integer, Double, String> box1 = new Box<>();
        //Cat, Dog, Hamster
        Box<Cat, Dog, Hamster> box2 = new Box<>();
        //Student, Profesor, Penzioner     box3 tipa box, a parametrizirna sa Profesor...
        Box<Student, Profesor, Penzioner> box3 = new Box();

        // numbers tipa List, a List parametrizirana Integerima
        List<Integer> numbers = new ArrayList<>();
    }
}
