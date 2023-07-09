public class Porsche extends Cars{
    int series;
    public Porsche(int probeg, String name, int series) {
        super(probeg, name);
        this.series = series;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + " probeg: " + this.getProbeg() + " Series: " + series);
    }
}
