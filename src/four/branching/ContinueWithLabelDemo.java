package four.branching;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "Potraži mene ti. Možda me i pronađeš.";
        String rijec = "men";
        boolean sadrzana = false;
        LABELA:
        for (int i = 0; i < recenica.length(); i++) {
            //i=0
            for (int j = 0; j < rijec.length(); j++) {
                //i=0
                char slovoRecenica = recenica.charAt(i+j);
                //j=0,1,2
                char slovoRijec = rijec.charAt(j);
                //p poredi m  e i n nećemo ni razmatrati
                if (slovoRijec != slovoRecenica) {
                    continue LABELA;
                }
            }

            sadrzana = true;
            break;
        }
        System.out.println(sadrzana ? "Rijec postoji u recenici" : "rijec ne postoji");
    }
}
