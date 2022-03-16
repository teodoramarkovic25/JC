package five.oo;
/* ZADAĆA
Doraditi navedeni primjer ispod i to da provjerite ne samo da li je riječ sadržana u rečenici
 nego i koliko puta je sadranaa
 */
public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "look for a substring";
        String rijec = "sub";
        boolean sadrzi = false;
        int granice = recenica.length() - rijec.length();
        LABELA:
        for (int i = 0; i <= granice; i++) {
            //i=0
            int k = i;
            for (int j = 0; j <rijec.length(); j++) {
                    //i=0
                // j= 0 1 2
char slovoRecenica = recenica.charAt(k);
char slovoRijec = rijec.charAt(j);
if(slovoRecenica!=slovoRijec){
    continue LABELA;
}
            }
k++;
        }
        sadrzi = true;
        String message = sadrzi? "Riječ je sadržana u rečenici": "Rečenica ne sadrži riječ";
        System.out.println(message);
    }
}
