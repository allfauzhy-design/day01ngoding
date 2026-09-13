import java.util.Scanner;
public class day12 {
    
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String nama, nim, hobi, kelas, alamat;

    int umur;

    System.out.print("masukkan nama anda : ");
    nama = input.nextLine();
    System.out.print("masukkan nim anda : ");
    nim = input.nextLine();
    System.out.print("masukkan hobi anda : ");
    hobi = input.nextLine();
    System.out.print("masukkan kelas anda : ");
    kelas = input.nextLine();
    System.out.print("masukkan alamat anda : ");
    alamat = input.nextLine();
    System.out.print("masukkan umur anda : ");
    umur = input.nextInt();

    System.out.println("");

    System.out.println("=====BIODATA ANDA=====");
    System.out.println("Nama saya adalah : " + nama);
    System.out.println("Nim saya adalah : " + nim);
    System.out.println("Hobi saya adalah : " + hobi);
    System.out.println("Kelas saya adalah : " + kelas);
    System.out.println("Alamat saya adalah : " + alamat);
    System.out.println("Umur saya adalah : " + umur);

    }

}
