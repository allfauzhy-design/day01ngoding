import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("masukkan angka : ");
     int a = input.nextInt();

        int b = 1;
        int c = 1;
        while (b <= a) {
            c = c * b;
            b++;
        }
        System.out.println("hasil : " + c);
    }
}
