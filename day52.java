import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan waktu : ");
        int a = input.nextInt();

        while ( a > 0 ) {
            System.out.println("waktu tersisa : " + a + " detik");
            a--;
        }
        System.out.println("waktumu habis bro");
    }
}
