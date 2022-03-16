package seven.oop;

import five.oo.Gender;
import six.oop.design.animal.Dog;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Objects;

public class Person{ //implements Comparable
    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;
    private int age;


    public Person(int id, String name, String surname, LocalDate birthday, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Person() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }
public void  printYourself(){
    System.out.println(id + ":"+ name +  " ," + surname + "," + birthday +", "+ age+""+ getAge()+ "spol" + gender );
}

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now); //21 11 29
        System.out.println("Godine = " + period.getYears());
        System.out.println("Mjeseci = " + period.getMonths());
        System.out.println("Dani = " + period.getDays());
        return period.getYears();
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "" + surname;
    }

    @Override
    public int hashCode() {
        int hashValue = Objects.hash(id, name, surname, birthday, gender);
        return hashValue;
    }

    //Person p = new Person
    //Person p2 = new Person
    //Dog dog = new Dog
    //p.equals(dog)
    // p.equals(p2)

    @Override
    public boolean equals(Object object) {
        if (object instanceof Person) {
            return false;
        }
        Person comparedPerson = (Person) object;
        return id == comparedPerson.getId()
                && name.equals(comparedPerson.getName())
                && surname.equals(comparedPerson.getSurname())
                && gender.equals(comparedPerson.getGender())
                && birthday.equals(comparedPerson.getBirthday());
    }
}
// p1.compareTo(p2);
    // -1 ako je p1 manje od p2
    // 0 ako su p1 i p2 jednaki
    // 1 ako je p1 veći od p2



       /* @Override
        public int compareTo (Object anotherPerson){
            int result = name.compareTo(anotherPerson.getName());
            if (result == 0) {
                result = surname.compareTo(anotherPerson.getSurname());
            }
            if (result == 0) {
                result = birthday.compareTo(anotherPerson.getBirthday());
            }
            if (result == 0) {
                if (id == anotherPerson.getId()) {
                    result = 0;
                } else if (id < anotherPerson.getId()) {
                    result = -1;
                } else {
                    result = 1;
                }
            }
            return result;
        }
    }
}
    */


       /* int result = name.compareTo(getName()); //o.getName
        if (result == 0) {
            result = surname.compareTo(0.getSurname);
        }
        if(result == 0){
            result = birthday.compareTo(o.getBirthday);

        }
*/

