import java.util.Scanner;
public class day55 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka batas: ");
        int a = input.nextInt();

        if (a < 1) {
            System.out.println("angka harus lebih dari 0");
            input.close();
            return;
        }
        for (int i = 1; i <= a; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("perulangan selesai.");
        input.close();
    }
}
