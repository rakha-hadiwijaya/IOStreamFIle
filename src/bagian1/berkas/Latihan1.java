package bagian1.berkas;

import java.io.File;
import java.io.IOException; 

public class Latihan1 {
    public static void main(String[] args) throws IOException{        
        File berkas = new File("Catatan.txt");
        
        if(berkas.createNewFile()){
            System.out.println("Berkas Dibuat : " + berkas.getName());
        }else{
            System.out.println("Berkas Sudah Ada : " + berkas.getName());
        }
        
        //Memeriksa informasi berkas
        System.out.println("Apakah ada? : " + berkas.exists());
        System.out.println("Path Absolut : " + berkas.getAbsolutePath());
        System.out.println("Ukuran(byte) : " + berkas.length());
        System.out.println("Dapat dibaca : " + berkas.canRead());
    }
}
