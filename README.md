# Avancerad_JAVA24_Henrik_M-nsson_Uppgift1
# Fordonsuthyrningssystem

Detta projekt är en enkel Java-applikation för fordonsuthyrning. Det tillåter användare att visa tillgängliga fordon, hyra dem för ett antal dagar och returnera dem. Programmet stöder olika fordonstyper såsom bilar, SUV:ar, cabrioleter och lastbilar.

---

## **Funktioner**
- **Visa alla tillgängliga fordon**: Användare kan se detaljer om fordon som inte är hyrda.
- **Hyra fordon**: Användare kan hyra ett fordon genom att ange dess registreringsnummer och antal dagar.
- **Lämna tillbaka fordon**: Användare kan returnera ett hyrt fordon.
- **Beräkna total hyreskostnad**: Vid hyrestillfället visas den totala hyreskostnaden.

---

## **Krav**
- Java Development Kit (JDK) 8 eller senare.
- En utvecklingsmiljö som stöder Java, t.ex. IntelliJ IDEA, Eclipse eller en textredigerare som VS Code.

---

## **Installation**
1. Klona eller ladda ner detta repository.
2. Öppna projektet i din Java-utvecklingsmiljö.
3. Se till att alla Java-klasser finns i samma paket eller mapp.

---

## **Körning**
1. Kör **`Main`**-klassen som en Java-applikation.
2. Följ instruktionerna i terminalen för att navigera i menyn.

---

## **Struktur**
### **Klasser**
1. **Fordon** *(abstrakt klass)*  
   - Grunden för alla fordonstyper. Innehåller egenskaper som modell, registreringsnummer, hyrespris per dag och hyrstatus.
   
2. **Bil** *(ärver Fordon)*  
   - Representerar en bil med ytterligare egenskaper som antal säten och drivmedel.

3. **Convertible** *(ärver Fordon)*  
   - Representerar en cabriolet med en egenskap för automatiskt tak.

4. **SUV** *(ärver Fordon)*  
   - Representerar en SUV med fyrhjulsdrift och bagageutrymme.

5. **Truck** *(ärver Fordon)*  
   - Representerar en lastbil med fyrhjulsdrift och lastutrymme.

6. **Hyrning** *(interface)*  
   - Definierar kontraktet för alla hyrbara fordon.

7. **Main**  
   - Körbar klass som innehåller huvudmenyn och användarflödet.

---

## **Exempel**
### **Visa tillgängliga fordon**
