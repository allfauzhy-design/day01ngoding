public class day04 {

    public static void main(String[] args) {
        
        byte b= 127;
        short s= 32767;
        int i= 327897867;
        long l= 2147979848364778687L;

        System.out.println("==CONTOH BILANGAN==");
        System.out.println("nilai byte :"+b);
        System.out.println("nilai short :"+s);
        System.out.println("nilai int :"+i);
        System.out.println("nilai long :"+l);

        System.out.println("");

        System.out.println("==Value MIN DAN MAX tipe data numerik bilagan bulat==\n");
        System.out.println("Nilai Byte dari bilangan "+Byte.MIN_VALUE +" sampai "+Byte.MAX_VALUE);
        System.out.println("Nilai short dari bilangan "+Short.MIN_VALUE +" sampai "+Short.MAX_VALUE);
        System.out.println("Nilai Int dari bilangan "+Integer.MIN_VALUE +" sampai "+Integer.MAX_VALUE);
        System.out.println("Nilai long dari bilangan "+Long.MIN_VALUE +" sampai "+Long.MAX_VALUE);

        System.out.println("");    
    }
}
