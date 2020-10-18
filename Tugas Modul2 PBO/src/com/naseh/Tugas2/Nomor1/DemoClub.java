package com.naseh.Tugas2.Nomor1;

public class DemoClub {
    public static void main(String[] args) {

        // Objek Sebuah Club
        Club club1 = new Club();
        Club club2 = new Club("Party Alone");
        Club club3 = new Club("Party Alone", " Party Alone is a football club that comes from the outside world, but is very strong in every match");
        Club club4 = new Club("Party Alone", 2007, "Gelora LSCS");
        Club club5 = new Club("Party Alone", 2007, "Gelora LSCS", 0, "Party Alone is a football club that comes from the outside world, but is very strong in every match");

        // untuk memanggil method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
