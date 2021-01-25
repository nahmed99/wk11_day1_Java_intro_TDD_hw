public class Printer {

    private int noOfSheets;
    private int tonerVolume;

    // constructor
    public Printer (int noOfSheets, int tonerVolume) {
        this.noOfSheets = noOfSheets;
        this.tonerVolume = tonerVolume;
    }

    // getters
    public int getNoOfSheets() {
        return noOfSheets;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    // setters
    public void setNoOfSheets(int newNoOfSheets) {
        noOfSheets = newNoOfSheets;
    }

    public void setTonerVolume(int newTonerVolume) {
        tonerVolume = newTonerVolume;
    }


    public boolean print(int noOfPages, int noOfCopies) {
        int pagesRequired = noOfPages * noOfCopies;
        boolean printed = false;

        if (pagesRequired <= getNoOfSheets()) {
            setNoOfSheets(getNoOfSheets() - pagesRequired);
            setTonerVolume(getTonerVolume() - pagesRequired);
            printed = true;
        }

        return printed;
    }

}
