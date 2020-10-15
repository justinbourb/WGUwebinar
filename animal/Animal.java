package animal;

public abstract class Animal {
    private String breed;
    private int lifespan;
    private String behavior;
    private Double price;
    private static String seller;

    public Animal(String breed, int lifespan, String behavior, double price){
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
    }

    public Animal(){
        this.breed = null;
        this.lifespan = 0;
        this.behavior = null;
        this.price = null;
    }

    //setters
    public void setBehavior(String behavior){
        this.behavior = behavior;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setLifespan(int lifespan){
        this.lifespan = lifespan;
    }
    public static void setSeller(String seller){
        this.seller = seller;   
    }
    
    //getters
    public String getBehavior(){
        return this.behavior;
    }
    public String getBreed(){
        return this.breed;
    }
    public int getLifespan(){
        return this.lifespan;
    }
    public Double getPrice(){
        return this.price;
    }
    public static String getSeller(){
        return this.seller;   
    }
}
