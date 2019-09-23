

public class P2E
{
    private int speed;
    private int batteryLife;
    private String color;
    public P2E(int speed, int batteryLife, String color){
        this.speed=speed;
        this.batteryLife=batteryLife;
        this.color=color;
        
    }
    public String toString(){
       return "Speed: " + this.speed + "\t\tBattery Life: " + this.batteryLife + "\t\tColor: " + this.color;
        
    }
    public void act(){
        
        
    }
}
