package models;

import java.util.Date;

public class BarangTemu extends Barang{
    // PROPERTY
    private String tanggalTemu;
    private String idPenemu;

    // CONSTRUCTOR
    public BarangTemu(String idBarang, String namaBarang, String jenisBarang, String warnaBarang, String lokasiBarang, String tanggalTemu, String idPenemu) {
        super(idBarang, namaBarang, jenisBarang, warnaBarang, lokasiBarang);
        this.tanggalTemu = tanggalTemu;
        this.idPenemu = idPenemu;
    }

    // GETTER
    public String getTanggalTemu() {
        return tanggalTemu;
    }

    public String getIdPenemu() {
        return idPenemu;
    }
    
    // SETTER
    public void setTanggalTemu(String tanggalTemu) {
        this.tanggalTemu = tanggalTemu;
    }

    public void setIdPenemu(String idPenemu) {
        this.idPenemu = idPenemu;
    }
    
}