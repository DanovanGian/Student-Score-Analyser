import java.util.Scanner;

class Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("jumlah komponen : ");
        n = input.nextInt();
        input.nextLine();

        String[] komponen = new String[n];
        double[] nilai = new double[n];
        double[] bobot = new double[n];
        double[] tampung = new double[n];
        double hasil = 0;

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