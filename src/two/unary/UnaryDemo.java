package two.unary;

/*
1. + positive numbers
2. - negative numbers
3. ++ inkrement
3.1. post inkrement
3.2. pre inkrement
4. -- dekrement
4.1. post dekremnet
4.2. pre dekrement
5. ! logical complement invertovanje boolean vrijednosti
 */
public class UnaryDemo {

    public static void main(String[] args) {

        int number = 23;
        System.out.println("Number:" + number);
        number++;
        System.out.println("Uvećan broj:" + number);

        number=23;
        ++number;
        System.out.println("Uvećan broj:" + number);
        number=23;
        System.out.println(number++);//23 prvo šalji u konzolu pa povećaj za 1
        System.out.println(number);//24
        number=23;
        System.out.println( ++number);//24 prvo povećaj za 1 pa šalji u konzolu



        number=23;
        System.out.println(number--);//23
        System.out.println(number);//22
        number=23;
        System.out.println(--number);//2

        boolean paran = false;
        boolean neparan =!paran;
        System.out.println(neparan);
    }
}
