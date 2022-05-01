
/*
 * Goldsmiths University of London
 * Author...: Carlos Manuel de Oliveira Alves
 * Student..: cdeol003
 * Created..: 01/05/2022
 */

/* declare class dwelling */
public class Dwelling {

    /* declare instances variables */
    private int number;
    private String street;
    private String town;
    private String country;

    /* declare the construction function for this class */
    public Dwelling(int number, String street, String town, String country) {
        this.number = number;
        this.street = street;
        this.town = town;
        this.country = country;
    }

    /* declare getters and setters */
    public int getNumber() {return number;}
    public void setNumber(int number) {this.number = number;}
    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}
    public String getTown() {return town;}
    public void setTown(String town) {this.town = town;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}

    
}
