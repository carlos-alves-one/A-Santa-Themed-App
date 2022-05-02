
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 02/05/2022
 */

/* declare all libraries to be used with this class */
import java.util.ArrayList;

/* declare class child */
public class Delivery {

    /* ??? */
    Child child;
    ArrayList<Toy> toys;

    /* nice children ??? */
    Delivery(Child child, ArrayList<Toy> toys) {
        this.child = child;
        this.toys = toys;
    }

    /* naughty children ??? */
    Delivery(Child child) {
        this.child = child;
        this.toys = new ArrayList<Toy>();
        this.toys.add(new Toy("lump of coal", 0,05, 30));
    }

}
