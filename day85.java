import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a [] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = input.nextInt();
        }
        int b = a[0];

        for (int i = 0; i < 3; i++) {
            if ( a[i] < b) {
                b = a[i];
            }
        }
        System.out.println(b);
    }
}
