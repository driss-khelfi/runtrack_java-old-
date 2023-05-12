import java.util.*;

public class job08 {
    public static void main(String[] args) {
        int[][] matrice = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};

        // Tri de la matrice en utilisant l'algorithme de tri à bulles
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length - 1; j++) {
                for (int k = 0; k < matrice[i].length - 1 - j; k++) {
                    if (matrice[i][k] > matrice[i][k+1]) {
                        // Échange les éléments dans la matrice
                        int temp = matrice[i][k];
                        matrice[i][k] = matrice[i][k+1];
                        matrice[i][k+1] = temp;
                    }
                }
            }
        }

        // Affichage de la matrice triée
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
        }
    }
}

