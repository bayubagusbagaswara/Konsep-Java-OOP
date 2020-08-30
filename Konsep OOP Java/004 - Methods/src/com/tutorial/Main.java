package com.tutorial;


class mobilToyota {
    // data atau properti
    String nama, warna, transmisi;
    int tahun;
 

    // constructor 
    mobilToyota(String inputNama, String inputWarna, int inputTahun, String inputTransmisi){
        
        // this menunjukkan kepada data di class nya atau objectnya
        this.nama = inputNama;
        this.warna = inputWarna;
        this.tahun = inputTahun;
        this.transmisi = inputTransmisi;
    }

    // bikin method
    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama); // data dari propertinya
        System.out.println("Warna : " + this.warna);
    }

    // method tanpa return dan dengan parameter
    void gantiTransmisi(String transmisi){
        this.transmisi = transmisi;
        System.out.println("Transmisi : " + this.transmisi);
    }

    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getWarna(){
        return this.warna;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + "juga, mobil ini namanya adalah" + this.nama;
    }    
}

public class Main {
    public static void main(String[] args) throws Exception{
        mobilToyota mobil1 = new mobilToyota("Fortuner", "Putih", 2009, "manual");
        
        // panggil methodnya
        mobil1.show();
        mobil1.gantiTransmisi("manual");
        

        System.out.println();
        System.out.println(mobil1.getNama());
        System.out.println(mobil1.getWarna());

        String data = mobil1.sayHi("Halo");
        System.out.println(data);

        
    }
}