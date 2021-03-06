public class Planets {
    protected String shape = "Round";

    public void rotates() {
        System.out.println("Orbits the sun");
    }
}
class Mercury extends Planets{
    private String size = "Smallest";
    private String colour = "Grey";
    public static void main(String args[]){
        Mercury obj = new Mercury();
        obj.rotates();
        System.out.println("Mercury is "+obj.shape+" and is the "+obj.size+" with colour "+obj.colour);
    }
}


