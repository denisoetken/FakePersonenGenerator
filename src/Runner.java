import org.omg.CORBA.SystemException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created by doetken on 14.09.2016.
 */
public class Runner {
    public static void main(String[] args) {
        int anzahl = 10;
        Person p = new Person();
        //     StringBuilder sb = new StringBuilder();
        //       BufferedWriter wr = null;


        //   for (String h : p.anzahlSchleife(anzahl)) {
        //     sb.append(h);
        //   sb.append("\n");
        //}
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("test.txt"))) {
            for (String s : p.anzahlSchleife(anzahl)) {
                wr.append(s);
                wr.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}

