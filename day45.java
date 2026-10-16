import java.util.Scanner;
public class day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                ===MENU PILIHAN===
                1. NASI KUNING
                2. MIE AYAM
                3. BAKSO
                silahkan pilih menunya (1-3)
                """);
                int a = input.nextInt();
                
        switch (a) {
            case 1:
                System.out.println("anda memilih NASI KUNING ");
                break;
            case 2:
                System.out.println("anda memilih MIE AYAM ");
                break;
            case 3:
                System.out.println("anda memilih BAKSO ");
                break;
        
            default:
                System.out.println("pilihan tidak valid");
                break;
        }
    }
}
