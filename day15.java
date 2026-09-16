import java.util.Scanner;

public class day15 {
   
public static void main(String[] args) {
Scanner fauzhy = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        float a = fauzhy.nextFloat();

        System.out.print("Masukkan angka kedua: ");
        double b = fauzhy.nextDouble();

        double hasil_perkalian = a*b;
        double hasil_pembagian = a/b;

        System.out.printf("Hasil perkalian: %.1f%n", hasil_perkalian);
        System.out.printf("Hasil pembagian: %.2f%n", hasil_pembagian);
    }

}
