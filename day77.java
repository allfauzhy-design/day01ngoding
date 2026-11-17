public class day77 {
    public static void main(String[] args) {
        String a = "HP EliteBook x360 G8";
        String b = "Intel Core i7";
        String c = "512GB SSD";

        System.out.println("===== LAPTOP MY FAVORIT KESUKAAN GWEH =====");

        System.out.println("Nama Laptop : " + a);
        System.out.println("Prosesor    : " + b);
        System.out.println("Storage     : " + c);

        System.out.println("Panjang Nama: " + a.length());
        System.out.println("Nama Kapital: " + a.toUpperCase());
        System.out.println("Nama Kecil  : " + a.toLowerCase());
        System.out.println("Nama Singkat: " + a.substring(3, 12));
        System.out.println("Ganti Merek : " + a.replace("HP", "Dell"));
        System.out.println("Cek EliteBook: " + a.contains("EliteBook"));
        System.out.println("Cek Prosesor : " + b.equals("Intel Core i5"));
        
    }
}
