package animal;
import Animal.Animal;

public class Dog extends Animal{
    private String sound;
    
    /* comment out for now
    public Dog(String breed, int lifespan, String behavior, double price){
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
    }

    public Dog(){
        this.breed = null;
        this.lifespan = 0;
        this.behavior = null;
        this.price = null;
    }
    */

    public String getSound() {
        return "Woof!";
    }
    public void setSound(String sound){
        this.sound = sound;   
    }
}
