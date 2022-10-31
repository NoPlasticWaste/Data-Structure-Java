public class DemoBoolean {
    public static void main (String[] args) {
        int a = 10;
        int b = 5;
        boolean hasil = ! ( (a < 15) ^ (b > 6) );
        System.out.println("Hasilnya adalah :" + hasil);
    }
}