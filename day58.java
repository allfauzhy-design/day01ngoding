import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan batas angka : ");
        int a = input.nextInt();

        int ganjil = 1;
        int genap = 2;
        System.out.println("ganjil");
        while ( ganjil < a ) {
            System.out.print(ganjil + " ");
            ganjil +=2;
        }
        System.out.println("\ngenap");
        while ( genap < a ) {
            System.out.print(genap + " ");
            genap +=2;
        }

    }
}
