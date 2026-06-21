// Nama : Gusti Muhammad Rakha Hadiwijaya
// NPM  : 2410010221

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] kategori = {
            "Elektronik",
            "Makanan",
            "Minuman"
        };

        System.out.println("=== DAFTAR KATEGORI ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(
                new Barang("Laptop", 8500000, 5));

        gudang.tambahBarang(
                new Barang("Mouse", 150000, 20));

        gudang.tambahBarang(
                new Barang("Keyboard", 300000, 15));

        gudang.tambahBarang(
                new Barang("Monitor", 2200000, 8));

        gudang.tambahBarang(
                new Barang("Flashdisk", 80000, 25));

        System.out.println("\n=== DATA BARANG ===");
        gudang.tampilkanSemua();

        gudang.simpanKeBerkas();

        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println("\n=== DATA DARI FILE ===");
        gudangBaru.tampilkanSemua();

        System.out.println("\n=== TOTAL NILAI PERSEDIAAN ===");
        //System.out.println("Rp" + gudangBaru.totalNilai());  -> output representasi angka double        
        System.out.printf("Rp%,.0f%n", gudangBaru.totalNilai()); // -> output total nilai persediaan dengan pemisah ribuan agar lebih mudah dibaca
    }
}