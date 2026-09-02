public class day02 {
    public static void main(String[] args) {
       
       // ini adalah variabel
        String nama, alamat, hobi, wa, nim;
        nama = "all fauzhy";
        alamat = "mamuju.kecamatan kalukku";
        hobi = "memancing";
        wa = "081526125687";
        nim = "D0226319";

       // ini bagian println
        System.out.println("====BIODATA SAYA====");
        System.out.println("nama \t\t: " + nama);
        System.out.println("alamat \t\t: " + alamat);
        System.out.println("hobi \t\t: " + hobi);
        System.out.println("nomor whatsapp \t: " + wa);
        System.out.println("nim \t\t: " + nim+"\n");

       // ini bagian print
        System.out.print("====BIODATA SAYA====\n");
        System.out.print("nama \t\t: " + nama + "\n");
        System.out.print("alamat \t\t: " + alamat + "\n");
        System.out.print("hobi \t\t: " + hobi + "\n");
        System.out.print("nomor whatsapp \t: " + wa + "\n");
        System.out.print("nim \t\t: " + nim + "\n\n");

       // ini bagian printf
        System.out.printf("====BIODATA SAYA====\n");
        System.out.printf("nama \t\t: %s%n", nama);
        System.out.printf("alamat \t\t: %s%n", alamat);
        System.out.printf("hobi \t\t: %s%n", hobi);
        System.out.printf("nomor whatsapp \t: %s%n", wa);
        System.out.printf("nim \t\t: %s%n", nim);

    }
}
