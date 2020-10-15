package animal;

public class Dog {
    private String breed;
    private int lifespan;
    private String behavior;
    private Double price;

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

    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setLifespan(int lifespan){
        this.lifespan = lifespan;
    }
    public void setBehavior(String behavior){
        this.behavior = behavior;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getBreed(){
        return this.breed;
    }
    public int getLifespan(){
        return this.lifespan;
    }
    public String getBehavior(){
        return this.behavior;
    }
    public Double getPrice(){
        return this.price;
    }
}
