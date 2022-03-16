package six.oop.design.human;
//DRY do nor repeat yourself
// RY repeat yourself

import six.oop.design.animal.Hamster;

public class Student extends Person {
    private String indexNumber;


    public Student() {
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }


}
