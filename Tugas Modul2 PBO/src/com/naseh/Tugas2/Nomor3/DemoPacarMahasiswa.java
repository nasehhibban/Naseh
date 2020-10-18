package com.naseh.Tugas2.Nomor3;

public class DemoPacarMahasiswa {
    public static void main(String[] args) {
        //objek class mahasiswa dan pacar
        Mahasiswa mahasiswa = new Mahasiswa();
        Pacar pacar = new Pacar();

        //method memanggil mahasiswa pacar\
        mahasiswa.getStatus();
        pacar.getStatus();
    }
}
