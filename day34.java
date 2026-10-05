import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan umur : ");
        int a = input.nextInt();

        if ( a >= 60) {
            System.out.println("kamu sudah tua yaa");
        }

        else if ( a >= 18 && a < 60) {
            System.out.println("wah kamu sudah dewasa");
        }
        else if ( a < 18 && a >= 13) {
            System.out.println("wah kamu sudah remaja");
        }
        else {
            System.out.println("masih bocil ingusan ya");
        }
    }
}
