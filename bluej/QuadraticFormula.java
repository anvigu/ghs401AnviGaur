import javax.swing.JOptionPane;

public class QuadraticFormula
{
   public static void main (){ 
       int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired value for a "));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired value for b"));
       int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired value for c"));
       if (4*a*c > b*b){
           System.out.println("“Sorry, your discriminant is negative. We cannot process imaginary roots right now…”");
          }
       else{
       
       System.out.println("The value of b squared is " + b*b);
       System.out.println("The value of 4*a*c squared is " + 4*a*c);
       System.out.println("The value of square root of b squared minus 4 times a times c is " + Math.sqrt(b*b - 4*a*c));
       System.out.println("The value the first root is " + (b*-1 + Math.sqrt(b*b - 4*a*c)) / (2*a));
       System.out.println("The value the second root is " + (((b*-1) - (Math.sqrt((b*b) - (4*a*c)))) / (2*a)));
       
    }
}
}
