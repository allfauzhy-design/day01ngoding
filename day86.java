import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("angka ke - " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("cari angkamu : ");
        int b = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (a[i] == b) {
                System.out.println("angkamu ditemukan : ");
            }
        }
    }
}
