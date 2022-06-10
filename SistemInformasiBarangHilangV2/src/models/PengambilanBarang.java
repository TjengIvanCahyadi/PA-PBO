package models;

public class PengambilanBarang {
    // PROPERTY
    private final String idPengambilanBarang;
    private String tanggalPengambilanBarang;
    private String statusPengambilanBarang; // Pending, Processing, Diklaim atau Ditolak
    private String idBarang;
    private String idPengambil;
    
    // CONSTRUCTOR
    public PengambilanBarang(String idPengambilanBarang, String tanggalPengambilanBarang, String statusPengambilanBarang, String idBarang, String idPengambil){
        this.idPengambilanBarang = idPengambilanBarang;
        this.tanggalPengambilanBarang = tanggalPengambilanBarang;
        this.statusPengambilanBarang = statusPengambilanBarang;
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

    public String getStatusPengambilanBarang() {
        return statusPengambilanBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getIdPengambil() {
        return idPengambil;
    }

    // SETTER
    public void setTanggalPengambilanBarang(String tanggalPengambilanBarang) {
        this.tanggalPengambilanBarang = tanggalPengambilanBarang;
    }

    public void setStatusPengambilanBarang(String statusPengambilanBarang) {
        this.statusPengambilanBarang = statusPengambilanBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public void setIdPengambil(String idPengambil) {
        this.idPengambil = idPengambil;
    }
}
