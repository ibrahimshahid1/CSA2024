
/**
 ** Ibrahim Shahid
 * Date: 12/23/2024
 * North Carolina Virtual Public Schools
 * Description: Address Formatting algo
 * Difficulties:  I had some struggles doing object oriented programming and stuff so i uesd the ThinkJava2e textbook to help me
 * 
 */
public class address {
    private String street; // access modfiers ensure that these variables can only be accesed through emthods within the class (encapsulation)
    private String city;
    private String state;
    private String zip;

    // Constructor
    public address(String street, String city, String state, String zip) {// intializes the oaddress object when created, calls the setter method to assing values to the instance variables and applies eror checking
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    // getters
    public String getStreet() { // methods retunr the values fo the rpiovate instance vars, allows controlled access to the private vars mentioned earlier
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    // setters with error checking
    public void setStreet(String street) { // assignss value to street after making sure it isnt empty, and thoerows an exception if given an illegal input, setCity ensures city is not empty, and so do setState and setZip
        if (street.isEmpty()) {
            throw new IllegalArgumentException("Street cannot be empty.");
        }
        this.street = street;
    }

    public void setCity(String city) {
        if (city.isEmpty()) {
            throw new IllegalArgumentException("City cannot be empty.");
        }
        this.city = city;
    }

    public void setState(String state) {
        if (state.length() != 2 || !state.matches("[A-Za-z]{2}")) {
            throw new IllegalArgumentException("State must be a 2-letter abbreviation.");
        }
        this.state = state.toUpperCase();
    }

    public void setZip(String zip) {
        if (zip.length() != 5 || !zip.matches("\\d{5}")) {
            throw new IllegalArgumentException("ZIP code must be 5 digits.");
        }
        this.zip = zip;
    }

    // ethod to print the address
    public void printFullAddress() {
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zip);
    }

    public void printAddressDetails() {
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip);
    }
}
/*
 * expected output

Address Details:
************
************
**
*****
 */
