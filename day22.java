import java.util.Scanner;

public class day22{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int a = input.nextInt();

        System.out.print("masukkan angka ke dua : ");
        int b = input.nextInt();


       System.out.println("sebelum a di ubah : " + a);
       System.out.println("sebelum b di ubah : " + b);

        System.out.println("");

       a = a + b;
       b = a - b;
       a = a - b;

       System.out.println("setelah a di ubah : " + a);
       System.out.println("setelah b di ubah : " + b);



    }
}
    
