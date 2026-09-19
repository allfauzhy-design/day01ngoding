import java.util.Scanner;

public class day18 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        byte a = input.nextByte();
        
        short x = a;
        int b = x;
        long c = b;
        float f = c;
        double d = f;

        System.out.printf("ini byte     :%d%n",a);
        System.out.printf("ini short    :%d%n",x);
        System.out.printf("ini integer  :%d%n",b);
        System.out.printf("ini long     :%d%n",c);
        System.out.printf("ini float    :%.1f%n",f);
        System.out.printf("ini double   :%.2f",d);
        

    }
    
}
