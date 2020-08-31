package com.tutorial;

// multi file, class nya akan terpisah dengan class utama filenya

class Player{
    private String name;

    Player(String name){
        this.name = name;
    }

    void setName(String inputName){
        this.name = inputName;
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }
}



public class Main {
    public static void main(String[] args) throws Exception{
        Player player1 = new Player("Ibrahimovic");
        Player player2 = new Player("Henry");

        player1.show();
        player2.show();

        
    }
}