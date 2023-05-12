import java.util.Arrays;
public class job04 {
    public static void main(String[] args) {
        int[] montableau = {3, 7, 3, 9, 8};
        System.out.println(Arrays.toString(montableau));
        int count = 0;
        for (int i=0; i < montableau.length; i++){

                count++;
        }
        System.out.println("Il y a "+ count+" éléments dans mon tableau");
        }
    }
