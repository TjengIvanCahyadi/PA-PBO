package models;

import java.util.ArrayList;
import sisteminformasibaranghilangv2.Main;
import static sisteminformasibaranghilangv2.Main.input;
import static sisteminformasibaranghilangv2.Main.kumpulanBarang;
import static sisteminformasibaranghilangv2.Main.kumpulanCivitasAkademik;
import static sisteminformasibaranghilangv2.Main.kumpulanPengambilanBarang;

public class Petugas extends User implements HakPetugas{
    // CONSTRUCTOR
    public Petugas(String idPetugas, String namaPetugas, String emailPetugas, String nomorTeleponPetugas, String usernamePetugas, String passwordPetugas){
        super(idPetugas, namaPetugas, emailPetugas, nomorTeleponPetugas, usernamePetugas, passwordPetugas);
    }
    
    // YANG BISA DILAKUKAN PETUGAS
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
    
    public void hapusCivitasAkademik(int index){
        kumpulanCivitasAkademik.remove(index);
    }
    
    @Override
    public void tampilBarang() {
        System.out.println("DATA BARANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%-20s%s\n", "No", "Nama", "Jenis", "Warna", "Lokasi", "Status", "Tanggal", "Orang Terkait");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanBarang.size(); i++){
            System.out.printf("%-5s%-20s%-20s%-20s%-30s%-20s%-20s%s\n", String.valueOf(i + 1), kumpulanBarang.get(i).getNamaBarang(), kumpulanBarang.get(i).getJenisBarang(), kumpulanBarang.get(i).getWarnaBarang(), kumpulanBarang.get(i).getLokasiBarang(), kumpulanBarang.get(i).getStatusBarang(), kumpulanBarang.get(i).getTanggalBarang(), Main.getNamaDariId("Semua", kumpulanBarang.get(i).getIdUser()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void hapusBarang(int index) {
        kumpulanBarang.remove(index);
    }
    
    public void tambahBarangTemu(String idBarangTemu, String namaBarangTemu, String jenisBarangTemu, String warnaBarangTemu, String lokasiBarangTemu, String tanggalBarangTemu, String idPenemu) {
        kumpulanBarang.add(new Barang(idBarangTemu, namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu, "Ditemukan", tanggalBarangTemu, idPenemu));
    }
    
    public void ubahBarangTemu(int diubah, String idBarang) {
        for (Barang barang : kumpulanBarang) {
            if (barang.getIdBarang().equals(idBarang)) {
                String dataBarangTemu;
                switch(diubah){
                    case 1:
                        System.out.print("$ Masukkan nama barang temu: ");
                        dataBarangTemu = input.nextLine();
                        barang.setNamaBarang(dataBarangTemu);
                        break;
                    case 2:
                        System.out.print("$ Masukkan jenis barang temu: ");
                        dataBarangTemu = input.nextLine();
                        barang.setJenisBarang(dataBarangTemu);
                        break;
                    case 3:
                        System.out.print("$ Masukkan warna barang temu: ");
                        dataBarangTemu = input.nextLine();
                        barang.setWarnaBarang(dataBarangTemu);
                        break;
                    case 4:
                        System.out.print("$ Masukkan lokasi temu barang: ");
                        dataBarangTemu = input.nextLine();
                        barang.setLokasiBarang(dataBarangTemu);
                        break;
                    case 5:
                        System.out.print("$ Masukkan tanggal temu barang: ");
                        dataBarangTemu = input.nextLine();
                        barang.setTanggalBarang(dataBarangTemu);
                        break;
                }
                break;
            }
        }
    }
    
    @Override
    public void tampilPengambilanBarang() {
        System.out.println("DATA PENGAMBILAN BARANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-24s%-50s%-50s%s\n", "No", "Tanggal Pengambilan", "Status Pengambilan", "Nama Barang", "Nama Pengambil");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanPengambilanBarang.size(); i++){
            System.out.printf("%-5s%-24s%-50s%-50s%s\n", String.valueOf(i + 1), kumpulanPengambilanBarang.get(i).getTanggalPengambilanBarang(), kumpulanPengambilanBarang.get(i).getStatusPengambilanBarang(), Main.getNamaBarangDariIdBarang(kumpulanPengambilanBarang.get(i).getIdBarang()), Main.getNamaDariId("Pengambil", kumpulanPengambilanBarang.get(i).getIdPengambil()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void tampilPengambilanBarang(ArrayList<PengambilanBarang> tempKumpulanPengambilanBarang) {
        System.out.println("DATA PENGAMBILAN BARANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-24s%-50s%-50s%s\n", "No", "Tanggal Pengambilan", "Status Pengambilan", "Nama Barang", "Nama Pengambil");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < tempKumpulanPengambilanBarang.size(); i++){
            System.out.printf("%-5s%-24s%-50s%-50s%s\n", String.valueOf(i + 1), tempKumpulanPengambilanBarang.get(i).getTanggalPengambilanBarang(), tempKumpulanPengambilanBarang.get(i).getStatusPengambilanBarang(), Main.getNamaBarangDariIdBarang(tempKumpulanPengambilanBarang.get(i).getIdBarang()), Main.getNamaDariId("Pengambil", tempKumpulanPengambilanBarang.get(i).getIdPengambil()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void tambahPengambilanBarang(String idPengambilanBarang, String tanggalPengambilanBarang, String idBarang, String idPengambil) {
        kumpulanPengambilanBarang.add(new PengambilanBarang(idPengambilanBarang, tanggalPengambilanBarang,"Claimed", idBarang, idPengambil));
    }
    
    public void ubahPengambilanBarang(int diubah, int index) {
        String dataPengambilanBarang;
        switch(diubah){
            case 1:
                System.out.print("$ Masukkan tanggal pengambilan barang(dd-MM-yyyy): ");
                dataPengambilanBarang = input.nextLine();
                kumpulanPengambilanBarang.get(index).setTanggalPengambilanBarang(dataPengambilanBarang);
                break;
            case 2:
                System.out.print("$ Masukkan status pengambilan barang: ");
                dataPengambilanBarang = input.nextLine();
                kumpulanPengambilanBarang.get(index).setStatusPengambilanBarang(dataPengambilanBarang);
                break;
            case 3:
                System.out.print("$ Masukkan id barang: ");
                dataPengambilanBarang = input.nextLine();
                kumpulanPengambilanBarang.get(index).setIdBarang(dataPengambilanBarang);
                break;
            case 4:
                System.out.print("$ Masukkan id pengambil: ");
                dataPengambilanBarang = input.nextLine();
                kumpulanPengambilanBarang.get(index).setIdPengambil(dataPengambilanBarang);
                break;
        }
    }
    
    public void hapusPengambilanBarang(int index) {
        kumpulanPengambilanBarang.remove(index);
    }    
    
//    public void tampilRequestPengambilanBarang() {
//        System.out.println("DATA PENGAMBILAN BARANG");
//        System.out.println("");
//        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        System.out.printf("%-5s%-24s%-50s%s\n", "No", "Tanggal Pengambilan", "Nama Barang", "Nama Pengambil");
//        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        for (int i = 0; i < kumpulanRequestPengambilanBarang.size(); i++){
//            System.out.printf("%-5s%-24s%-50s%s\n", String.valueOf(i + 1), kumpulanRequestPengambilanBarang.get(i).getTanggalPengambilanBarang(), Main.getNamaBarangDariIdBarang(kumpulanRequestPengambilanBarang.get(i).getIdBarang()), Main.getNamaPengambilDariIdPengambil(kumpulanRequestPengambilanBarang.get(i).getIdPengambil()));
//        }
//        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
//    }
//    
//    public void terimaRequestPengambilanBarang() {
//        System.out.println("Method Verifikasi Pengambilan Barang");
//    }
//    
//    public void tolakRequestPengambilanBarang() {
//        System.out.println("Method Verifikasi Pengambilan Barang");
//    }
}
