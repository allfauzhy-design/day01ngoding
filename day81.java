import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("=== INPUT NILAI ===");
        for (int i = 0; i < a.length; i++) {
            System.out.print("nilai mahasiswa " + (i + 1) + ": ");
            a[i] = input.nextInt();
        }
        System.out.println("\n=== NILAI ===");

        for (int i = 0; i < a.length; i++) {
            System.out.println("mahasiswa " + (i + 1) + " mendapat nilai " + a[i]);
        }
    }
}
