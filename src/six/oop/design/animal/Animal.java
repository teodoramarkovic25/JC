package six.oop.design.animal;

import five.oo.Gender;

public abstract class Animal {
    private int uniqueNumber;
    private String name;
    private Gender gender;

    public Animal(int uniqueNumber, String name, Gender gender) {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.gender = gender;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public abstract void playSound();
}
