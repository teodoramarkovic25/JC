package four;

public class LoopTask {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'd', 'g'};
        char[] copyTo = new char[8];
        // int j=0;
        //2    0
        //3    1
        //4    2
for(int i = 2; i<10; i++){
    copyTo[i-2]=copyFrom[i]; //copyTo j++


}
        System.out.println(copyTo);

    }
}
