package models;

public class PengambilanBarang {
    // PROPERTY
    private String idPengambilanBarang;
    private String tanggalPengambilanBarang;
    private Barang barang;
    private CivitasAkademik pengambil;
    
    // CONSTRUCTOR
    public PengambilanBarang(String idPengambilanBarang, String tanggalPengambilanBarang, Barang barang, CivitasAkademik pengambil){
        this.idPengambilanBarang = idPengambilanBarang;
        this.tanggalPengambilanBarang = tanggalPengambilanBarang;
        this.barang = barang;
        this.pengambil = pengambil;
    }
    
    // GETTER
    public String getIdPengambilanBarang() {
        return idPengambilanBarang;
    }

    public String getTanggalPengambilanBarang() {
        return tanggalPengambilanBarang;
    }

    public Barang getBarang() {
        return barang;
    }

    public CivitasAkademik getPengambil() {
        return pengambil;
    }

    // SETTER
    public void setIdPengambilanBarang(String idPengambilanBarang) {
        this.idPengambilanBarang = idPengambilanBarang;
    }

    public void setTanggalPengambilanBarang(String tanggalPengambilanBarang) {
        this.tanggalPengambilanBarang = tanggalPengambilanBarang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public void setPengambil(CivitasAkademik pengambil) {
        this.pengambil = pengambil;
    }
    
    
}
