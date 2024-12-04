
public abstract class Fordon implements Hyrning {
    private String model;
    private String registreringsNummer;
    private double hyrPrisPerDag;
    private boolean arHyrd;

    // Konstruktor
    public Fordon(String model, String registreringsNummer, double hyrPrisPerDag) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Modellnamn får inte vara tomt.");
        }
        if (registreringsNummer == null || registreringsNummer.isEmpty()) {
            throw new IllegalArgumentException("Registreringsnummer får inte vara tomt.");
        }
        if (hyrPrisPerDag <= 0) {
            throw new IllegalArgumentException("Hyrespriset per dag måste vara större än 0.");
        }
        this.model = model;
        this.registreringsNummer = registreringsNummer;
        this.hyrPrisPerDag = hyrPrisPerDag;
        this.arHyrd = false;
    }

    // Getter-metoder
    public String getModel() {
        return model;
    }

    public String getRegistreringsNummer() {
        return registreringsNummer;
    }

    public double getHyrPrisPerDag() {
        return hyrPrisPerDag;
    }

    public boolean arHyrd() {
        return arHyrd;
    }

    // Setter för hyrstatus
    public void setArHyrd(boolean hyrd) {
        this.arHyrd = hyrd;
    }

    // Metod för att visa fordonsdetaljer
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Registreringsnummer: " + registreringsNummer);
        System.out.println("Hyrespris per dag: " + hyrPrisPerDag);
        System.out.println("Är hyrd: " + (arHyrd ? "Ja" : "Nej"));
    }




    // Abstrakta metoder
    public abstract void hyrFordon(int days);

    public abstract void lamnaTillbakaFordon();

    public abstract double kalkyleraHyrKostnad();
}