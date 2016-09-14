/**
 * Created by doetken on 14.09.2016.
 */
public class Generator {
    //    Vorname
   private Names Ergebnis = new Names();
    private String vorName;



    public String vornamenErzeugen() {
        String vornamenString;

        boolean jaNein = Ergebnis.zweiterVorname();

        System.out.println(jaNein);

        if (jaNein)

        {
            vornamenString=Ergebnis.Zufall(Ergebnis.maennlNamen) + ' ' + Ergebnis.Zufall(Ergebnis.maennlNamen);
        } else

        {
           vornamenString=Ergebnis.Zufall(Ergebnis.maennlNamen);
        }

        return vornamenString;
    }
}
