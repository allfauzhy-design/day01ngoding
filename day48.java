import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

          System.out.print("""
            === MENU OPERASI ===
            1. penjumlahan
            2. pengurangan
            3. perkalian
            4. pembagian
            silahkan di pilih ya kaka' :  """);
            int a = input.nextInt();

            System.out.print("masukkan angka pertamanya : ");
            double angka1 = input.nextDouble();
            System.out.print("masukkan angka keduanya : ");
            double angka2 = input.nextDouble();


            switch (a) {
                case 1:
                    System.out.println("hasil penjumlahan " + (angka1 + angka2) );
                    break;

                case 2:
                    System.out.println("hasil pengurangan :" + (angka1 - angka2));
                    break;

                case 3: 
                    System.out.println("hasil perkalian : " + (angka1 * angka2));
                    break;

                case 4:
                    System.out.println("hasil pembagian : " + (angka1 / angka2));
                    break;

                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
    }
}

    
