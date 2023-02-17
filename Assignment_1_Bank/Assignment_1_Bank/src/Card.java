import java.util.Scanner;

public class Card {
    private int cardNumber;
    private Double balance;
    private int pin;
    private boolean status;

    public Card(int cardnum, Double bal, int p, boolean stat) {
        this.cardNumber = cardnum;
        this.balance = bal;
        this.pin = p;
        this.status = stat;
    }

    public void setCardNumber(int cardnum) {
        this.cardNumber = cardnum;

    }

    public int getCardNumber() {
        return cardNumber;
    }
}

  /*  public void setfirstname(String fname){
        Scanner fn = new Scanner(System.in);
        System.out.println("Enter first name: ");
        fname = fn.nextInt();
        firstName = fname;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setlastname(String lname){
        Scanner ln = new Scanner(System.in);
        System.out.println("Enter last name: ");
        lname = ln.nextInt();
        lastName = lname;
    }

    public String getlastName(){
        return lastName;
    }

    public void setage(String age){
        Scanner ag = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = ag.nextInt();
        lastName = age;
    }

    public int getAge(){
        return age;
    }

    void caerd(){
        System.out.println(cardNumber);
    }
}*/
