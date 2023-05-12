import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Job12 {
    public static void main(String[] args) {

            Scanner myObj = new Scanner(System.in);
            String str1;
            String str2;
        System.out.println("Entrez votre première chaîne: ");
        str1 = myObj.nextLine();
        System.out.println("Entrez votre seconde chaîne: ");
        str2 = myObj.nextLine();
        System.out.println(str1+" "+str2);

        str2 = str2 + " "+ str1;
        System.out.println(str2);

        }
    }
