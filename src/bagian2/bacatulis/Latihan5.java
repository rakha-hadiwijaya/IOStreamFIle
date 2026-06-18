package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan5 {
    public void main(String[] args){
        //Append
        try(PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt", true))){
            penulis.println("Dewi");
            penulis.println("Eka");
            System.out.println("Dua data baru ditambahkan tanpa menghapus data lama.");
        }catch(IOException e){
            System.out.println("Gagal menambah data : " + e.getMessage());
        }
    }
}
