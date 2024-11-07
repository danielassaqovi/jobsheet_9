import java.util.Scanner;

public class tg3pencarianMenu12 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //judul
        System.out.println("========================================");
        System.out.println("============ Pencarian Menu ============");
        System.out.println("========================================\n");

        //deklarasi array menu
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        //tampilkan menu
        System.out.println("Daftar Menu : ");
        for (String listMenu : menu) {
            System.out.println("- " + listMenu);
        }

        //input menu yg akan dicari
        System.out.println("\n----------------------------------------\n");
        System.out.print("Masukkan menu yg akan dicari : ");
        String cariMenu = input.nextLine();

        //logic cari menu 
        boolean search = false;
        for (String listMenu : menu) {
            if (listMenu.equalsIgnoreCase(cariMenu)) {
                search = true;
                break;
            }
        }

        //output
        if (search) {
            System.out.println("Menu " + cariMenu + " tersedia di menu.");
        }
        else {
            System.out.println("Menu yg dicari tidak tersedia.");
        }

    }

}