import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        String NIM = input.nextLine();
        String programStudi = input.nextLine();
        String fakultas = input.nextLine();
        String perguruanTinggi = input.nextLine();


        System.out.println("===PROFIL AKADEMIK===");
        System.out.println("nama  : " + nama);
        System.out.println("NIM : " + NIM );
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Perguruan Tinggi : " +perguruanTinggi);

        
    }
}
