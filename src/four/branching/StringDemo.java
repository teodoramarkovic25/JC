package four.branching;

public class StringDemo {
    public static void main(String[] args) {
        char slovo = 'X';
        //poziv konstruktora klase String da se kreira varijabla name
        String name = new String("Tea");//.intern();
        //String literal
        String name2 = "Tea";
        String name3 = "Tea";
        System.out.println(name2 == name3);//true
        System.out.println(name == name2);//false
        System.out.println(name2.equals(name3));//true
        System.out.println(name.equals(name2));//true
    }
}
