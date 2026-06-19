package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args){
        BukuKontak buku = new BukuKontak("Kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111"));
        buku.tambahKontak(new Kontak("Budi", "0822222"));
        buku.tambahKontak(new Kontak("Citra", "0833333"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        
        System.out.println();
        
        //objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("Kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak : " + bukuLain.jumlahKontak());
        
        Kontak hasil = buku.cariKontak("Budi");
        if(hasil != null){
            System.out.println("Kontak ditemukan : " + hasil.info());
        }else{
            System.out.println("Kontak tidak ditemukan");
        }
    }
}
