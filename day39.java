import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("angka pertama : ");
        int a = input.nextInt();
        System.out.print("angka kedua : ");
        int b = input.nextInt();

        System.out.print("""
                1 penjumlahan (+)
                2 pengurangan (-)
                3 perkalian (*)
                4 pembagian (/)
                silahkan pilih (1-4)
                """);
        int c = input.nextInt();
        

        if ( c == 1) {
            System.out.println("hasil : " + (a + b));
        }
        else if (c == 2) {
            System.out.println("hasil : " + (a - b));
        }
        else if (c == 3) {
            System.out.println("hasil : " + (a * b));
        }
        else if (c == 4) {
            System.out.println("hasil : " + (a / b));
        }
        else {
            System.out.println("error, silahkan pilih operasi yg benar");
        }

    }
}
