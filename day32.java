import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai tugas : ");
        int tugas = input.nextInt();
        System.out.print("masukkan nilai UTS : ");
        int uts = input.nextInt();
        System.out.print("masukkan nilai UAS : ");
        int uas = input.nextInt();

        System.out.println("");

        int total = tugas + uts + uas;

        int ratarata = total / 3;

        System.out.println("total nilai adalah : " + total);
        System.out.println("rata rata nilainya adalah : " + ratarata);

        System.out.println("nilai tugas lebih besar dari UTS : " + (tugas > uts));
        System.out.println("nilai UAS sama dengan tugas : " + (uas==tugas));
    }
}
