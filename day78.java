import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, c, d;

        System.out.println("buat akun");
        System.out.print("username: ");
        a = input.nextLine();

        System.out.print("password: ");
        b = input.nextLine();

        System.out.println("\nlogin akun");

        do {
            System.out.print("username: ");
            c = input.nextLine();

            System.out.print("password: ");
            d = input.nextLine();

            if (c.equals(a) && d.equals(b)) {
                System.out.println("login berhasil!");
            } else {
                System.out.println("login salah, coba lagi!");
            }

        } while (!c.equals(a) || !d.equals(b));

    }
} 
