import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");

        double d = input.nextDouble();
        float f = (float) d;
        int i = (int) f;
        byte b = (byte)i;

        System.out.println("double\t : " + d );
        System.out.println("float\t : " + f );
        System.out.println("int\t : " + i);
        System.out.println("byte\t : " + b);
        


    }
}
