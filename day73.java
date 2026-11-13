import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, total = 0;
        do {
            System.out.print("""
                  \n====== TOKO FAUZHY ======
                 == MENU YANG TERSEDIA ==
                 1. Nasi Ayam Geprek - Rp10.000
                 2. Nasi goreng - Rp13.000
                 3. Mie Ayam - Rp15.000
                 4. Selesai
                 Silahkan dipilih menunya kakak :  """);
                a = input.nextInt();
                 switch (a) {
                    case 1:
                        total += 10000;
                        System.out.println("Anda memilih Nasi Ayam Geprek ");
                        break;
                    case 2:
                        total += 13000;
                        System.out.println("Anda memilih Nasi Goreng ");
                        break;
                    case 3:
                        total += 15000;
                        System.out.println("Anda memilih Mie Ayam ");
                        break;
                    case 4:
                        System.out.println("Pesanan selesai ");
                        break;

                    default:
                        System.out.println("pilihan tidak tersedia");
                 }
                }
                while (a != 4); 
                   System.out.println("Total pembayaran anda : " + total);
    }
}
