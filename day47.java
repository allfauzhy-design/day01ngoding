import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tentukan hari berdasarkan urutan angka (1-7) : ");
        int a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("Hari Senin");
                break;

            case 2:
                System.out.println("Hari Selasa");
                break;

            case 3: 
            System.out.println("Hari Rabu");
                break;
            
            case 4:
                System.out.println("Hari Kamis");
                break;

            case 5:
                System.out.println("Hari Jumat");
                break;

            case 6:
                System.out.println("Hari Sabtu");
                break;

            case 7:
                System.out.println("Hari MInggu");
                System.out.println("Tidor pun sodap nih");
                break;
    
            default:
                System.out.println("Pilihan hari mu tidak valid");
                break;
        }
    }
}
