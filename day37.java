import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Angkanya positif");
        } else if (angka < 0) {
            System.out.println("Angkanya negatif");
        } else {
            System.out.println("Angkanya nol");
        }
    }
} 
    
