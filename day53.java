import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka pertama : ");
        int a = input.nextInt();
        System.out.print("masukkan angka batas : ");
        int b = input.nextInt();

        do {
            System.out.println("angka : " + a);
            a++;
        }
        while (a <= b);
        
    }
}
