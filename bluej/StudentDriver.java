
public class StudentDriver
{

    public static void main(){
        P2D[] maleStudents = new P2D[7];
        P2D[] femaleStudents = new P2D[7];
        String[] olderNames = new String[7];

        int femaleGrade;
        int maleGrade;
        int random;
        femaleStudents[0] = new P2D("Carol", 10);
        femaleStudents[1] = new P2D("Karen", 12);
        femaleStudents[2] = new P2D("Emma", 9);
        femaleStudents[3] = new P2D("Jane",9);
        femaleStudents[4] = new P2D("Katie", 11);
        femaleStudents[5] = null;
        femaleStudents[6] = null;

        maleStudents[0] = new P2D("Henry", 11);
        maleStudents[1] = new P2D("George", 12);
        maleStudents[2] = new P2D("Edmond", 10);
        maleStudents[3] = new P2D("James", 12);
        maleStudents[4] = null;
        maleStudents[5] = new P2D("Charles", 9);
        maleStudents[6] = null;
        for(int i = 0; i < maleStudents.length; i++){
            
            if(femaleStudents[i] == null || maleStudents[i]==null){
                if(femaleStudents[i] == null && maleStudents[i] == null){
                    olderNames[i]= "Space for Rent!";
                }
                else if(femaleStudents[i]==null){
                    olderNames[i] = maleStudents[i].getName();
                }
                else if(maleStudents[i]==null){
                    olderNames[i] = femaleStudents[i].getName();
                }               
                
            }
            else{
                femaleGrade = femaleStudents[i].getGrade();
                maleGrade = maleStudents[i].getGrade();
                if(femaleGrade > maleGrade){
                    olderNames[i] = femaleStudents[i].getName();
                }
                else if(femaleGrade < maleGrade){
                    olderNames[i] = maleStudents[i].getName();
                }
                else if(femaleGrade == maleGrade){
                    random = (int)(2 * Math.random());
                    if(random == 0){
                        olderNames[i] = femaleStudents[i].getName();
                    }
                    if(random == 1){
                        olderNames[i] = maleStudents[i].getName();
                    }
                }

                
            }
        }
            System.out.println("Female Name " + "\tGrade " + "\tMale name " + "\tGrade " + "Older Student ");
            for(int i=0;i<femaleStudents.length; i++){
               if(femaleStudents[i]== null){
                   System.out.print(null + "\t\t");
                   System.out.print(null + "\t");
                }
                else{
                    System.out.print(femaleStudents[i].getName() + "\t\t");
                    System.out.print(femaleStudents[i].getGrade() + "\t");
                }               
               if(maleStudents[i] == null){
                   System.out.print(null + "\t\t");
                   System.out.print(null + "\t");
                }
               else{
                    System.out.print(maleStudents[i].getName() + "\t\t");
                    System.out.print(maleStudents[i].getGrade() + "\t");
                }              
               
                System.out.println(olderNames[i]);
            }
        
    }
}