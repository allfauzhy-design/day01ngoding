import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int a = input.nextInt();
       

        if (a%2==0) {
            System.out.println("ini bilangan " + a + " termasuk genap");
        }
        else {
            System.out.println( a + " ini bilangan ganjil");
        }
    }
}
