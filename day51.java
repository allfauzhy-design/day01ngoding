import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka awal : ");
        int a = input.nextInt();

        for (int i = a; i <= a + 9; i++) {
            System.out.println("angka : " + i);
        }
   
   
    }
        
}
