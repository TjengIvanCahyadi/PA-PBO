package models;

import sisteminformasibaranghilang.Main;
import static sisteminformasibaranghilang.Main.input;
import static sisteminformasibaranghilang.Main.kumpulanBarang;
import static sisteminformasibaranghilang.Main.kumpulanCivitasAkademik;
import static sisteminformasibaranghilang.Main.kumpulanPengambilanBarang;
import static sisteminformasibaranghilang.Main.kumpulanPetugas;
import static sisteminformasibaranghilang.Main.kumpulanUser;

public class Admin extends User{
    // CONSTRUCTOR
    public Admin(String idPengguna, String namaPengguna, String emailPengguna, String nomorTeleponPengguna, String usernamePengguna, String passwordPengguna){
        super(idPengguna, namaPengguna, emailPengguna, nomorTeleponPengguna, usernamePengguna, passwordPengguna);
    }
    
    // YANG BISA DILAKUKAN ADMIN
    public void registerPetugas(String idPetugas, String namaPetugas, String emailPetugas, String nomorTeleponPetugas, String usernamePetugas, String passwordPetugas){
        kumpulanPetugas.add(new Petugas(idPetugas, namaPetugas, emailPetugas, nomorTeleponPetugas, usernamePetugas, passwordPetugas));
    }
    
    public void tampilPetugas() {
        System.out.println("DATA PETUGAS");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-50s%-50s%-15s%-20s%s\n", "No", "Nama", "Email", "Nomor Telepon", "Username", "Password");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanPetugas.size(); i++){
            System.out.printf("%-5s%-50s%-50s%-15s%-20s%s\n", String.valueOf(i + 1), kumpulanPetugas.get(i).getNamaPengguna(), kumpulanPetugas.get(i).getEmailPengguna(), kumpulanPetugas.get(i).getNomorTeleponPengguna(), kumpulanPetugas.get(i).getUsernamePengguna(), kumpulanPetugas.get(i).getPasswordPengguna());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void ubahPetugas(int diubah, int index) {
        String dataPetugas;
        switch(diubah){
            case 1:
                System.out.print("$ Masukkan nama petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).setNamaPengguna(dataPetugas);
                break;
            case 2:
                System.out.print("$ Masukkan email petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).setEmailPengguna(dataPetugas);
                break;
            case 3:
                System.out.print("$ Masukkan nomor telepon petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).setNomorTeleponPengguna(dataPetugas);
                break;
            case 4:
                while (true) {
                    System.out.print("$ Masukkan username petugas: ");
                    dataPetugas = input.nextLine();
                    if (Main.usernameNotExists(dataPetugas)) {
                        kumpulanPetugas.get(index).setUsernamePengguna(dataPetugas);
                        break;
                    } else {
                        System.out.println("Username telah digunakan!");
                    }
                }
                break;
            case 5:
                System.out.print("$ Masukkan password petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).setPasswordPengguna(dataPetugas);
                break;
        }
    }
    
    public void hapusPetugas(int index) {
        kumpulanPetugas.remove(index);
    }
    
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
    
    public void tampilPengambilanBarang() {
        System.out.println("DATA PENGAMBILAN BARANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-24s%-50s%s\n", "No", "Tanggal Pengambilan", "Nama Barang", "Nama Pengambil");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanPengambilanBarang.size(); i++){
            System.out.printf("%-5s%-24s%-50s%s\n", String.valueOf(i + 1), kumpulanPengambilanBarang.get(i).getTanggalPengambilanBarang(), Main.getNamaBarangDariIdBarang(kumpulanPengambilanBarang.get(i).getIdBarang()), Main.getNamaPengambilDariIdPengambil(kumpulanPengambilanBarang.get(i).getIdPengambil()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
}
