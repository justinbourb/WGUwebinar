package animal;
import Animal.Animal;

public class Dog extends Animal{
    private String sound;
    
    
    public Dog(String breed, int lifespan, String behavior, double price){
        //super sets these attributes on the superclass
        super(breed, behavior, lifespan, price);
    }

    public Dog(){
        super();
        this.sound = null;
    }
    

    public String getSound() {
        return "Woof!";
    }
    public void setSound(String sound){
        this.sound = sound;   
    }
}
