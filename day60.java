import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka : " );
        int a = input.nextInt();
        
        int b = 0;
        for (int i = 1; i <= a; i++) {
            b += i;
        }

        System.out.println("hasil penjumlahan : " + b);


    }
}
