import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi,luas;

        System.out.print("masukkan sisi : ");
        sisi = input.nextInt();
        
        luas = sisi*sisi;
        System.out.printf("jadi luas dari persegi dengan sisi %dcm adalah : %dcm",sisi,luas);
    }
}
