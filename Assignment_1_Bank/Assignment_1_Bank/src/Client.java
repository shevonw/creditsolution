import java.util.Scanner;
public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    public Client(){
        idNumber = 0;
        age = 0;
    }
    public Client(int id, String fname, String lname){
        this.idNumber = id;
        this.firstName = fname;
        this.lastName = lname;
    }



    public void setIdNumber(int id){
        this.idNumber = id;

    }

    public int getIdNumber(){
        return idNumber;
    }

    public void setfirstname(String fname){
        this.firstName = fname;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setlastname(String lname){
        this.lastName = lname;
    }

    public String getlastName(){
        return lastName;
    }

    public void setage(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCard(Card card){
        this.card = card;
    }


    void client(){
        //System.out.println(firstName + "lastName");
    }
}
