import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan panjang : ");
        int panjang = input.nextInt();

        System.out.print("masukkan lebar : ");
        int lebar = input.nextInt();
         
        int luas = panjang * lebar;
        System.out.println("jadi luas persegi adalah : " + luas);


    }
}
