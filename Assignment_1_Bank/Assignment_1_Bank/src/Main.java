import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String fname;
        String lname;
        int cardnum;
        int age;
        Scanner obj = new Scanner(System.in);

        Client clnt1;
        clnt1 = new Client();

        System.out.println("Enter first name: ");
        fname = obj.next();
        clnt1.setfirstname(fname);


        System.out.println("Enter last name: ");
        lname = obj.next();
        clnt1.setlastname(lname);


        System.out.println("Enter age: ");
        age = obj.nextInt();
        clnt1.setlastname(age);

        System.out.println("Enter your card number: ");
        cardnum = obj.nextInt();
        clnt1.setCard(cardnum);

        System.out.println(clnt1.getFirstName());
        System.out.println(clnt1.getlastName());
        System.out.println(clnt1.getIdNumber());
        System.out.println(clnt1.getAge());


    }
}
