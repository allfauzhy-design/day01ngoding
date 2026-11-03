import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int i = 1;

        int angka = 1;
        
        while ( i <= b ) {
            angka = angka * a;
            i++;
        }
        System.out.println("hasil : " + angka);

    }
}
