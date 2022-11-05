import java.util.Scanner;

public class TambahStok extends Obat{


    int[] stokbaru = new int[4];
    public void TambahStok(){

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Stok tambahan obat");
        for (int i = 0 ; i< 4 ; i++){
            System.out.println(namaObat[i]+ " ");
            stokbaru[i] = input.nextInt();
        }
    }
}
