public class SUV extends Fordon {
    private boolean harFyrlHjulsDrift; ;
    private double bagageUtRymme;


   // Konstruktor
    public SUV(String model, String registreringsnummer, double hyrPrisPerDag, boolean harFyrlHjulsDrift, double bagageUtRymme) {
        super(model, registreringsnummer, hyrPrisPerDag);
       this.harFyrlHjulsDrift = harFyrlHjulsDrift;
       this.bagageUtRymme = bagageUtRymme;
    }
    @Override
    public void hyrFordon(int days){
        if (!arHyrd()){
            setArHyrd(true);
            System.out.println("SUVen är hyrd" + days +"dagar");

        } else{
            System.out.println("SUVen är redan hyrd.");


        }
    }

    @Override
    public void lamnaTillbakaFordon(){
        if (arHyrd()){
            setArHyrd(false);
            System.out.println("SUVen har retunerats");

        } else {
            System.out.println("SUVen har inte retunerats");
        }
    }
    @Override
    public double kalkyleraHyrKostnad(){
        return getHyrPrisPerDag();
    }
    public void displaySUVDetails(){
        display();
        System.out.println("Fyr-Hjuls-Drift: " + (harFyrlHjulsDrift ? "Ja" : "Nej"));
        System.out.println("Bagage Ut-Rymme: " + bagageUtRymme + "Kubik meter");
    }
}

