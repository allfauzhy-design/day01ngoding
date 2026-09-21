import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Mengubah data primitif ke data String
        System.out.print("masukkan angka int : ");
        int a = input.nextInt();
        System.out.print("masukkan boolean : ");
        boolean b = input.nextBoolean();
        System.out.print("masukkan angka double : ");
        double c = input.nextDouble();

        String p = String.valueOf(a);
        String pp = String.valueOf(b);
        String ppp = String.valueOf(c);

        System.out.println("ini int ke String : " + p);
        System.out.println("ini boolean ke String : " + pp);
        System.out.println("ini double ke String : " + ppp);

    }
}
