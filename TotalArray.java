public class TotalArray {
    public static void main(String[] args) {
        int[] AJumlah = new int[10];
        System.out.println("Nilai isi array adalah:");
        int x = 1;
        for (int i = 0; i < AJumlah.length; i++) {
            AJumlah[i] = x;
            x++;
            System.out.println(AJumlah[i]);
        }
    }
}