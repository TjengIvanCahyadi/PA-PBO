package models;

import sisteminformasibaranghilang.Main;
import static sisteminformasibaranghilang.Main.kumpulanAdmin;
import static sisteminformasibaranghilang.Main.kumpulanBarangHilang;
import static sisteminformasibaranghilang.Main.kumpulanBarangTemu;
import static sisteminformasibaranghilang.Main.kumpulanCivitasAkademik;
import static sisteminformasibaranghilang.Main.kumpulanPetugas;
import static sisteminformasibaranghilang.Main.tempAdmin;
import static sisteminformasibaranghilang.Main.tempCivak;
import static sisteminformasibaranghilang.Main.tempPetugas;

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
    
    // YANG BISA DILAKUKAN USER
    public static boolean login(String usernamePengguna, String passwordPengguna) {
        for (Admin admin : kumpulanAdmin) {
            if (admin.getUsernamePengguna().equals(usernamePengguna) && admin.getPasswordPengguna().equals(passwordPengguna)) {
                tempAdmin = admin;
                return true;
            }
        }
        for (Petugas petugas : kumpulanPetugas) {
            if (petugas.getUsernamePengguna().equals(usernamePengguna) && petugas.getPasswordPengguna().equals(passwordPengguna)) {
                tempPetugas = petugas;
                return true;
            }
        }
        for (CivitasAkademik civitasAkademik : kumpulanCivitasAkademik) {
            if (civitasAkademik.getUsernamePengguna().equals(usernamePengguna) && civitasAkademik.getPasswordPengguna().equals(passwordPengguna)) {
                tempCivak = civitasAkademik;
                return true;
            }
        }
        return false;
    }

    public void tampilBarangHilang() {
        System.out.println("DATA BARANG HILANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi Hilang", "Tanggal Hilang", "Pemilik");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarangHilang.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", String.valueOf(i + 1), kumpulanBarangHilang.get(i).getNamaBarang(), kumpulanBarangHilang.get(i).getJenisBarang(), kumpulanBarangHilang.get(i).getWarnaBarang(), kumpulanBarangHilang.get(i).getLokasiBarang(), kumpulanBarangHilang.get(i).getTanggalHilang(), Main.getNamaPemilikDariIdPemilik(kumpulanBarangHilang.get(i).getIdPemilik()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void tampilBarangTemu() {
        System.out.println("DATA BARANG TEMU");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi Temu", "Tanggal Temu", "Penemu");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarangTemu.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", String.valueOf(i + 1), kumpulanBarangTemu.get(i).getNamaBarang(), kumpulanBarangTemu.get(i).getJenisBarang(), kumpulanBarangTemu.get(i).getWarnaBarang(), kumpulanBarangTemu.get(i).getLokasiBarang(), kumpulanBarangTemu.get(i).getTanggalTemu(), Main.getNamaPenemuDariIdPenemu(kumpulanBarangTemu.get(i).getIdPenemu()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
}