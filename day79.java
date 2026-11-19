import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("kasi masuk angkamu : ");
            a[i] = input.nextInt();
        }
        System.out.println("hasilnya : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
