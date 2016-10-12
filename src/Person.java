import java.util.HashSet;

/**
 * Created by Denis on 03.10.2016.
 */
public class Person {
    private HashSet<String> stringSet = new HashSet<String>();
    private Names nm = new Names();
    private String vorName;
    private String nachName;
    private String strasse;
    private String hausNummer;
    private String wohnOrt;
    private String eMail;

    public Person() {
    }

    public HashSet<String> anzahlSchleife(int anzahl) {
        anzahl = anzahl;
        for (int i = 0; i < anzahl; i++) {
            this.stringSet.add(this.personErzeugen());
        }
        return this.stringSet;
    }

    private String personErzeugen() {
        this.vorName = this.nm.vornamenErzeugen();
        this.nachName = this.nm.nachNamenErzeugen();
        this.strasse = this.nm.strasseErzeugen();
        this.hausNummer = this.nm.hausNummerErzeugen();
        this.wohnOrt = this.nm.wohnOrtErzeugen();
        this.eMail = nm.eMailErzeugen(this.vorName, this.nachName);

        String gesamtPerson = this.vorName + "|" + this.nachName + "|" + this.strasse + "|" + this.hausNummer + "|" + this.wohnOrt + "|" + this.eMail;

        return gesamtPerson;
    }

    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public String getStrasse() {
        return strasse + " " + hausNummer;
    }

    public String getWohnOrt() {
        return wohnOrt;
    }

    public String geteMail() {
        return eMail;
    }
}
