package animal;
import Animal.Animal;

public class Cat extends Animal{
    private String sound;
    
    /* comment out for now
    public Cat (String breed, int lifespan, String behavior, double price){
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
    }

    public Cat(){
        this.breed = null;
        this.lifespan = 0;
        this.behavior = null;
        this.price = null;
    }
    */

    public String getSound() {
        return "Meow!";
    }
    public void setSound(String sound){
        this.sound = sound;   
    }
}
