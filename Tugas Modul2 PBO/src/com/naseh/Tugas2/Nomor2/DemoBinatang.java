package com.naseh.Tugas2.Nomor2;

public class DemoBinatang {
    public static void main(String[] args) {

        // Burung
        Burung burung = new Burung();
        burung.nama = "Burung Shoebill";
        burung.makan = "Ikan, dan Sejenins Reptil Kecil";
        burung.tidur = "Tidur Pada Saat Dia Ngantuk ataupun Malam Hari";
        burung.terbang = "Tidak Suka Terbang dan Tapi Suka Menyendiri";

        // Method Burung
        System.out.println("=============== Burung =================");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Hiu Megalodon";
        ikan.makan = "Semua Makhluk Yang Ada di Dalam Air";
        ikan.tidur = "Tidur saat Malam Hari";
        ikan.berenang = "Berenang Menggunakan Sirip";


        // Method IKAN
        System.out.println("=============== Ikan ===================");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Kucing
        Kucing kucing = new Kucing();
        kucing.nama  = "Kucing Persia";
        kucing.makan = "Makanan Whiskas ataupun Snak Kucing";
        kucing.tidur = "Pada Saat Ngantuk dan Malam Hari";
        kucing.meong = "Meong, Saat Lapar ataupun Bermain";

        // Method Kucing
        System.out.println("=============== Kucing =================");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();

        System.out.println();
    }
}
