package models;

public class Barang {
    // PROPERTY
    private String idBarang;
    private String namaBarang;
    private String jenisBarang;
    private String warnaBarang;
    private String lokasiBarang;
    
    // CONSTRUCTOR
    public Barang(String idBarang, String namaBarang, String jenisBarang, String warnaBarang, String lokasiBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.warnaBarang = warnaBarang;
        this.lokasiBarang = lokasiBarang;
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

    // SETTER
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

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
    
    
}
