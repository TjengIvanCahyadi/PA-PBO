package models;

import java.util.ArrayList;
import sisteminformasibaranghilangv2.Main;
import static sisteminformasibaranghilangv2.Main.kumpulanAdmin;
import static sisteminformasibaranghilangv2.Main.kumpulanCivitasAkademik;
import static sisteminformasibaranghilangv2.Main.kumpulanPetugas;

public abstract class User {
    // PROPERTY
    protected final String idUser;
    protected String namaUser;
    protected String emailUser;
    protected String nomorTeleponUser;
    protected String usernameUser;
    protected String passwordUser;
    
    // CONSTRUCTOR
    protected User(String idUser, String namaUser, String emailUser, String nomorTeleponUser, String usernameUser, String passwordUser) {
        this.idUser = idUser;
        this.namaUser = namaUser;
        this.emailUser = emailUser;
        this.nomorTeleponUser = nomorTeleponUser;
        this.usernameUser = usernameUser;
        this.passwordUser = passwordUser;
    }

    // GETTER    
    public String getIdUser() {
        return idUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getNomorTeleponUser() {
        return nomorTeleponUser;
    }

    public String getUsernameUser() {
        return usernameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    // SETTER
    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setNomorTeleponUser(String nomorTeleponUser) {
        this.nomorTeleponUser = nomorTeleponUser;
    }

    public void setUsernameUser(String usernameUser) {
        this.usernameUser = usernameUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    
    // YANG BISA DILAKUKAN USER
    public static boolean login(String usernameUser, String passwordUser) {
        for (Admin admin : kumpulanAdmin) {
            if (admin.getUsernameUser().equals(usernameUser) && admin.getPasswordUser().equals(passwordUser)) {
                Main.tempAdmin = admin;
                return true;
            }
        }
        for (Petugas petugas : kumpulanPetugas) {
            if (petugas.getUsernameUser().equals(usernameUser) && petugas.getPasswordUser().equals(passwordUser)) {
                Main.tempPetugas = petugas;
                return true;
            }
        }
        for (CivitasAkademik civitasAkademik : kumpulanCivitasAkademik) {
            if (civitasAkademik.getUsernameUser().equals(usernameUser) && civitasAkademik.getPasswordUser().equals(passwordUser)) {
                Main.tempCivak = civitasAkademik;
                return true;
            }
        }
        return false;
    }

    public void tampilBarangHilang(ArrayList<Barang> kumpulanBarangHilang) {
        System.out.println("DATA BARANG HILANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi Hilang", "Tanggal Hilang", "Pemilik");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarangHilang.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", String.valueOf(i + 1), kumpulanBarangHilang.get(i).getNamaBarang(), kumpulanBarangHilang.get(i).getJenisBarang(), kumpulanBarangHilang.get(i).getWarnaBarang(), kumpulanBarangHilang.get(i).getLokasiBarang(), kumpulanBarangHilang.get(i).getTanggalBarang(), Main.getNamaDariId("Pemilik", kumpulanBarangHilang.get(i).getIdUser()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void tampilBarangTemu(ArrayList<Barang> kumpulanBarangTemu) {
        System.out.println("DATA BARANG TEMU");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi Temu", "Tanggal Temu", "Penemu");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarangTemu.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%s\n", String.valueOf(i + 1), kumpulanBarangTemu.get(i).getNamaBarang(), kumpulanBarangTemu.get(i).getJenisBarang(), kumpulanBarangTemu.get(i).getWarnaBarang(), kumpulanBarangTemu.get(i).getLokasiBarang(), kumpulanBarangTemu.get(i).getTanggalBarang(), Main.getNamaDariId("Penemu", kumpulanBarangTemu.get(i).getIdUser()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
}