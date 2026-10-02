import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int a = input.nextInt();
        System.out.print("masukkan angka kedua : ");
        int b = input.nextInt();

        boolean and = (a > 5 && b > 5);
        boolean or = (a > 5 || b > 5);
        boolean not = !(a > 5);

        System.out.println("hasil and : " + and);
        System.out.println("hasil or : " + or);
        System.out.println("hasil not : " + not);

     }
}
