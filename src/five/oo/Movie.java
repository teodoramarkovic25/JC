package five.oo;

/**
 * Definicija:
 * deklaracija paketa, modifikator vidljivosti class ImeKlase
 * <li> 1. public </li>
 * <li> 2. protected </li>
 * <li> 3. bez ključne riječi - paketna vidljiva </li>
 * <li> 4. private </li>
 *
 *
 * <h1> Sadržaj </h1>
 * Klasa može imati
 * <ol>
 *     <li> POLJA ili Properties ili atributi </>
 *     Static ili nestatic (objektna, instancna)
 *     <li> KONSTRUKTOR </li>
 *     <li> funkcije ili metode </li>
 *     static ili nestatic(objektne ili instancne)
 * </ol>
 */

public class Movie {   //extends Object
    public static int counter = 0;
    private String title;
    private String director;
    private int review;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public Movie() {
        super();
        counter++;
        System.out.println("Još jedan film...");
    }

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
    public Movie(String title, int review) {
        this.title = title;
        this.review = review;
    }

    public void setReview(int ocjena) {
        if (ocjena >= 1 && ocjena <= 10) {
            review = ocjena;
        }
    }

    public int getReview() {
        return review;

    }
}
