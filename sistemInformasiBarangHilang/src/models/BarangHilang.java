package models;

public class BarangHilang extends Barang{
    // PROPERTY
    private String tanggalHilang;
    private String idPemilik;

    // CONSTRUCTOR
    public BarangHilang(String idBarang, String namaBarang, String jenisBarang, String warnaBarang, String lokasiBarang, String tanggalHilang, String idPemilik) {
        super(idBarang, namaBarang, jenisBarang, warnaBarang, lokasiBarang);
        this.tanggalHilang = tanggalHilang;
        this.idPemilik = idPemilik;
    }

    // GETTER
    public String getTanggalHilang() {
        return tanggalHilang;
    }

    public String getIdPemilik() {
        return idPemilik;
    }

    // SETTER
    public void setTanggalHilang(String tanggalHilang) {
        this.tanggalHilang = tanggalHilang;
    }

    public void setIdPemilik(String idPemilik) {
        this.idPemilik = idPemilik;
    }
    
}
