public class day76 {
    public static void main(String[] args) {

        String a = "  HP EliteBook x360 G8  ";

        System.out.println("Nama Laptop: " + a);

        String b = a.substring(2, 4);
        System.out.println("Merek: " + b);

        String c = a.replace("G8", "G9");
        System.out.println("Model baru: " + c);

        String d = a.trim();
        System.out.println("Nama setelah trim: " + d);
    }
}
