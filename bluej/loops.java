
public class loops
{
     public static void main(){
        String[] firstNames = {"may", "sage", "sunflower", "bob", "liza"};
        String[] lastNames = {"ross", "sardine", "anchovy", "buffy", "gaur"};
         
         
         System.out.println("First Name \t\tLast Name");
         
         int num1;
         int num2;
         for(int i = 0; i<10; i++){
             num1 = (int)(Math.random()*firstNames.length);
             num2 = (int)(Math.random()*lastNames.length);
             
             System.out.println(firstNames[num1] + "\t\t" + lastNames[num2]);
             
      
             
            }
         int a=93;
         
         while (a>80){
            System.out.println(a);
            a--;
             
         
        }
        int b = firstNames.length-1;
        
         while (b>0){
             System.out.println(firstNames[b]);
             b--;
            }
         
    }
}
