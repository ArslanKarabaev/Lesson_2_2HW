public class BMW extends Cars{
    private String owner;
    public BMW(int probeg, String name, String owner) {
        super(probeg, name);
        this.owner = owner;
    }


    @Override
    public void print() {
        System.out.println("Name: " + this.getName() + " probeg: " + this.getProbeg() + " Owner " + this.owner);
    }
}
