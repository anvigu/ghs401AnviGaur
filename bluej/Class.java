
import javax.swing.JOptionPane;
public class Class
{
    public static void main(){
      double numHoursOfSleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours of sleep did you get last night?"));
     
      
      while(numHoursOfSleep<0){
          
          numHoursOfSleep = Double.parseDouble(JOptionPane.showInputDialog("That is incorrect, please specify again:"));
          
        }
        
         System.out.println("You said " + numHoursOfSleep +  " hours of sleep!");
        
    }
}
