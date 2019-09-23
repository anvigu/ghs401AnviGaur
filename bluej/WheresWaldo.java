import javax.swing.JOptionPane;

public class WheresWaldo
{

    
    public static void main()
    {
        String schoolName = JOptionPane.showInputDialog("The name of your school is: ");
        String school = "granada";
        String mascot = "matadors";
        String schoolMascot = JOptionPane.showInputDialog("What is your mascot: ");
        if(schoolName.equals(school)){
            System.out.println("That's right! ");

            if(schoolMascot.equals(mascot)){
                String[] items = {"Jace", "Harry", "Waldo", null };
                for(int i=0; i<items.length;i++){

                    if(items[i]==(null)){
                        System.out.println("Spot " +  (i+1) + " is empty!");  
                    }
                    else if(items[i].equals("Waldo")){
                        System.out.println("We found him! Waldo is at spot " + (i+1));

                    }
                    else{
                        System.out.println("We did not find Waldo at spot " + (i+1) + " in this spot is " + items[i] + " keep looking");
                    }
                }
            }
            else{
                System.out.println("Sorry that is the wrong mascot"); 
            }
        }   
        else{
            System.out.println(" Sorry that is the wrong school"); 
        }
       String favMovieCharacter = JOptionPane.showInputDialog("What is your favorite movie character?: ");
       String myFavMovieCharacter = "Ironman";
       if(favMovieCharacter.equals(myFavMovieCharacter)){
           System.out.println("We have the same taste in movies!");
    }
    else{
        System.out.println("We don't have the same favorite character!");
    }
   
}
}
