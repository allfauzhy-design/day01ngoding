import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok, potongan, gajiBersih;

        System.out.print("masukkan gaji pokok : ");
        gajiPokok = input.nextDouble();

        System.out.print("masukkan potongan : ");
        potongan = input.nextDouble();

        gajiBersih = gajiPokok - potongan;
        
        if (gajiBersih > 0) {
            System.out.printf("gaji bersih : %.0f",gajiBersih);
        }
        else {
            System.out.println("gaji bersih tidak valid");
        }
    }
}
