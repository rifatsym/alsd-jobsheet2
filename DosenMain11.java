public class DosenMain11 {
    public static void main(String[] args) {

        Dosen11 dosen1 = new Dosen11();
        dosen1.idDosen = "D001";
        dosen1.nama = "Muhammad Ali Farhan";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2019;
        dosen1.bidangKeahlian = "Pemrograman";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2021);
        dosen1.ubahKeahlian("Pemrograman Web");
        dosen1.tampilkanInformasi();

        Dosen11 dosen2 = new Dosen11("D002", "Annisa Nabila", true, 2018, "Pemrograman");
        dosen2.tampilkanInformasi();
    }
}
