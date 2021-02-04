public class Address {
    
    private int streetNumber;
    private String street;
    private String suburb;
    private String state;
    private int postcode;

    public Address (int streetNumber, String street, String suburb, String state, int postcode) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.suburb =  suburb;
        this.state = state;
        this.postcode = postcode;
    }

    public String toString() {
        return (this.streetNumber + " " + this.street + "\n" + this.suburb + ", " + this.state + ", " + this.postcode);
    }

}
