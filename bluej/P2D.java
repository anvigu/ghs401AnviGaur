
public class P2D
{
    private String name;
    private int grade;
    public P2D(){
        this.name = null;
        this.grade = 0;
    }
    public P2D(String name, int grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName(){
        return this.name;

    }

    public int getGrade(){
        return this.grade;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
}
