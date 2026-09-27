import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tahunLahir = input.nextInt();
        int tahunSekarang = input.nextInt();

        int umur = tahunSekarang - tahunLahir;

        System.out.println(umur + " Tahun");

    }
}
