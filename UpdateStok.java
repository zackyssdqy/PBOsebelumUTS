
public class UpdateStok extends TambahStok{

    public void UpdateStok(){
        TambahStok tambah = new TambahStok();
        for (int i = 0 ; i< 4 ; i++){
            stok[i] = stok[i] + stokbaru[i];
        }

        System.out.println("Update stok obat : ");
        for (int i = 0 ; i< 4 ; i++){
            System.out.println(namaObat[i] +" "+ stok[i]);
        }
    }
}
