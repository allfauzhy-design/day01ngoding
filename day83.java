public class day83 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int jumlah = 0;

        for (int i = 0; i < a.length; i++) {
            jumlah += a[i];
        }

        System.out.println("Jumlah array = " + jumlah);
    }
}

