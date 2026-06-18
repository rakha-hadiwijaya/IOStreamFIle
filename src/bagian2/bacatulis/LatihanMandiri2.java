package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public void main(String[] args){
        try{
            System.out.println("Nomor 1");
            try(PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))){
                penulis.println("Senin");
                penulis.println("Selasa");
                penulis.println("Rabu");
                penulis.println("Kamis");
                penulis.println("Jumat");
            }
            
            System.out.println("Isi hari.txt");
            
            try(BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))){
                String baris;
                
                while((baris = pembaca.readLine()) != null){
                    System.out.println(baris);
                }
            }
            
            System.out.println("===========================");
            
            System.out.println("Nomor 2");
            try(PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))){
                penulis.println("Sabtu");
                penulis.println("Minggu");
            }
            
            System.out.println("Dua hari berhasil ditambahkan.");
            
            System.out.println("===========================");
            
            System.out.println("Nomor 3");
            int jumlahBaris = 0;
            
            try(BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))){
                String baris;
                
                while((baris = pembaca.readLine()) != null){
                    System.out.println(baris);
                    jumlahBaris++;
                }
            }
            System.out.println("\nJumlah baris dalam hari.txt : " + jumlahBaris);
        }catch(IOException e){
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }
    }
}
