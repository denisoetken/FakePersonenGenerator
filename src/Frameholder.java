import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//      GUI-Versuch
/**
 * Created by Denis on 03.10.2016.
 */
public class Frameholder {
    public Frameholder() {

        //todo Borderlayout?

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Person p = new Person();
        int anzahl = 0;

        JFileChooser fc = new JFileChooser();
        panel.add(fc);

        JLabel zahl = new JLabel("Wieviele Personen sollen erzeugt werden?");
        JTextField anzahlwaehler = new JTextField(10);
        panel.add(zahl);
        panel.add(anzahlwaehler);

        JButton ausfuehrer = new JButton();
        ausfuehrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String anzahlWort = anzahlwaehler.getText().toString();

                try (Integer anzahl = Integer.getInteger(anzahlWort)) {

            }
                                try(
            BufferedWriter wr = new BufferedWriter(new FileWriter(fc.getSelectedFile())))

            {
                for (String s : p.anzahlSchleife(anzahl)) {
                    wr.append(s);
                    wr.newLine();
                }

            } catch(IOException e3) {
                System.out.println(e3.toString());

            }

             catch (NumberFormatException e1) {
                System.out.println("Falscheingabe");
            }
        }});

        panel.add(ausfuehrer);

        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}