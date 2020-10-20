package model;

public class Cat extends Animal{
    private String sound;
    
    
    public Cat (int id, String breed, int lifespan, String behavior, double price, boolean vaccinated, String sound){
        //calls the super class constructor
        super(id, breed, lifespan, behavior, price, vaccinated);
        this.sound = sound;
    }

    public Cat(){
        //how to use blank constructors with super class constructor?
        //just write super()!
        super();
        this.sound = null;
    }
    

    public String getSound() { return this.sound; }
    public void setSound(String sound){ this.sound = sound; }
}
