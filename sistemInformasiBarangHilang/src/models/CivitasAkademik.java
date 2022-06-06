package models;

public class CivitasAkademik extends User{
    // PROPERTY
    private String peranCivitasAkademik;
    
    // CONSTRUCTOR
    public CivitasAkademik(String idPengguna, String namaPengguna, String emailPengguna, String nomorTeleponPengguna, String usernamePengguna, String passwordPengguna, String peranCivitasAkademik){
        super(idPengguna, namaPengguna, emailPengguna, nomorTeleponPengguna, usernamePengguna, passwordPengguna);
        this.peranCivitasAkademik = peranCivitasAkademik;
    }

    // GETTER
    public String getPeranCivitasAkademik() {
        return peranCivitasAkademik;
    }

    // SETTER
    public void setPeranCivitasAkademik(String peranCivitasAkademik) {
        this.peranCivitasAkademik = peranCivitasAkademik;
    }

    // YANG BISA DILAKUKAN CIVITAS AKADEMIK
    
    public void ubahCivitasAkademik() {
        System.out.println("Method Ubah Civitas Akademik");
    }
    
    public void requestAmbilBarang() {
        System.out.println("Method Request Ambil Barang");
    }
}
