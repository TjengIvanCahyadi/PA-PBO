package models;

import java.util.Date;

public class BarangTemu extends Barang{
    // PROPERTY
    private String tanggalTemu;
    private String namaPenemu; // APAKAH INI LEBIH BAIK DIUBAH MENJADI ID PENEMU?

    // CONSTRUCTOR
    public BarangTemu(String idBarang, String namaBarang, String jenisBarang, String warnaBarang, String lokasiBarang, String tanggalTemu, String namaPenemu) {
        super(idBarang, namaBarang, jenisBarang, warnaBarang, lokasiBarang);
        this.tanggalTemu = tanggalTemu;
        this.namaPenemu = namaPenemu;
    }

    // GETTER
    public String getTanggalTemu() {
        return tanggalTemu;
    }

    public String getNamaPenemu() {
        return namaPenemu;
    }
    
    // SETTER
    public void setTanggalTemu(String tanggalTemu) {
        this.tanggalTemu = tanggalTemu;
    }

    public void setNamaPenemu(String namaPenemu) {
        this.namaPenemu = namaPenemu;
    }
    
}