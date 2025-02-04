public class coin {
    // Private instance variable to store coin side
    // We can store it as a String for simplicity: "heads" or "tails".
    private String side;

    // Constructor
    public coin() {
        // When a new Coin object is created, let's flip it immediately 
        // to decide its initial side randomly.
        flip();
    }

    // Getter for side
    public String getSide() {
        return side;
    }

    // Setter for side
    public void setSide(String side) {
        this.side = side;
    }

    // flip() method: randomly sets the coin to heads or tails
    public void flip() {
        if (Math.random() < 0.5) {
            side = "heads";
        } else {
            side = "tails";
        }
    }
}
