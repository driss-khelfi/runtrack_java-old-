public class job12 {
    public static void main(String[] args) {
        int[] des = {1, 2, 3, 4, 5, 6};
        int nbCombinaisons = 0;

        for (int i = 0; i < des.length; i++) {
            for (int j = 0; j < des.length; j++) {
                for (int k = 0; k < des.length; k++) {
                    System.out.println(des[i] + " " + des[j] + " " + des[k]);
                    nbCombinaisons++;
                }
            }
        }

        System.out.println("Nombre total de combinaisons possibles : " + nbCombinaisons);
    }
}
