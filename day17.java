import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");   
        int angka = input.nextInt();
        
       

        angka += 5;
        System.out.println(angka);

        angka -= 5;
        System.out.println(angka);

        angka *= 5;
        System.out.println(angka);

        angka /= 5;
        System.out.println(angka);

        angka %= 5;
        System.out.println(angka);


    }
    
}
