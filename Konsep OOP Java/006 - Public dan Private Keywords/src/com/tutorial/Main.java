package com.tutorial;

class PemainBola {
    String nama; //default, akan bisa dibaca dan ditulis dari luar class
    public int stamina; // public, akan bisa dibaca dan ditulis dari luar class
    private int kecepatan; // private, hanya akan bisa dibaca dan ditulis di dalam class saja

    PemainBola(String inputNama, int inputStamina, int inputKecepatan){
        this.nama = inputNama;
        this.stamina = inputStamina;
        this.kecepatan = inputKecepatan;
    }

    // default modifier access
    void Tampil(){
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Stamina\t: " + this.stamina);
        System.out.println("Kecepatan\t: " + this.kecepatan); // membaca tapi dilakukan di dalam class ini
    }

    // public
    public void ubahNama(String namaBaru){
        this.nama = namaBaru;
    }

    private void tambahStamina(){
        this.stamina += 100;

    }

}

public class Main {
    public static void main(String[] args) throws Exception{
        
    PemainBola pemain1 = new PemainBola("Ronaldo", 0, 200);
    
    // default
    System.out.println(pemain1.nama); // membaca data
    pemain1.nama = "Dybala"; // menulis data 
    System.out.println(pemain1.nama); // membaca data

    // public
    System.out.println(pemain1.stamina); // membaca data
    pemain1.stamina = 90; // menulis data
    System.out.println(pemain1.stamina); // membaca data

    // private, ada tanda garis bawah merah artinya tidak dapat dibaca
    // System.out.println(pemain1.kecepatan); // membaca data
    // pemain1.kecepatan = 200; // menulis data
    // System.out.println(pemain1.kecepatan); // membaca data

    // panggil methods Tampil
    // default
    pemain1.Tampil();

    // public
    pemain1.ubahNama("Messi");
    pemain1.Tampil();

    // private


    }
}