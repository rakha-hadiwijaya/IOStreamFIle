package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("Kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));
                      
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        
        System.out.println();

        BukuKontak bukuLain = new BukuKontak("Kontak.txt");
        bukuLain.muatDariBerkas();
                  
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak : " + bukuLain.jumlahKontak());
        
        System.out.println();
       
        System.out.println("Data sebelum dihapus");       
        bukuLain.tampilkanSemua();

        bukuLain.hapusKontak("Budi");
        bukuLain.simpanKeBerkas();
        
        System.out.println();
        
        System.out.println("==  Data sesudah dihapus == ");        
        bukuLain.tampilkanSemua();
        
        System.out.println();
        
        System.out.println("== Hasil pencarian ==");        
        Kontak hasil = bukuLain.cariKontak("Budi");
        if (hasil != null) {
            System.out.println("Kontak ditemukan : " + hasil.info());
        } else {
            System.out.println("Kontak Budi tidak ditemukan.");
        }
    }
}