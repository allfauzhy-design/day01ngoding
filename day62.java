import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        for ( int i = 1; i <= a; i++) {
            for ( int b = 1; b <= i; b++) {
                System.out.print(b + " ");
            }
           System.out.println();
        }
        
    }
}
