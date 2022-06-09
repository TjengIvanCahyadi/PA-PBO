package models;

public class PengambilanBarang {
    // PROPERTY
    private String idPengambilanBarang;
    private String tanggalPengambilanBarang;
    private String idBarang;
    private String idPengambil;
    
    // CONSTRUCTOR
    public PengambilanBarang(String idPengambilanBarang, String tanggalPengambilanBarang, String idBarang, String idPengambil){
        this.idPengambilanBarang = idPengambilanBarang;
        this.tanggalPengambilanBarang = tanggalPengambilanBarang;
        this.idBarang = idBarang;
        this.idPengambil = idPengambil;
    }
    
    // GETTER
    public String getIdPengambilanBarang() {
        return idPengambilanBarang;
    }

    public String getTanggalPengambilanBarang() {
        return tanggalPengambilanBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getIdPengambil() {
        return idPengambil;
    }

    // SETTER
    public void setIdPengambilanBarang(String idPengambilanBarang) {
        this.idPengambilanBarang = idPengambilanBarang;
    }

    public void setTanggalPengambilanBarang(String tanggalPengambilanBarang) {
        this.tanggalPengambilanBarang = tanggalPengambilanBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public void setIdPengambil(String idPengambil) {
        this.idPengambil = idPengambil;
    }
}
