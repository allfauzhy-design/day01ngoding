import java.util.Scanner;

public class day46 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("===MENU JURUSAN KULIAH===");
    System.out.println("1. INFORMATIKA");
    System.out.println("2. SISTEM INFORMASI");
    System.out.println("3. TEKNIK SIPIL");
    System.out.println("4. ARSITEKTUR");
    System.out.print("pilih jurusan : ");

    int a = input.nextInt();

    switch (a) {
        case 1:
            System.out.println("jurusan INFORMATIKA");
            System.out.println("fokus pemrograman dan teknologi");
            break;

        case 2:
            System.out.println("jurusan SISTEM INFORMASI");
            System.out.println("fokus teknologi dan bisnis");
            break;
            
        case 3:
            System.out.println("jurusan TEKNIK SIPIL");
            System.out.println("fokus perencanaan dan pembangunan infrastruktur");
            break;
            
         case 4:
            System.out.println("jurusan ARSITEKTUR");
            System.out.println("fokus desain bangunan dan tata ruang");
            break;

    
        default:
            System.out.println("pilihan jurusan tidak tersedia");
            break;
    }



   }
}
