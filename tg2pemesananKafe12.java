import java.util.Scanner;

public class tg2pemesananKafe12 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //judul
        System.out.println("=============================================");
        System.out.println("============ Kelola Pesanan Kafe ============");
        System.out.println("=============================================\n");

        //input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan : ");
        int jmlPesanan = input.nextInt();
        input.nextLine();
        System.out.println();

        //deklarasi array
        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        // Memasukkan nama dan harga pesanan
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + "\t: ");
            namaPesanan[i] = input.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + "\t: ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine(); 
            System.out.println();
        }

        // Menghitung total harga
        double totalHarga = 0;
        for (double harga : hargaPesanan) {
            totalHarga += harga;
        }

        // Output daftar pesanan dan total harga
        System.out.println("\n---------------------------------------------\n");
        System.out.println("Daftar Pesanan:");

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println(namaPesanan[i] + "\t: Rp " + hargaPesanan[i]);
        }
        System.out.print("Total Harga \t: Rp " + totalHarga);

    }

}