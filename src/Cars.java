public abstract class Cars implements Printable {
    int probeg;
    String name;

    public Cars(int probeg, String name) {
        this.probeg = probeg;
        this.name = name;
    }

    public int getProbeg() {
        return probeg;
    }

    public String getName() {
        return name;
    }
}
