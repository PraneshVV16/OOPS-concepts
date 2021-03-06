//Abstraction through Abstract class

abstract class AquaticAnimals {
    abstract void swim();
    public void sleep(){
        System.out.println("Aquatic animals sleep in water");
    }
}
class Fish extends AquaticAnimals{
    public void swim(){
        System.out.println("Fish is a aquatic animal that swims in water");
    }
}
public class Main{
    public static void main(String[] args){
        Fish f = new Fish();
        f.swim();
        f.sleep();
    }
}

