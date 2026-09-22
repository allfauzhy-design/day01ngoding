import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        

        System.out.print("Masukkan umur: ");
        String umur = scan.nextLine();

        System.out.print("Masukkan tinggi: ");
        String tinggi = scan.nextLine();

        System.out.print("Masukkan kelamin: ");
        String kelamin = scan.nextLine();

        System.out.print("Masukkan boolean (true/false): ");
        String b = scan.nextLine();

        System.out.print("Masukkan berat: ");
        String berat = scan.nextLine();

        

        int umurInt = Integer.parseInt(umur);
        System.out.println("Umur dalam bentuk integer : " + umurInt);

        double tinggiDouble = Double.parseDouble(tinggi);
        System.out.println("Tinggi dalam bentuk double : " + tinggiDouble);

        char Char = kelamin.charAt(0);
        System.out.println("Kelamin dalam bentuk char : " + Char);

        boolean bBoolean = Boolean.parseBoolean(b);
        System.out.println("String Boolean dalam bentuk boolean : " + bBoolean);

        float f = Float.parseFloat(berat);
        System.out.println("String float dalam bentuk float : " + f);

        
    }
}
