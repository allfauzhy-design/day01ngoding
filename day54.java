import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if ( y > x ) {
            x++;
        }
        else if ( y < x ) {
            x--;
        }
        if ( z > x ) {
            x += 2;
        }
        else if ( z < x ) {
            x -= 2;
        }
        System.out.println("");
        System.out.println(x);
    }
}
