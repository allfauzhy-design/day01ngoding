import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            if (nilai >= 90) {
                System.out.println("Nilai A");
            } else if (nilai >= 80) {
                System.out.println("Nilai B");
            } else {
                System.out.println("Nilai C");
            }
        } 
        else {
            System.out.println("Mengulangko tahun depan");
        }
    }
}
