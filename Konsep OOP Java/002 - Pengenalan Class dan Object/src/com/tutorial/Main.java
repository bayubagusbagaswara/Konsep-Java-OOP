package com.tutorial;

// membuat class sebagai template / blueprint nya
class Mobil{

    // property nya apa aja yang ada di dalam object tersebut
    String nama, merk, warna; 
    int tahun, kecepatan;
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        // instansiasi atau membuat object
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Honda";
        mobil1.tahun = 1990;
        mobil1.nama = "Mobilio";

        System.out.println(mobil1.nama);
        System.out.println(mobil1.merk);
        System.out.println(mobil1.tahun);
    }
}