public class Convertible extends Fordon {

        private boolean harAtoumatisktTak;


        public Convertible(String model, String registreringsnummer, double hyrPrisPerDag, boolean harAtoumatisktTak) {
            super(model, registreringsnummer, hyrPrisPerDag);
            this.harAtoumatisktTak = harAtoumatisktTak;
        }
        @Override
        public void hyrFordon(int days){
            if (!arHyrd()){
                setArHyrd(true);
                System.out.println("Convertibeln är hyrd" + days +"dagar");

            } else{
                System.out.println("Convertibeln är redan hyrd.");


            }
        }

        @Override
        public void lamnaTillbakaFordon(){
            if (arHyrd()){
                setArHyrd(false);
                System.out.println("Convertibeln har retunerats");

            } else {
                System.out.println("Convertibeln har inte retunerats");
            }
        }
        @Override
        public double kalkyleraHyrKostnad(){
            return getHyrPrisPerDag();
        }
        public void displayConvertibleDetails(){
            display();
            System.out.println("Atoumatiskt tak: " + (harAtoumatisktTak ? "Ja" : "Nej" ));
        }
    }
