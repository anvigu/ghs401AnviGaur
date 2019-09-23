import javax.swing.JOptionPane;
public class Person2
{
    private String[] names = new String[3];
    private int age;

    public Person2(){
        this.age = 0;
        String[] names = {"bpb","e","d"};
    }

    public Person2(int age, String names[]){
        this.age = age;
        this.names = this.names;
    }

    public String toString(){
        return "First Name: " + this.names[0] + " Middle Name: " + this.names[1] + " Last Name: " + this.names[2] + " Age: "+this.age;
    }

    public static void main(){
        String[]  firstPersonsName = new String[3];
        String[] secondPersonsName = new String[3];

        int firstLength=0;
        int secondLength=0;
        int firstAge = 0;
        int secondAge = 0;

        firstPersonsName[0] = JOptionPane.showInputDialog("What is your first name?");
        firstPersonsName[1] = JOptionPane.showInputDialog("What is your middle name?");
        firstPersonsName[2] = JOptionPane.showInputDialog("What is your last name?");

        secondPersonsName[0] = JOptionPane.showInputDialog("What is your first name?");
        secondPersonsName[1] = JOptionPane.showInputDialog("What is your middle name?");
        secondPersonsName[2] = JOptionPane.showInputDialog("What is your last name?");

        firstAge= Integer.parseInt(JOptionPane.showInputDialog("P1- What is your age"));
        secondAge= Integer.parseInt(JOptionPane.showInputDialog("P2- What is your age"));

        for(int i=0; i<3; i++){
            firstLength+=firstPersonsName[i].length();
        }
        for(int i=0; i<3; i++){
            secondLength+=secondPersonsName[i].length();
        }
        if(firstLength>secondLength){
            System.out.println("P1 has a longer name");
        }
        else if(secondLength>firstLength){
            System.out.println("P2 has a longer name");
        }
        else{
            System.out.println("Your names are the same length");
        }

        Person2 p1 = new Person2(firstAge, firstPersonsName);
        Person2 p2 = new Person2(secondAge, secondPersonsName);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}