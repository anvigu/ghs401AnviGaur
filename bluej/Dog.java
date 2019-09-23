
public class Dog
{
    private String name;
    private String breed;
    private int weight;
    
    public Dog(){
        this.name = null;
        this.breed = null;
        this.weight = 0;
    }
    public Dog(String name, String breed, int weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
    }
    //return type is double
    public int getWeight(){
        return this.getWeight;
    }
    
    
    public String toString(){
        return "Name: " + this.name + "\tBreed: " + this.breed + "\tWeight: " + this.weight;
    }
    
}
