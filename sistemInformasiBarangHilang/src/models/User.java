package models;

import static sisteminformasibaranghilang.Main.kumpulanBarangHilang;
import static sisteminformasibaranghilang.Main.kumpulanBarangTemu;
import static sisteminformasibaranghilang.Main.kumpulanCivitasAkademik;

public class User {
    // PROPERTY
    private final String idPengguna;
    private String namaPengguna;
    private String emailPengguna;
    private String nomorTeleponPengguna;
    private String usernamePengguna;
    private String passwordPengguna;
    
    // CONSTRUCTOR
    protected User(String idPengguna, String namaPengguna, String emailPengguna, String nomorTeleponPengguna, String usernamePengguna, String passwordPengguna) {
        this.idPengguna = idPengguna;
        this.namaPengguna = namaPengguna;
        this.emailPengguna = emailPengguna;
        this.nomorTeleponPengguna = nomorTeleponPengguna;
        this.usernamePengguna = usernamePengguna;
        this.passwordPengguna = passwordPengguna;
    }

    // GETTER    
    public String getIdPengguna() {
        return idPengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public String getEmailPengguna() {
        return emailPengguna;
    }

    public String getNomorTeleponPengguna() {
        return nomorTeleponPengguna;
    }

    public String getUsernamePengguna() {
        return usernamePengguna;
    }

    public String getPasswordPengguna() {
        return passwordPengguna;
    }

    // SETTER
    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public void setEmailPengguna(String emailPengguna) {
        this.emailPengguna = emailPengguna;
    }

    public void setNomorTeleponPengguna(String nomorTeleponPengguna) {
        this.nomorTeleponPengguna = nomorTeleponPengguna;
    }

    public void setUsernamePengguna(String usernamePengguna) {
        this.usernamePengguna = usernamePengguna;
    }

    public void setPasswordPengguna(String passwordPengguna) {
        this.passwordPengguna = passwordPengguna;
    }
    
    // UNTUK VERIFIKASI LOGIN USER
    public boolean loginVerification(String usernamePengguna, String passwordPengguna){
        return this.usernamePengguna.equals(usernamePengguna) && this.passwordPengguna.equals(passwordPengguna);
    }
    
    // YANG BISA DILAKUKAN USER
    public void tampilCivitasAkademik() {
        System.out.println("DATA CIVITAS AKADEMIK");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-50s%-50s%-15s%-20s%-20s%s\n", "No", "Nama", "Email", "Nomor Telepon", "Username", "Password", "Peran");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanCivitasAkademik.size(); i++){
            System.out.printf("%-5s%-50s%-50s%-15s%-20s%-20s%s\n", String.valueOf(i + 1), kumpulanCivitasAkademik.get(i).getNamaPengguna(), kumpulanCivitasAkademik.get(i).getEmailPengguna(), kumpulanCivitasAkademik.get(i).getNomorTeleponPengguna(), kumpulanCivitasAkademik.get(i).getUsernamePengguna(), kumpulanCivitasAkademik.get(i).getPasswordPengguna(), kumpulanCivitasAkademik.get(i).getPeranCivitasAkademik());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void tampilBarangHilang() {
        System.out.println("DATA BARANG HILANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi Hilang", "Tanggal Hilang");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarangHilang.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%s\n", String.valueOf(i + 1), kumpulanBarangHilang.get(i).getNamaBarang(), kumpulanBarangHilang.get(i).getJenisBarang(), kumpulanBarangHilang.get(i).getWarnaBarang(), kumpulanBarangHilang.get(i).getLokasiBarang(), kumpulanBarangHilang.get(i).getTanggalHilang());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    
    public void tampilBarangTemu() {
        System.out.println("DATA BARANG TEMU");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi Temu", "Tanggal Temu");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarangTemu.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%s\n", String.valueOf(i + 1), kumpulanBarangTemu.get(i).getNamaBarang(), kumpulanBarangTemu.get(i).getJenisBarang(), kumpulanBarangTemu.get(i).getWarnaBarang(), kumpulanBarangTemu.get(i).getLokasiBarang(), kumpulanBarangTemu.get(i).getTanggalTemu());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
