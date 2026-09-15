import java.util.Scanner;

public class day14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int a = input.nextInt();

        System.out.print("masukkan angka kedua : ");
        int b = input.nextInt();


        int d = a + b;
        int e = b - a;

        System.out.println("hasil penjumlahan : " + ( a + b));
        System.out.println("hasil pengurangan : " + ( b - a));
    }
}
