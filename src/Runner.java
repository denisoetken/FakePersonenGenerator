import java.util.HashSet;

/**
 * Created by doetken on 14.09.2016.
 */
public class Runner {
    public static void main(String[] args) {
        int anzahl = 10;
        Person p = new Person();

        for (String h : p.anzahlSchleife(anzahl)) {
            System.out.println(h);
        }
    // todo DAtei schreiben
    }
}
