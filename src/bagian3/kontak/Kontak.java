package bagian3.kontak;


public class Kontak {
    //atribut data kontak
    private String nama;
    private String nomor;

    //constructor : dipanggil saat objek dibuat
    public Kontak(String nama, String nomor) {
        this.nama = nama;
        this.nomor = nomor;
    }

    //getter : membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    //mengubah objek menjadi 1 baris ke berkas
    public String KeBaris(){
        return nama + " ; " + nomor;
    }
    
    //mengembalikan keterangan kontak ke dalam bentuk teks
    public String info(){
        return nama + " - " + nomor;
    }
}
