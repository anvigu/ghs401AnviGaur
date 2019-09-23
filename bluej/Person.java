import javax.swing.JOptionPane;
public class Person
{
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(){
        this.age = 0;
        this.firstName= "jeff";
        this.middleName = "jeff";
        this.lastName = "jeff";
    }

    public Person(int age, String firstName, String middleName, String lastName){
        this.age = age;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String toString(){
        return "First Name: " + this.firstName + " Middle Name: " + this.middleName + " Last Name: " + this.lastName + " Age: "+this.age;
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

        Person p1 = new Person(firstAge, firstPersonsName[0], firstPersonsName[1], firstPersonsName[2]);
        Person p2 = new Person(secondAge, secondPersonsName[0], secondPersonsName[1], secondPersonsName[2]);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}