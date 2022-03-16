package four.branching;

public class ContinueDemoSecondWay {
    public static void main(String[] args) {

        String searchMe1 = "petar pan je pojeo ljute paprike i pošandrcao";
        int brojac = 0;
        for (int i = 0; i < searchMe1.length(); i++) {
            char slovo = searchMe1.charAt(i);
            if (slovo != 'p') {
                continue;
            }
            brojac++;

        }
        System.out.println("Slovo p se ponavlja" + brojac + "puta");
    }
}
