package com.naseh.Tugas2.Nomor3;

public class Pacar extends Mahasiswa{
    //variabel namaPacar, dan lamaHubungan
    public String namaPacar = "Tidak Ada, Adanya Mantan";
    public int lamaHubungan = 0;

    //Method getStatus
    public void getStatus(){
        System.out.println("Nama Pacar\t\t: "+namaPacar);
        System.out.println("Lama Hubungan\t: "+lamaHubungan);
    }
}
