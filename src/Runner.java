/**
 * Created by doetken on 14.09.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Names testPerson = new Names();
        System.out.println("Vornamen: ");
        System.out.println(testPerson.vornamenErzeugen());
        System.out.println(testPerson.vornamenErzeugen());
        System.out.println(testPerson.vornamenErzeugen());
        System.out.println("Nachname: ");
        System.out.println(testPerson.nachNamenErzeugen());
        System.out.println(testPerson.nachNamenErzeugen());
        System.out.println(testPerson.nachNamenErzeugen());
        System.out.println("Wohnorte: ");
        System.out.println(testPerson.wohnOrtErzeugen());
        System.out.println(testPerson.wohnOrtErzeugen());
        System.out.println("Strasse: ");
        System.out.println(testPerson.strasseErzeugen());
        System.out.println(testPerson.strasseErzeugen());
        System.out.println("Hausnummer: ");
        System.out.println(testPerson.hausNummerErzeugen());
        System.out.println(testPerson.hausNummerErzeugen());
    }
}
