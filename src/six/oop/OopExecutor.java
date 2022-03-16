package six.oop;

public class OopExecutor {
    public static void main(String[] args) {
        int number = 23;
        number = 13;
        int[] numbers = new int[3];

        numbers[0] = 13;
        numbers[1] = 23;
        numbers[2] = 16;

        Person person1 = new Person("Tea", "Marković", 17);
        person1.setName("Tea");
        person1.setSurname("Marković");
        person1.setAge(24);

        Person person2 = new Person("Teodora", "Marković");
        Person teodora = createPerson("Teodora", 17);
        String name = "Teodora";

    }


    private static Person createPerson(String name, int age) {
        String surname = "Marković";
        Person person = new Person(name, surname, age);
        return person;
    }
}
