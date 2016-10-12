import java.io.BufferedReader;
import java.io.FileReader;
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
    private String gesamtPerson;
    private int anzahl = 0;
    private int zeile = 0;
    private String dateiname;

    public Person(String dateiname) {
        this.dateiname = dateiname;
    }

    public HashSet<String> anzahlSchleife(int anzahl) {
        this.anzahl = anzahl;
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
        this.eMail = this.nm.eMailErzeugen(this.vorName, this.nachName);

        this.gesamtPerson = this.vorName + "|" + this.nachName + "|" + this.strasse + "|" + this.hausNummer + "|" + this.wohnOrt + "|" + this.eMail;
        return this.gesamtPerson;
    }

    public String getVorName(int zeile) {
        String ergebnis = "leer";
        try {
            BufferedReader br = new BufferedReader(new FileReader(dateiname));
            int i = 1;
            StringBuilder sb = new StringBuilder();
            while (i < zeile) {
                while (br.read() != '|') {
                    sb.append(br.read());
                }
                ergebnis = sb.toString();
                br.readLine();
                i++;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return ergebnis;
    }

    public String getNachName(int zeile) {
        return this.nm.nachNamenErzeugen();
    }

    public String getStrasse(int zeile) {
        return this.nm.strasseErzeugen() + " " + this.nm.hausNummerErzeugen();
    }

    public String getWohnOrt(int zeile) {
        return this.nm.wohnOrtErzeugen();
    }

    public String geteMail(int zeile) {
        return this.nm.eMailErzeugen(this.nm.vornamenErzeugen(), this.nm.nachNamenErzeugen());
    }
}
