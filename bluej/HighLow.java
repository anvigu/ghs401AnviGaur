import javax.swing.JOptionPane;

public class HighLow
{
    public static void main(){
        int l = Integer.parseInt(JOptionPane.showInputDialog("Enter a low value "));
        int h = Integer.parseInt(JOptionPane.showInputDialog("Enter a high value"));
        int len = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of numbers"));
        int num;
        int even = 0;
        
        
        
        if(l>=h){
            System.out.println("Sorry your values are incorrect");

        }
        else {
            int[] array = new int[len];
            int r = (h - l)+1;
            
            for(int i=0;i<len;i++){

                num = (int)(Math.random()*r + l);
                array[i] = num;
                

            }
            for(int i=0; i<array.length;i++){
                
                
                if(array[i]%2 == 1){
                  System.out.println("Element #" + (i+1) + " in the array is " + array[i] + " which is odd");
                  
                }
                else {
                     System.out.println("Element #" + (i+1) + " in the array is " + array[i] + " which is even");
                     even++;
                    
                }

            }
            System.out.println("The array has " + even + " even numbers and " + (array.length - even)  + " odd numbers");
        }
        
    }
}
