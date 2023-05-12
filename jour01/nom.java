import java.util.Scanner; // import the Scanner class
public class nom{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        String userSurname;

        // Enter username and press Enter
        System.out.println("Entrez votre pérnom");
        userName = myObj.nextLine();
        System.out.println("Entrez votre nom");
        userSurname = myObj.nextLine();

        System.out.println("Bonjour " + userName + " "+ userSurname);
    }
    }
