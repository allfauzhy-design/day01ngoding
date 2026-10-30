import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan nilai a : ");
         int a = input.nextInt();
        System.out.print("masukkan nilai b : ");
         int b = input.nextInt();

        System.out.println("kelipatan " + a + " dari  " + b);
        for (int i = a; i <= b; i+=a) {
            System.out.print(i + " ");
        }


    }
}
