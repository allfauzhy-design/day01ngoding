import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int a = input.nextInt();

        String hasil = (a % 2 == 0)? "genap" : "ganjil";
        System.out.println("bilangannya adalah : " + hasil);
    }
}
