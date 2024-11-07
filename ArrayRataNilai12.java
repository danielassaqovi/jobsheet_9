
import java.util.Scanner;

public class ArrayRataNilai12{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //deklarasi variabel
      int jmlmhs;
      double total = 0;
      double rata2;

      //input jumlah array
      System.out.print("Masukkan jumla mahasiswa : ");
      jmlmhs = sc.nextInt();

      //deklarasi variabel array
      int[] nilaiMhs = new int[jmlmhs];
      
      //perulangan
      for (int i = 0; i < nilaiMhs.length; i++){
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
      }
      for (int i = 0; i < nilaiMhs.length; i++){
        total += nilaiMhs[i];
        if (nilaiMhs[i] > 70){
          System.out.println("lulus!");
        }else{
          System.out.println("tidak llulus!");
        }
        
      }
      rata2 = total/nilaiMhs.length;
      System.out.println("Rataa-rata nilai = " + rata2);

      

  }
}