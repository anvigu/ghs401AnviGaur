
public class panda
{
    // instance variables - replace the example below with your own
    private String country;
    private double weight;
    public panda()
    {
        // initialise instance variables
        this.country=null;
        this.weight=0;
    }
    //setter methods/mutate methods
    public panda(String country, double weight){
        this.country=country;
        this.weight=weight;
    }
   public void setWeight(double weight){
       this.weight=weight;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return this.country;
    }
    public double getWeight(){
        return this.weight;
    }
    public String toString(){
        return "Country: " + this.country+ "\nweight: " + this.weight;
    }
    
}
