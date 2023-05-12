import java.util.Scanner;

public class job11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une hauteur : ");
        int hauteur = sc.nextInt();

        for (int i = 1; i <= hauteur; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
