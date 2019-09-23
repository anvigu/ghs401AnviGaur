import javax.swing.JOptionPane;

public class InputOutput
{
   public static void main(){
   String name = JOptionPane.showInputDialog("What is your name?");
   int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
   int a = 5;
     int b = 2;
     double c = a/(double)b;
     System.out.println(c);
   
   
    if(age >= 15){
        System.out.println("You can drive "  + name + "!");
        
    
    
    
    }  
    else{System.out.println("Ride your bike " + name + "!");
    } 
}
}
