package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public void main(String[] args){
        try{
        System.out.println("Nomor 1");
        File laporan = new File("laporan.txt");
        
        if(laporan.exists()){
            System.out.println("Berkas laporan.txt Ditemukan.");
            System.out.println("Ukuran file(byte) : " + laporan.length());
        }else{
            System.out.println("laporan.txt tidak ditemukan.");
        }
        
        System.out.println("==========================");
        
        System.out.println("Nomor 2");
        File arsip = new File("arsip");
        
        if(arsip.mkdir()){
            System.out.println("Folder arsip berhasil dibuat.");
        }else{
            System.out.println("Folder sudah ada");
        }
        
        System.out.println("==========================");
        
        System.out.println("Nomor 3");
        File sementara = new File("sementara.txt");
        
        if(sementara.createNewFile()){
            System.out.println("File sementara.txt berhasil dibuat.");
        }else{
            System.out.println("File sementara.txt sudah ada");
        }
        
        System.out.println("Status sebelum dihapus : " + sementara.exists());
        
        if(sementara.delete()){
            System.out.println("File sementara.txt berhasil dihapus");
        }else{
            System.out.println("File sementara.txt gagal dihapus");
        }
        
        System.out.println("Status sesudah dihapus : " + sementara.exists());
        
        }catch(IOException e){
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }
    }
}
