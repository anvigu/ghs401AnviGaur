

public class Ghost
{
    //instance variables for the class Ghost
    private String color;
    private int speed;
    private int level;
    
    //zero-argument constructor, basically makes a default ghost
    public Ghost(){
     this.color = null;
     this.speed = 0; 
     this.level = 0;
     //System.out.println("A default ghost was created");
    }
    //two argrument instructor, can set the instance variables to anything desired
    public Ghost(String color, int speed, int level){
       this.color = color;
       this.speed = speed;
       this.level = level;
        System.out.println("A unique ghost was constructed" );
    }
    //public means other classes have access to this method
    //String is the return type of this method, it gives back a String
    //toString is the name of this method
    public String toString(){
        return "Color: " + this.color + " Speed: " + this.speed + "Level: " + this.level;
    }
    public void bumpSpeed(){
       this.speed++; 
    }
    public void bumpSpeed(int bump){
        this.speed+= speed + bump;
    }
    public void doubleColor(){
        this.color = this.color + this.color;
    }
    
}
