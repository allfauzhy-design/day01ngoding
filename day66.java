import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int a = input.nextInt();
      int b = 0;
      while ( b < a ) {
        System.out.print("-");
        b++;
      }
    }
}
