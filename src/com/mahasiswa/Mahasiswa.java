package src.com.mahasiswa;

import java.util.Scanner;

class Mahasiswa {
    nilai nilai; 
    private String nama; 
    private String nim;
    private String prodi;
    private int angkatan;

    public Mahasiswa (String nama, String nim, String prodi, int angkatan){
        this.nama = nama; 
        this.nim = nim; 
        this.prodi = prodi; 
        this.angkatan = angkatan; 
    }

    
    
    //getter 
    public String getnamaMahasiswa(){return nama;}
    public String getnimMahasiswa(){return nim;}
    public String getprodiMahasiswa(){return prodi;}
    public int getangkatanMahasiswa(){return angkatan;}

    void showMahasiswa(){
        System.out.println("Nama     : " + this.nama);
        System.out.println("Nim      : " + this.nim);
        System.out.println("Prodi    : " + this.prodi);
        System.out.println("Angkatan : " + this.angkatan);
        System.out.println("Nilai    : " + this.nilai);
    }




}