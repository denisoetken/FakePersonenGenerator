import java.io.IOException;

/**
 * Created by doetken on 14.09.2016.
 */
//Standard-Branch, ohne GUI und Sortierung

public class Runner {
    public static void main(String[] args) {
        try {
            Exporter ex = new Exporter(10, "Datenquelle.csv");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

