import java.util.Scanner;

public class tg1NilaiMhs12 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //judul
        System.out.println("============================================");
        System.out.println("           Kelola Nilai Mahasiswa           ");
        System.out.println("============================================");

        //input jumlah nilai yg akan diinput
        System.out.print("Masukkan banyak nilai mahasiswa yg akan diinput : ");
        int jumlahNilai = input.nextInt();

        //deklarasi array berdasarkan jumlah nilai yg akan diinput
        int[] nilaiMhs = new int[jumlahNilai];

        //perulangan untuk input nilai
        double totalNilai = 0; //inisialisasi nilai keseluruhan
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();

            //hitung nilai keseluruhan
            totalNilai += nilaiMhs[i];
        }

        //hitung rata2
        double rata2 = totalNilai / nilaiMhs.length;

        //cari nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int nilai : nilaiMhs) {
            //cari nilai tertinggi
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            //cari nilai terendah
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        //output
        System.out.println("--------------------------------------------");
        System.out.println("\nNilai yang telah dimasukkan");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " : " + nilaiMhs[i]);
        }

        System.out.println("--------------------------------------------");
        System.out.println("\nRata2 : " + rata2);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);

    }

}