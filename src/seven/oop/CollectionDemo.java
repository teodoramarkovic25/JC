package seven.oop;

import java.util.*;
//import java.util.TreeSet; bolje samo što nam treba importovati


public class CollectionDemo {
    public static void main(String[] args) {
        List<String> listOfNames = new LinkedList<>();
        listOfNames.add("Tea");
        listOfNames.add("Tea");
        listOfNames.add("Jeca");
        listOfNames.add("Dado");
        listOfNames.add("Pavle");
        listOfNames.add("Pavle");
       /* for (int i = 0; i < listOfNames.size(); i++) {
            String name = listOfNames.get(i);
            System.out.println(name);
            }
        */
        for(String name :listOfNames){
            System.out.println(name);
        }

        System.out.println();
        System.out.println("Idu setovi");
       Set<String> setOfNames = new TreeSet<>();
        setOfNames.add("Tea");
        setOfNames.add("Tea");
        setOfNames.add("Jeca");
        setOfNames.add("Dado");
        setOfNames.add("Pavle");
        setOfNames.add("Pavle");
        for(String name : setOfNames){
            System.out.println(name);
        }
/*Container<String> container = new Container<>();
        for(String o:container){

        }
*/
}
    }

