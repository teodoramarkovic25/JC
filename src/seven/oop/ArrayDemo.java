package seven.oop;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Pavle";
        names[1] = "Dado";
        names[2] = "Jeca";
       /* for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);

        }
        */
      for (String name : names){
          System.out.println(name);
      }
        System.out.println("Ispis dinamičke array liste");
        ArrayList<Person> listOfPerson = new ArrayList<>();
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tea");
        listOfNames.add("Jeca");
        listOfNames.add("Dado");
        listOfNames.add("Pavle");
        listOfNames.remove(0);
        String jeca = listOfNames.get(0);
        System.out.println(jeca);
        for (int i = 0; i < listOfNames.size(); i++) {
    String name = listOfNames.get(i);
            System.out.println(name);
        }

    }
}
