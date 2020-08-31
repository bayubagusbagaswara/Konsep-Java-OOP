package com.tutorial;

// Static varibale. kita menaruh si attribut atau variabel nya nempel ke classnya

class Display {
    // static akan nempel dengan si classnya
    static String tipe = "Display";
    private String nama;

    Display(String inputNama){
        this.nama = inputNama;
    }

    // mengganti isi variable static
    void setTipe (String inputTipe){
        //tipe = inputTipe; // alternatif
        //this.tipe = inputTipe; // untuk mengetahui punya siapa // alternatif 2
        Display.tipe = inputTipe; // alternatif 3 yang paling direkomendasikan
    }

    void show(){
        System.out.println("Display name = "  + this.nama); 
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        // tampilkan static variabel atau class variabel

        // kita coba mengganti variable staticnya
        Display.tipe = "Spanduk"; // semua var staticnya berubah menjadi spanduk

        // variabel static akan disharing ke semuanya



        System.out.println("\nMenampilkan static variabel");
        System.out.println(display1.tipe);
        System.out.println(display2.tipe);
        System.out.println(Display.tipe); // langsung ketik classnya, dan variabel staticnya
       
    }
}