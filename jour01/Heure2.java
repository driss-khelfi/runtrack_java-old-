import java.util.Scanner;
public class Heure2 {
    public static void main(String[] args) {



                Scanner myObj = new Scanner(System.in);
                int minutes;

                System.out.println("Entrez une durée en minutes:");
                minutes = myObj.nextInt();

                int heures = minutes / 60;
                int minutesRestantes = minutes % 60;

                System.out.println(minutes + " minutes est équivalent à " + heures + " heures et " + minutesRestantes + " minutes");
            }
        }


