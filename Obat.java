
public class Obat {

    public String[] namaObat = {"Paracetamol", "Amoxilin", "Promag", "Comix"};
    public int[] stok = {10, 20, 30, 40, 50};

    public void tampilobat(){
        System.out.println("Stok obat yang tersedia : ");
        for (int i = 0 ; i< 4 ; i++){
            System.out.println(namaObat[i]+ " " + stok[i]);
        }
    }

}
