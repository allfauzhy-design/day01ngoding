import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("masukkan jari jari lingkaran : ");
        int a = in.nextInt();
        
        final double PHI = 3.14;

        double luas = PHI * (a*a);

        System.out.println("jadi luas lingkaran adalah : " + luas);
       
    }                                                 
}
