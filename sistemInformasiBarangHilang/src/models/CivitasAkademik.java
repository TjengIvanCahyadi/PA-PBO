package models;

import sisteminformasibaranghilang.Main;
import static sisteminformasibaranghilang.Main.input;
import static sisteminformasibaranghilang.Main.kumpulanBarangHilang;
import static sisteminformasibaranghilang.Main.kumpulanRequestPengambilanBarang;

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
    public void tampilProfileCivitasAkademik(){
        System.out.println("Nama            : " + this.getNamaPengguna());
        System.out.println("Email           : " + this.getEmailPengguna());
        System.out.println("Nomor Telepon   : " + this.getNomorTeleponPengguna());
        System.out.println("Username        : " + this.getUsernamePengguna());
        System.out.println("Password        : " + this.getPasswordPengguna());
        System.out.println("Peran           : " + peranCivitasAkademik);
    }
    
    public void ubahCivitasAkademik(int diubah) {
        String dataCivitasAkademik;
        switch(diubah){
            case 1:
                while (true) {
                    System.out.print("$ Masukkan nama civitas akademik: ");
                    dataCivitasAkademik = input.nextLine();
                    if (Main.usernameNotExists(dataCivitasAkademik)) {
                        this.setNamaPengguna(dataCivitasAkademik);
                        break;
                    } else {
                        System.out.println("Username telah digunakan!");
                    }
                }
                break;
            case 2:
                System.out.print("$ Masukkan email civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                this.setEmailPengguna(dataCivitasAkademik);
                break;
            case 3:
                System.out.print("$ Masukkan nomor telepon civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                this.setNomorTeleponPengguna(dataCivitasAkademik);
                break;
            case 4:
                System.out.print("$ Masukkan username civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                this.setUsernamePengguna(dataCivitasAkademik);
                break;
            case 5:
                System.out.print("$ Masukkan password civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                this.setPasswordPengguna(dataCivitasAkademik);
                break;
            case 6:
                System.out.print("$ Masukkan peran civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                this.setPeranCivitasAkademik(dataCivitasAkademik);
                break;
        }
    }
    
    // TAMBAH BARANG DENGAN LOKASI
    public void tambahBarangHilang(String idBarangHilang, String namaBarangHilang, String jenisBarangHilang, String warnaBarangHilang, String lokasiBarangHilang, String tanggalBarangHilang, String namaPemilik) {
        kumpulanBarangHilang.add(new BarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang, namaPemilik));
    }
    
    // TAMBAH BARANG TANPA LOKASI
    public void tambahBarangHilang(String idBarangHilang, String namaBarangHilang, String jenisBarangHilang, String warnaBarangHilang, String tanggalBarangHilang, String namaPemilik) {
        kumpulanBarangHilang.add(new BarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, "", tanggalBarangHilang, namaPemilik));
    }
    
    public void ubahBarangHilang(int diubah, int index) {
        String dataBarangHilang;
        switch(diubah){
            case 1:
                System.out.print("$ Masukkan nama barang hilang: ");
                dataBarangHilang = input.nextLine();
                kumpulanBarangHilang.get(index).setNamaBarang(dataBarangHilang);
                break;
            case 2:
                System.out.print("$ Masukkan jenis barang hilang: ");
                dataBarangHilang = input.nextLine();
                kumpulanBarangHilang.get(index).setJenisBarang(dataBarangHilang);
                break;
            case 3:
                System.out.print("$ Masukkan warna barang hilang: ");
                dataBarangHilang = input.nextLine();
                kumpulanBarangHilang.get(index).setWarnaBarang(dataBarangHilang);
                break;
            case 4:
                System.out.print("$ Masukkan lokasi hilang barang: ");
                dataBarangHilang = input.nextLine();
                kumpulanBarangHilang.get(index).setLokasiBarang(dataBarangHilang);
                break;
            case 5:
                System.out.print("$ Masukkan tanggal hilang barang: ");
                dataBarangHilang = input.nextLine();
                kumpulanBarangHilang.get(index).setTanggalHilang(dataBarangHilang);
                break;
        }
    }

    public void requestAmbilBarang(String idPengambilanBarang, String tanggalPengambilanBarang, String idBarang, String idPengambil) {
        kumpulanRequestPengambilanBarang.add(new PengambilanBarang(idPengambilanBarang, tanggalPengambilanBarang, idBarang, idPengambil));
    }
}
