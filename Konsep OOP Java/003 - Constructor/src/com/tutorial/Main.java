package com.tutorial;

// class tanpa constructor / class polosan => gunanya untuk isinya object yang berbeda-beda
class Mobil{
    String nama;
    int tahun;
}

// class dengan constructor (constructor dieksekusi pertama kali saat object dibuat)
class mobilToyota {
    String nama;
    String warna;
    int tahun;

    //bikin constuctornya, akan dipanggil pertama kali saat object dibuat
    // mobilToyota(){
    //     System.out.println("Ini adalah jenis-jenis mobil Toyota");
    // }

    //constructor dengan parameter, seperti membuat fungsi
    mobilToyota(String inputNama, String inputWarna, int inputTahun){
        nama = inputNama;
        warna = inputWarna;
        tahun = inputTahun;

        System.out.println(nama);
        System.out.println(warna);
        System.out.println(tahun);
        System.out.println();

    }

    
}
public class Main {
    public static void main(String[] args) throws Exception{
        
        // Mobil objectMobil_1 = new Mobil();
        // objectMobil_1.nama = "Avanza";
        // objectMobil_1.tahun = 2002;

        mobilToyota mobil1 = new mobilToyota("Rush", "merah", 2005);
        mobilToyota mobil2 = new mobilToyota("Kijang Inova", "coklat", 1998);
        // mobilToyota mobil3 = new mobilToyota("Fortuner");
        // System.out.println(mobil1.nama);
        // System.out.println(mobil1.warna);
        // System.out.println(mobil1.tahun);
        // System.out.println(mobil2.nama);
        // System.out.println(mobil3.nama);

    }
}