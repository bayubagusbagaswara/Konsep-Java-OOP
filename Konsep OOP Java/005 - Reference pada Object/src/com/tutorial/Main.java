package com.tutorial;

class Buku{
    String judul, penulis;

    // constructor
    Buku(String inputJudul, String inputPenulis){
        this.judul = inputJudul;
        this.penulis = inputPenulis;
    }

    // tampilkan data dari object
    void Tampil(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}


public class Main {
    public static void main(String[] args) throws Exception{
        
        Buku buku1 = new Buku("Setelah Hujan Turun", "Boy Candra");
        buku1.Tampil();


        // menampilkan address nya
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println("Alamatnya : " + addressBuku1);

        // assignment object, akan menampilkan data dan address yang sama
        Buku buku2 = buku1;
        buku2.Tampil();

        // karena buku1 dan buku2 berada pada address atau referensi yang sama
        buku1.judul = "Senja Sore";
        buku1.Tampil();

        // kita akan memasukkan object kedalam methods Fungsi
        Fungsi(buku2);
        // jika kita tampilkan hasil menimpa dalam fungsi dataBuku
        buku1.Tampil();
        buku2.Tampil();
    }

    public static void Fungsi(Buku dataBuku){ // pass by reference
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressDataBuku);
        // coba kita ganti data bukunya
        dataBuku.penulis = "Demian Dematra"; // ini bukan mengcopy objectnya, soalnya alamatnya sama
    }
}