package bagian3.kontak;


public class Kontak {
    //atribut data kontak
    private String nama;
    private String nomor;
    private String email;

    //constructor : dipanggil saat objek dibuat
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    //getter : membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }
    
    public String getEmail() {
        return email;
    }

    //mengubah objek menjadi 1 baris ke berkas
    public String KeBaris(){
        return nama + " ; " + nomor + " ; " + email;
    }
    
    //mengembalikan keterangan kontak ke dalam bentuk teks
    public String info(){
        return nama + " - " + nomor + " - " + email;
    }
}
