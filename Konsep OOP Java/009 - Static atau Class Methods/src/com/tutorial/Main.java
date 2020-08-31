package com.tutorial;

import java.util.ArrayList;

class PemainBola {

    static int nomorPemain;
    private static ArrayList<String> nameList = new ArrayList<String>();



    private String nama;


    PemainBola(String inputNama){
        this.nama = inputNama;
        PemainBola.nomorPemain++; // setiap nomorpemain akan nambah terus
        PemainBola.nameList.add(this.nama);
    }

    void show(){
        System.out.println("Pemain bernama = "  + this.nama);
    }

    // static method
    static void showNomorPemain(){
        System.out.println(PemainBola.nomorPemain);
    }

    static ArrayList<String> getNames(){
        return PemainBola.nameList;
    }
}


public class Main {
    public static void main(String[] args) throws Exception{
        
        PemainBola pemain1 = new PemainBola("Wayne Rooney");
        PemainBola pemain2 = new PemainBola("Iniesta");
        PemainBola pemain3 = new PemainBola("Pirlo");
        PemainBola pemain4 = new PemainBola("Lampard");

       
        PemainBola.showNomorPemain();

        System.out.println("Names = " + PemainBola.getNames());
    }
}