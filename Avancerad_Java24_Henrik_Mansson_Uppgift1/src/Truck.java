public class Truck extends Fordon {
    private boolean harFyrlHjulsDrift; ;
    private double lastutrymme;

    public Truck(String model, String registreringsnummer, double hyrPrisPerDag, boolean harFyrlHjulsDrift, double lastutrymme) {
        super(model, registreringsnummer, hyrPrisPerDag);
        this.harFyrlHjulsDrift = harFyrlHjulsDrift;
        this.lastutrymme = lastutrymme;
    }
    @Override
    public void hyrFordon(int days){ // hyr fordonet med dagar
        if (!arHyrd()){
            setArHyrd(true);
            System.out.println("Trucken är hyrd" + days +"dagar");

        } else{
            System.out.println("Trucken är redan hyrd.");


        }
    }

    @Override
    public void lamnaTillbakaFordon(){ // retunera fordonet
        if (arHyrd()){
            setArHyrd(false);
            System.out.println("Trycken har retunerats");

        } else {
            System.out.println("Trucken har inte retunerats");
        }
    }
    @Override
    public double kalkyleraHyrKostnad(){ // total kostnaden + hyr pris
        return getHyrPrisPerDag();
    }
    public void displayTruckDetails(){ // visa detaljer
        display();
        System.out.println("Fyr-Hjuls-Drift: " + (harFyrlHjulsDrift ? "Ja" : "Nej"));
        System.out.println("Last Ut-Rymme: " + lastutrymme + "Kubik meter");
    }
}



