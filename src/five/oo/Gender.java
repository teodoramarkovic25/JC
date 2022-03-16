package five.oo;

public enum Gender {
    male("Muški rod"),
    female("Ženski rod"),
    unknown("Nešto između");


    //MALE FEMALE UNKNOWN
    private String name;

    private Gender(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
