package model;

public class Dog extends Animal{
    private String special;
    
    
    public Dog(int id, String breed, int lifespan, String behavior, double price, boolean vaccinated, String special){
        //super sets these attributes on the superclass
        //it has to be the first statement
        super(id, breed, lifespan, behavior, price, vaccinated);
        this.special = special;
    }

    public Dog(){
        super();
        this.special = null;
    }

    public String getSpecial() { return this.special; }
    public void setSpecial(String special){ this.special = special; }
}
