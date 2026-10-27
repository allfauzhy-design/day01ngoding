import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka a : ");
        int  a = input.nextInt();

        System.out.println("angka 1 sampai a");
        for (int i = 1;  i <= a; i++) {
            System.out.print(i + " ");
        }
    
        System.out.println("\nangka a sampai 1");
        for (int i = a; i >= 1; i--) {
            System.out.print(i + " ");
        }

    }
}
