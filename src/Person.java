/**
 * Created by doetken on 14.09.2016.
 */
public class Person {
    public Person(Generator vorname) {
        this.vorname = vorname;
    }

    Generator vorname = new Generator();
        System.out.println(vorname.vornamenErzeugen());
}
