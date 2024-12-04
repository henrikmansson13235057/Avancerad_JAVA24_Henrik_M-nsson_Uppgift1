import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fordon> fordonsLista = new ArrayList<>();

        fordonsLista.add(new Bil("Porsche", "DCS143", 1000, 2, "E98"));
        fordonsLista.add(new SUV("BMW X5", "FPD124", 2900, true, 50.0));
        fordonsLista.add(new Convertible("Bentley Continental GT", "FTP322", 6000, true));
        fordonsLista.add(new Truck("FORD F150", "HBF456", 500, true, 100.0));

        Scanner sc = new Scanner(System.in);

        boolean ON = true;

        while (ON) {
            System.out.println("\nVälj ett alternativ:");
            System.out.println("1. Visa alla tillgängliga fordon.");
            System.out.println("2. Hyr ett fordon.");
            System.out.println("3. Lämna tillbaka ett fordon.");
            System.out.println("4. Avsluta.");
            System.out.print("Ditt val: ");
            int val = sc.nextInt();
            sc.nextLine();

            switch (val) {
                case 1:
                    System.out.println("\nTillgängliga fordon:");
                    for (Fordon fordon : fordonsLista) {
                        if (!fordon.arHyrd()) {
                            visaDetaljer(fordon);
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 2:
                    System.out.print("\nAnge registreringsnummer för fordonet du vill hyra: ");
                    String regNummer = sc.nextLine();
                    boolean hittad = false;

                    for (Fordon fordon : fordonsLista) {
                        if (fordon.getRegistreringsNummer().equalsIgnoreCase(regNummer)) {
                            hittad = true;
                            if (!fordon.arHyrd()) {
                                System.out.print("Hur många dagar vill du hyra fordonet?: ");
                                int dagar = sc.nextInt();
                                sc.nextLine();
                                fordon.hyrFordon(dagar);
                                System.out.println("Total hyreskostnad: " + fordon.kalkyleraHyrKostnad() * dagar + " SEK");
                            } else {
                                System.out.println("Fordonet är redan hyrt!");
                            }
                            break;
                        }
                    }
                    if (!hittad) {
                        System.out.println("Fordon med registreringsnummer " + regNummer + " hittades inte.");
                    }
                    break;

                case 3:
                    System.out.print("\nAnge registreringsnummer för fordonet du vill lämna tillbaka: ");
                    String returnNummer = sc.nextLine();
                    boolean returnHittad = false;

                    for (Fordon fordon : fordonsLista) {
                        if (fordon.getRegistreringsNummer().equalsIgnoreCase(returnNummer)) {
                            returnHittad = true;
                            if (fordon.arHyrd()) {
                                fordon.lamnaTillbakaFordon();
                            } else {
                                System.out.println("Fordonet är inte hyrt.");
                            }
                            break;
                        }
                    }
                    if (!returnHittad) {
                        System.out.println("Fordon med registreringsnummer " + returnNummer + " hittades inte.");
                    }
                    break;

                case 4:
                    System.out.println("Avslutar systemet. Tack för att du hyrde hos oss!");
                    ON = false;
                    break;

                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
        sc.close();
    }

    // Metod för att visa detaljer för varje fordonstyp
    private static void visaDetaljer(Fordon fordon) {
        if (fordon instanceof Convertible) {
            ((Convertible) fordon).displayConvertibleDetails();
        } else if (fordon instanceof SUV) {
            ((SUV) fordon).displaySUVDetails();
        } else if (fordon instanceof Truck) {
            ((Truck) fordon).displayTruckDetails();
        } else if (fordon instanceof Bil) {
            fordon.display();
        }
    }
}
