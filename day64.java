import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int a, hasil = 1;
      a = input.nextInt();

      int b = a;
      while (b >= 1) {
        hasil *= b;
        b--;
      }
      System.out.println(hasil);
    }
}
