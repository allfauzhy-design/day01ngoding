import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("angka : ");
            a[i] = input.nextInt();
        }

        a[2] = 100;

        System.out.println("setelah diubah:");

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
} 
    
