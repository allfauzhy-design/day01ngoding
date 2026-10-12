import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("masukkan suhu ruangan : ");
        double temp = input.nextDouble();

        if (temp < 20) {
            System.out.println("temperatur ruangan dingin");
        }
        else if (temp >=20 && temp <=28 ) {
            System.out.println("temperatur ruangan normal");
        }
        else {
            System.out.println("ruangan panas");
        }
    }
}
