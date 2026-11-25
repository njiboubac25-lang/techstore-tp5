
package heritage;

public class Article {

    private int id;
    private String nom;
    private String reference;
    private double prix;

    public Article(int id, String nom, String reference, double prix) {
        this.id = id;
        this.nom = nom;
        this.reference = reference;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getReference() {
        return reference;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "ID : " + id +
                ", Nom : " + nom +
                ", Référence : " + reference +
                ", Prix : " + prix;
    }
}
