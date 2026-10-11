import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan berat emas: ");
        double a = input.nextDouble();

        if (a % 1==0) {
            System.out.println("Bilangan Bulat (Emas Fisik)");
        }
        else {
            System.out.println("Bilangan Desimal (Emas Digital)");
        }

    }

    }
