package six.oop.design.human;

import six.oop.design.animal.Cat;
import six.oop.design.animal.Dog;
import six.oop.design.animal.Hamster;

public class Profesor extends Person {

    private double salary;


    public Profesor() {
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
