import java.util.Scanner;

public class day16 {
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

   
    System.out.print("masukkan angka : ");
    int a = input.nextInt();

    System.out.print("masukkan angka kedua : ");
    int b = input.nextInt();

   int hasilModulus = a % b;
   System.out.printf("hasil dari modulus : %d%n", hasilModulus);
   

    }

}
