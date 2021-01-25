public class WaterBottle {

    // Instance variable(s)
    private int volume;

    // Constructor
    public WaterBottle() {
        // setVolume(100);
        fill(); // This will fill the bottle to 100.
    }

    // Getter
    public int getVolume() {
        return volume;
    }

    // Setter
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink() {
        setVolume(getVolume() - 10); // take 10 from volume
    }

    public void empty() {
        setVolume(0);
    }

    public void fill() {
        setVolume(100);
    }

}
