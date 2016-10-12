import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by doetken on 12.10.2016.
 */
public class Exporter {
    int anzahl;

    public Exporter(int anzahl, String dateiName) throws IOException {
        this.anzahl = anzahl;
        Person p = new Person();
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(dateiName))) {
            for (String s : p.anzahlSchleife(anzahl)) {
                wr.append(s);
                wr.newLine();
            }
        }
    }
}
