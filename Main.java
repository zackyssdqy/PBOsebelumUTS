import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Sistem Pendataan obat di apotek");
            System.out.println("Pilih menu : ");
            System.out.println("1. Lihat stok obat");
            System.out.println("2. Tambah Stok obat");
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            if(pilih == 1){
                Obat obat = new Obat();
                obat.tampilobat();
            }else {
                TambahStok update = new TambahStok();
                update.TambahStok();
            }
        }while(pilih != 0);



    }
}