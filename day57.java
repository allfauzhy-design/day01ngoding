import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka batas : ");
        int a = input.nextInt();

        int b = 1;

        System.out.print("bilangan ganjil : ");
        while (b <= a) {
            System.out.print(b + " ");
            b += 2;
        }

        b = 2;
        System.out.print("\nbilangan genap : ");
        while (b <= a ) {
            System.out.print(b + " ");
            b +=2;
        }



    }
}
