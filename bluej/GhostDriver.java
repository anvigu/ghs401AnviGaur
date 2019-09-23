
public class GhostDriver
{
    public static void main(){
        int num = 7;
        Ghost g1 = new Ghost();
        Ghost g2 = new Ghost();
        Ghost g3 = new Ghost();
        
        System.out.println(g1.toString());
        Ghost g4 = new Ghost("chartruse", 99, 20);
        
        System.out.println(g4.toString());
        g4.bumpSpeed(17);
       
        
        System.out.println(g4.toString());
        g4.bumpSpeed(); //increase speed of Ghost4 by 1
        System.out.println(g4.toString());
        g4.doubleColor();
        System.out.println(g4.toString());
        
        

public class StudentDriver
{
    Student[] maleStudents = new Student[7]
    Student[] femaleStudents = new Student[7];

    Student[] maleStudents = new Student[7];
    String[] olderNames = new String[7];
    
    int femaleGrade;
    int maleGrade;
    int random;
    public static void main(){
        femaleStudents[0] = new Student("Carol", 10);
        femaleStudents[1] = new Student("Karen", 12);
        femaleStudents[2] = new Student("Caroline", 9);
        femaleStudents[3] = new Student();
        femaleStudents[4] = new Student("Katie", 11);
        femaleStudents[5] = new Student("Katherine", 10);
        femaleStudents[6] = new Student("Palak", 10);
        
        maleStudents[0] = new Student("Henry", 11);
        maleStudents[1] = new Student("George", 9);
        maleStudents[2] = new Student("Edmond", 10);
        maleStudents[3] = new Student("James", 12);
        maleStudents[4] = new Student();
        maleStudents[5] = new Student("Charles", 9);
        maleStudents[6] = new Student("Sam", 11);
        for(int i = 0; i < maleStudents.length; i++){
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
            else if((femaleStudents[i] && maleStudents[i]) = null){

        }
    }
    
}
        
        
    }
    
}
