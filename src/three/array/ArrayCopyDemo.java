package three.array;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
//1.način
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'd', 'g'};
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        System.out.println(copyTo);
//2.NAČIN
        char[] copyFrom1 = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'd', 'g'};
        char[] copyTo1 = Arrays.copyOfRange(copyFrom1, 2, 10 );
        System.out.println(copyTo1);
    }
}