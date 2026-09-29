import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka pertama : ");
        int a = input.nextInt();
        System.out.print("masukkan angka kedua : ");
        int b = input.nextInt();

        System.out.println("apakah angka pertama lebih kecil dari angka kedua : " + (a < b));
        System.out.println("apakah angka pertama lebih besar dari angka kedua : " + (a > b));
    }
}
