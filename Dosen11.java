public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }

    public Dosen11() {

    }

    public Dosen11(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
