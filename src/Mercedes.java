public class Mercedes extends Cars{
    String color;
    public Mercedes(int probeg, String name, String color) {
        super(probeg, name);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + " probeg: " + this.getProbeg() + " Color: " + color);
    }

}
