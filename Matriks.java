public class Matriks {
    public static void main (String[] args) {
        int[][] DuaDimensi = {{10,12},{11,14}};
        System.out.println("Array dengan matrik 2 x 2: ");
        for (int i = 0; i < DuaDimensi.length; i ++){
            for (int j = 0; j < DuaDimensi[i].length; j++) {
                System.out.println(DuaDimensi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}