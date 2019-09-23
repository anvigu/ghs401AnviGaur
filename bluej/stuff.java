import javax.swing.JOptionPane;
public class stuff
{
    public static void main(){
        int IntsInArray = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want in your array? Pick a number between 10 and 20:"));

        while(IntsInArray < 10 || IntsInArray > 10000){

            IntsInArray =  Integer.parseInt(JOptionPane.showInputDialog("Sorry that is incorrect please pick a number between 10 and 20:"));

  
        }

        int[] myArray = new int[IntsInArray];
        int numInArray = 0;
        
        

        for(int i = 0; i < myArray.length;i++){
            numInArray = ((int)(Math.random()*(4)+ 21));
            myArray[i] = numInArray;
            
            
       
        }
        for(int i = 0; i < myArray.length; i++){
            
           System.out.print(myArray[i] + " "); 
            
        }
        int leastValue = myArray[0];
        int greatestValue = myArray[0];
        for(int i = 1; i< myArray.length; i++){
        
        if(leastValue > myArray[i]){
                leastValue = myArray[i];

            }
        if(greatestValue < myArray[i]){

                greatestValue = myArray[i];

            }
        }
        System.out.println("\nThe greatest value is " + greatestValue);
        System.out.println("The least value is " + leastValue);
    }

    
}