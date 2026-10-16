package src.com.mahasiswa;
class Main {
    public static void main(String[] args) {
        Mahasiswa Gian = new Mahasiswa("Gian", "11S24004", "Informatika", 2024);
        nilai nilaiGian = new nilai(3);
        Gian.showMahasiswa();
        nilaiGian.prosesNilai();
        Gian.showMahasiswa();

    }
}
