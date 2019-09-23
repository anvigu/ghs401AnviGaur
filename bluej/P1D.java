
public class P1D
{
   public static void main(){
       for(int i=1;i<=10;i++){
           int x = i*i;
           int y = ((int)(Math.random()*(x-i+1)+i));  
           if(y==x){
               System.out.print(i + " \t " + x + " \t\t " + y);
               System.out.println("\tThe random value is equal to the square of the index.");
            }
           else if(y==i){
               System.out.print(i + " \t " + x + " \t\t " + y);
               System.out.println("\tThe random value is equal to the index.");
            }
           else{
               System.out.println(i + " \t " + x + " \t\t " + y);
            }
           
           
            }
       String[] movies = {"Deadpool","Clueless","Mean Girls"};
       String[] songs = {"Killer Queen","Apples","Sweet Caroline"};
       for(int a = 0; a<movies.length; a++){
               System.out.println(movies[a]);
            }
       int b = 0;
       while(b<songs.length){
            if(b==(songs.length-1)){
                   System.out.print(songs[b]);
                }
            else{
                   System.out.print(songs[b]+", ");
                }
            b++;
        }
    }
}
