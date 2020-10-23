package model;

public abstract class Animal {
    private int id;
    private String breed;
    private int lifespan;
    private String behavior;
    private Double price;
    private static String seller;
    private boolean vaccinated;

    public Animal(int id, String breed, int lifespan, String behavior, double price, boolean vaccinated){
        this.id = id;
        this.breed = breed;
        this.lifespan = lifespan;
        this.behavior = behavior;
        this.price = price;
        this.vaccinated = vaccinated;
    }

    public Animal(){
        this.breed = null;
        this.lifespan = 0;
        this.behavior = null;
        this.price = null;
    }

    //setters
    public void setId(int id){ this.id = id; }
    public void setBehavior(String behavior){ this.behavior = behavior; }
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
        Animal.seller = seller;
    }
    public void setVaccinated(boolean vaccinated){ this.vaccinated = vaccinated;}
    
    //getters
    public int getId() { return id; }
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
        return seller;
    }
    public boolean getVaccinated() { return this.vaccinated;}
}
