package models;

import sisteminformasibaranghilangv2.Main;
import static sisteminformasibaranghilangv2.Main.input;
import static sisteminformasibaranghilangv2.Main.kumpulanBarang;
import static sisteminformasibaranghilangv2.Main.kumpulanCivitasAkademik;
import static sisteminformasibaranghilangv2.Main.kumpulanPengambilanBarang;
import static sisteminformasibaranghilangv2.Main.kumpulanPetugas;

public class Admin extends User implements HakPetugas{
    // CONSTRUCTOR
    public Admin(String idAdmin, String namaAdmin, String emailAdmin, String nomorTeleponAdmin, String usernameAdmin, String passwordAdmin){
        super(idAdmin, namaAdmin, emailAdmin, nomorTeleponAdmin, usernameAdmin, passwordAdmin);
    }
    
    // YANG BISA DILAKUKAN ADMIN
    public void tampilPetugas() {
        System.out.println("DATA PETUGAS");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-50s%-50s%-15s%-20s%s\n", "No", "Nama", "Email", "Nomor Telepon", "Username", "Password");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanPetugas.size(); i++){
            System.out.printf("%-5s%-50s%-50s%-15s%-20s%s\n", String.valueOf(i + 1), kumpulanPetugas.get(i).namaUser, kumpulanPetugas.get(i).emailUser, kumpulanPetugas.get(i).nomorTeleponUser, kumpulanPetugas.get(i).usernameUser, kumpulanPetugas.get(i).passwordUser);
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void tambahPetugas(String idPetugas, String namaPetugas, String emailPetugas, String nomorTeleponPetugas, String usernamePetugas, String passwordPetugas) {
        kumpulanPetugas.add(new Petugas(idPetugas, namaPetugas, emailPetugas, nomorTeleponPetugas, usernamePetugas, passwordPetugas));
    }
    
    public void ubahPetugas(int diubah, int index) {
        String dataPetugas;
        switch(diubah){
            case 1:
                System.out.print("$ Masukkan nama petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).namaUser = dataPetugas;
                break;
            case 2:
                System.out.print("$ Masukkan email petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).emailUser = dataPetugas;
                break;
            case 3:
                System.out.print("$ Masukkan nomor telepon petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).nomorTeleponUser = dataPetugas;
                break;
            case 4:
                while (true) {
                    System.out.print("$ Masukkan username petugas: ");
                    dataPetugas = input.nextLine();
                    if (Main.usernameNotExists(dataPetugas)) {
                        kumpulanPetugas.get(index).usernameUser = dataPetugas;
                        break;
                    } else {
                        System.out.println("\nUsername telah digunakan!\n");
                    }
                }
                break;
            case 5:
                System.out.print("$ Masukkan password petugas: ");
                dataPetugas = input.nextLine();
                kumpulanPetugas.get(index).passwordUser = dataPetugas;
                break;
        }
    }
    
    public void hapusPetugas(int index) {
        kumpulanPetugas.remove(index);
    }
    
    @Override
    public void tampilCivitasAkademik() {
        System.out.println("DATA CIVITAS AKADEMIK");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-50s%-50s%-15s%-20s%-20s%s\n", "No", "Nama", "Email", "Nomor Telepon", "Username", "Password", "Peran");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanCivitasAkademik.size(); i++){
            System.out.printf("%-5s%-50s%-50s%-15s%-20s%-20s%s\n", String.valueOf(i + 1), kumpulanCivitasAkademik.get(i).namaUser, kumpulanCivitasAkademik.get(i).emailUser, kumpulanCivitasAkademik.get(i).nomorTeleponUser, kumpulanCivitasAkademik.get(i).usernameUser, kumpulanCivitasAkademik.get(i).passwordUser, kumpulanCivitasAkademik.get(i).getPeranCivitasAkademik());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    @Override
    public void tampilBarang() {
        System.out.println("DATA BARANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%-20s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi", "Status", "Tanggal", "Orang Terkait");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarang.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%-20s%s\n", String.valueOf(i + 1), kumpulanBarang.get(i).getNamaBarang(), kumpulanBarang.get(i).getJenisBarang(), kumpulanBarang.get(i).getWarnaBarang(), kumpulanBarang.get(i).getLokasiBarang(), kumpulanBarang.get(i).getStatusBarang(), kumpulanBarang.get(i).getTanggalBarang(), Main.getNamaDariId("Semua", kumpulanBarang.get(i).getIdUser()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    @Override
    public void tampilPengambilanBarang() {
        System.out.println("DATA PENGAMBILAN BARANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-24s%-50s%s\n", "No", "Tanggal Pengambilan", "Status", "Nama Barang", "Nama Pengambil");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanPengambilanBarang.size(); i++){
            System.out.printf("%-5s%-24s%-50s%s\n", String.valueOf(i + 1), kumpulanPengambilanBarang.get(i).getTanggalPengambilanBarang(), Main.getNamaBarangDariIdBarang(kumpulanPengambilanBarang.get(i).getIdBarang()), Main.getNamaDariId("Pengambil", kumpulanPengambilanBarang.get(i).getIdPengambil()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
}
