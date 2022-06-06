package models;

public class BarangHilang extends Barang{
    // PROPERTY
    private String tanggalHilang;
    private String namaPemilik; // APAKAH INI LEBIH BAIK DIUBAH MENJADI ID PEMILIK?

    // CONSTRUCTOR
    public BarangHilang(String idBarang, String namaBarang, String jenisBarang, String warnaBarang, String lokasiBarang, String tanggalHilang, String namaPemilik) {
        super(idBarang, namaBarang, jenisBarang, warnaBarang, lokasiBarang);
        this.tanggalHilang = tanggalHilang;
        this.namaPemilik = namaPemilik;
    }

    // GETTER
    public String getTanggalHilang() {
        return tanggalHilang;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    // SETTER
    public void setTanggalHilang(String tanggalHilang) {
        this.tanggalHilang = tanggalHilang;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }
    
}
