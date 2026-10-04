import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int a = input.nextInt();

        if ( a % 2 == 0) {
            System.out.println("angka genap");
        }
        else {
            System.out.println("angka ganjil");
        }
    }
}
