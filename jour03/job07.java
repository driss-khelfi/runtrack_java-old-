// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class job07 {
    public static void main(String[] args) {
        int[][] matrice1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrice2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] matrice3 = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
        }
        for (int i = 0; i < matrice2.length; i++) {
            for (int j = 0; j < matrice2[i].length; j++) {
                System.out.println(matrice2[i][j] + " ");
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrice3[i][j]=matrice1[i][j]+matrice2[i][j];  
                System.out.print(matrice3[i][j]+" ");
            }
            System.out.println();//new line
        }
    }}

