package src.com.mahasiswa;

import java.util.Scanner;

public class nilai {
    Scanner input = new Scanner(System.in);

    private int n;
    private String[] komponen;
    private double[] nilai;
    private double[] bobot;
    private double[] tampung;
    private double hasil = 0;

    public nilai(int n){
        this.n = n;
        this.komponen = new String[n];
        this.nilai = new double[n];
        this.bobot = new double[n];
        this.tampung = new double[n];
        this.hasil = hasil;
    }

    //getter
    public double getHasil(){return hasil;}

    void prosesNilai(){
        for (int a = 0; a < n; a++) {

            System.out.print("nama komponen : ");
            komponen[a] = input.nextLine();

            System.out.print("nilai : ");
            nilai[a] = input.nextDouble();

            System.out.print("bobot : ");
            bobot[a] = input.nextDouble();

            input.nextLine();
            System.out.println("\n");
        }

        for (int b = 0; b < n; b++) {
            tampung[b] = nilai[b] * (bobot[b] / 100);

        }

        for (int c = 0; c < n; c++) {
            hasil += tampung[c];

        }

        System.out.println("Nilai Akhir = " + hasil);

        input.close();

    }
}
