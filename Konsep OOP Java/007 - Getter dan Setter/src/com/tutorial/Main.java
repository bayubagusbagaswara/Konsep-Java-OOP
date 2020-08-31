package com.tutorial;

// ENCAPSULASI, kita ingin membuat dia itu terlindungi, yang dilindungi adalah batasan untuk classnya

class Data {
    // properti
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        // data kosongan
        this.intPublic = 0;
        this.intPrivate = 50;
    }

    void display(){
        // akali untuk menampilkan nilai dari SETTER
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }
    // kita butuh fungsi untuk konversi Privatenya, karena hanya bisa diakses dalam satu class

    // GETTER
    public int getIntPrivate(){
        return this.intPrivate; // untuk mengembalikan nilai
    }

    // SETTER
    // ciri khas setter biasanya pake void dalam fungsinya

    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

// kita coba buat class lagi
class Lingkaran {
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // kita bikin SETTER tapi jari-jari
    public void setJari(double jari){
        this.diameter = jari*2;
    }

    // kita bikin GETTER
    public double getJari(){
        return this.diameter/2;
    }

    // getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        
        Data object = new Data();

        // public

        // read & write
        object.intPublic = 10; // write
        System.out.println(object.intPublic); // read

        // kalau private itu gabisa write dan read dari luar, gimana caranya biar bisa? Pake Getter dan Setter

        // read only (kita bisa menggunakan GETTER)
        int angka = object.getIntPrivate(); // manggil tipe privatenya melalui fungsi
        System.out.println("Getter : " + angka);

        // write only (kita hanya bisa menulis menggunakan SETTER)
        // kalo write kita gabisa tau hasilnya, biasanya diakali dengan membuat fungsi di class private untuk menampilkannya

        object.setDoublePrivate(0.05);
        object.display();

        // gimana kalo kita ingin write only dan read only menggunakan GETTER dan SETTER

        // gabungkan read dan write dengan setter dan getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println(object2.getJari());
        object2.setJari(14);
        System.out.println(object2.getJari());

        System.out.println("Luas : " + object2.getLuas());


    }
}