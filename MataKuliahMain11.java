public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 matkul1 = new MataKuliah11();
        matkul1.kodeMK = "IF1234";
        matkul1.namaMK = "Pemrograman Berorientasi Objek";
        matkul1.sks = 3;
        matkul1.jumlahJam = 4;
        
        matkul1.tampilInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(2);
        matkul1.tampilInformasi();

        MataKuliah11 matkul2 = new MataKuliah11("IF2345","Struktur Data",4,3);
        matkul2.kurangiJam(2);
        matkul2.tampilInformasi();
        
    }
}
