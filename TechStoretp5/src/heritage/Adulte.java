package heritage;

public class Adulte extends Personne {
    private String profession;

    public Adulte(String nom, int age, String telephone, String profession) {
        super(nom, age, telephone);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return super.toString() + ", profession : " + profession;
    }
}