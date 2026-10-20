import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

     System.out.print("masukkan nilai : ");
     int a = input.nextInt();

        String hasil = (a >= 75)? "lulus" : "tidak lulus";

        System.out.println("nilai kamu : " + a);
        System.out.println("hasil : " + hasil);
        
    }
    
}
