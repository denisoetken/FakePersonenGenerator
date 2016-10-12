import java.io.IOException;

/**
 * Created by doetken on 14.09.2016.
 */
//Standard-Branch, ohne GUI und Sortierung

public class Runner {
    public static void main(String[] args) {
        String dateiName = "Datenquelle.txt";
        try {
            Exporter ex = new Exporter(10, dateiName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private static class Test {
//        public Test() {
//            testGetter();
//        }
//
//        public void testGetter() {
////            String dateiName = "Datenquelle.txt";
////            int anzahl = 23;
////            Person p = new Person(dateiName);
////            System.out.println("Vorname: " + p.getVorName(3));
////            System.out.println("Nachname: " + p.getNachName());
////            System.out.println("Strasse Nr.: " + p.getStrasse());
////            System.out.println("Wohnort: " + p.getWohnOrt());
////            System.out.println("E-Mail: " + p.geteMail());
//        }
//    }
}

