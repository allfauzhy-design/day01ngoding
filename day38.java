import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("""
               === MENU MAKANAN ===
               1. NASI GORENG
               2. MIE AYAM
               3. SOTO
                Pilih menu (1-3):
               """);
       int menu = input.nextInt();


       if (menu == 1) {
           System.out.println("Anda memilih NASI GORENG");
           System.out.println("Harga : Rp10.000");
       } else if (menu == 2) {
           System.out.println("Anda memilih MIE AYAM");
           System.out.println("Harga : Rp15.000");
       } else if (menu == 3) {
           System.out.println("Anda memilih SOTO");
           System.out.println("Harga : Rp18.000");
       } else {
           System.out.println("Menu tidak tersedia");
       }
    }
}
