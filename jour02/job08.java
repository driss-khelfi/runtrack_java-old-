import java.util.Scanner;

public class job08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int numero = sc.nextInt();
        String s = String.valueOf(numero);
        int count = s.length();
        System.out.println("Le nombre de chiffres dans " + numero + " est : " + count);
    }
}
