package models;

public class Barang {
    // PROPERTY
    private final String idBarang;
    private String namaBarang;
    private String jenisBarang;
    private String warnaBarang;
    private String lokasiBarang;
    private String statusBarang; // Hilang, Ditemukan, Diklaim
    private String tanggalBarang;
    private String idUser;
    
    // CONSTRUCTOR
    public Barang(String idBarang, String namaBarang, String jenisBarang, String warnaBarang, String lokasiBarang, String statusBarang, String tanggalBarang, String idUser) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.warnaBarang = warnaBarang;
        this.lokasiBarang = lokasiBarang;
        this.statusBarang = statusBarang;
        this.tanggalBarang = tanggalBarang;
        this.idUser = idUser;
    }

    // GETTER
    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getWarnaBarang() {
        return warnaBarang;
    }

    public String getLokasiBarang() {
        return lokasiBarang;
    }

    public String getStatusBarang() {
        return statusBarang;
    }

    public String getTanggalBarang() {
        return tanggalBarang;
    }

    public String getIdUser() {
        return idUser;
    }

    // SETTER
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void setWarnaBarang(String warnaBarang) {
        this.warnaBarang = warnaBarang;
    }

    public void setLokasiBarang(String lokasiBarang) {
        this.lokasiBarang = lokasiBarang;
    }

    public void setStatusBarang(String statusBarang) {
        this.statusBarang = statusBarang;
    }

    public void setTanggalBarang(String tanggalBarang) {
        this.tanggalBarang = tanggalBarang;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
}
