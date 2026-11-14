import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan namamu : ");
        String a = input.nextLine();

        System.out.println("panjang namamu : " + a.length());
        System.out.println("huruf besarnya namamu " + a.toUpperCase());
        System.out.println("huruf kecilnya namamu " + a.toLowerCase());

    }
}
