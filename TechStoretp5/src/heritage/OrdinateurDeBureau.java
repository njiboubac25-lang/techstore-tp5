
package heritage;

public class OrdinateurDeBureau extends Ordinateur {

    private String alimentation;

    public OrdinateurDeBureau(int id, String nom,
            String reference, double prix,
            double resolutionEcran, String processeur,
            long ram, SystemeExploitation systemeExploitation,
            long disqueDur, String carteGraphique,
            String alimentation) {

        super(id, nom, reference, prix,
                resolutionEcran, processeur, ram,
                systemeExploitation, disqueDur, carteGraphique);

        this.alimentation = alimentation;
    }

    @Override
    public int garantirAppareil() {
        return 1;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Alimentation : " + alimentation;
    }
}
