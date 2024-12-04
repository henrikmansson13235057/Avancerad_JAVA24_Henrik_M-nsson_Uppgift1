public class Bil extends Fordon {
    private int saten;
    private String Drivmedel;

    public Bil(String model, String registreringsnummer, double hyrPrisPerDag, int saten, String Drivmedel) {
        super(model, registreringsnummer, hyrPrisPerDag);
        this.saten = saten;
        this.Drivmedel = Drivmedel;
    }
    @Override
    public void hyrFordon(int days){
        if (!arHyrd()){
            setArHyrd(true);
            System.out.println("Fordon  är hyrd" + days +"dagar");

        } else{
            System.out.println("Bilen är redan hyrd.");


        }
    }

    @Override
    public void lamnaTillbakaFordon(){
        if (arHyrd()){
            setArHyrd(false);
            System.out.println("Bilen har retunerats");

        } else {
            System.out.println("Bilen har inte retunerats");
        }
    }
    @Override
    public double kalkyleraHyrKostnad(){
        return getHyrPrisPerDag();


        }
    }

