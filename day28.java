import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("masukkan angka pertama : ");
         int a = input.nextInt();

         System.out.print("masukkan angka kedua : ");
         int b = input.nextInt();

         System.out.println("apakah angkanya sama : " + (a == b));

         System.out.println("apakah angkanya berbeda : " + (a != b));
    
    }
}
