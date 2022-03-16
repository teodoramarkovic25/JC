package four.branching;

public class CountinuDemo {
    public static void main(String[] args) {
        //String - niz karaktera
        String searchMe = "petar pan je pojeo ljute paprike i pošandrcao";
        char[] searchMeArray = searchMe.toCharArray();
        int brojac = 0;
        for (int i = 0; i < searchMeArray.length; i++) {
            //zainteresovan samo za p
            char slovo = searchMeArray[i];
            if (slovo != 'p') {
                continue;
            }
            brojac++;
        }
        System.out.println("Slovo p se ponavlja" + brojac + "puta");
    }
}
