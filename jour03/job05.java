import java.util.Arrays;

public class job05 {
    public static void main(String[] args) {
        int[] montableau = {3, 7, 3, 9, 8};
        int[] tableau2 = new int[montableau.length];
        System.out.println(Arrays.toString(montableau));
        int count = 0;
        for (int i = 0; i < montableau.length; i++){
            boolean estUnique = true;
            for (int j = 0; j < count; j++) {
                if (montableau[i] == tableau2[j]) {
                    estUnique = false;
                    break;
                }
            }
            if (estUnique) {
                tableau2[count] = montableau[i];
                count++;
            }
        }
        tableau2 = Arrays.copyOf(tableau2, count);
        System.out.println(Arrays.toString(tableau2));
    }
}

