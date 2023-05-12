import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class job04 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number= 0;



        while (number <= 100 ) {

            if (number % 2 ==0){
                System.out.println(number);

            }
            number++;

        }
    }
}