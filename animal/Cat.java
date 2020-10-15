package animal;
import Animal.Animal;

public class Cat extends Animal{
    private String sound;
    
    
    public Cat (String breed, int lifespan, String behavior, double price){
        //calls the super class constructor
        super(breed, lifespan, behaviour, price);
    }

    public Cat(){
        //how to use blank constructors with super class constructor?
        //just write super()!
        super();
        this.sound = null;
    }
    

    public String getSound() {
        return "Meow!";
    }
    public void setSound(String sound){
        this.sound = sound;   
    }
}
