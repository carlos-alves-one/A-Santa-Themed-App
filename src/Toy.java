
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 30/04/2022
 */

/* declare class toy */
public class Toy {

    /* declare instances variables */
    private String name;
    private double price;
    private double weight;

    /* declare the construction function for this class */
    public Toy(String name, double price, double weight, int i) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    /* declare getters and setters */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
}
