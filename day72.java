import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int b = 0;
        while (true) {
            System.out.print("angka : ");
           int a = input.nextInt();
            if ( a < 0) {
                break;
            }
            b += a;
        }
        System.out.println(b);
    }
}
