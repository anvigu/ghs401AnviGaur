

public class panda_driver
{
    public static void main(){
    panda p1 = new panda("China", 832.78);
    p1.setWeight(755.11);
    p1.setCountry("USA");
    System.out.println(p1);
    System.out.println(p1.getCountry());
    double currentWeight=p1.getWeight();
    currentWeight += 1000;
    p1.setWeight(currentWeight);
    System.out.println(p1.getWeight());
    //for array in driver program
    //dataType name = new DataType
    panda[] zoo = new panda[3];
    zoo[0]=new panda("USA", 311.2);
    zoo[1]=new panda("Canada", 422.2);
    
    for(int i=0; i< zoo.length; i++){
      System.out.println(zoo[i].getCountry());
      
    }
}
}
