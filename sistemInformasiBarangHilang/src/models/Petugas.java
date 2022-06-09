package models;

import sisteminformasibaranghilang.Main;
import static sisteminformasibaranghilang.Main.input;
import static sisteminformasibaranghilang.Main.kumpulanBarangHilang;
import static sisteminformasibaranghilang.Main.kumpulanBarangTemu;
import static sisteminformasibaranghilang.Main.kumpulanCivitasAkademik;
import static sisteminformasibaranghilang.Main.kumpulanPengambilanBarang;
import static sisteminformasibaranghilang.Main.kumpulanRequestPengambilanBarang;

public class Petugas extends User{
    // CONSTRUCTOR
    public Petugas(String idPengguna, String namaPengguna, String emailPengguna, String nomorTeleponPengguna, String usernamePengguna, String passwordPengguna){
        super(idPengguna, namaPengguna, emailPengguna, nomorTeleponPengguna, usernamePengguna, passwordPengguna);
    }
    
    // YANG BISA DILAKUKAN PETUGAS
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
    
    
    public void hapusCivitasAkademik(int index){
        kumpulanCivitasAkademik.remove(index);
    }
    
    public void hapusBarangHilang(int index) {
        kumpulanBarangHilang.remove(index);
    }
    
    public void tambahBarangTemu(String idBarangTemu, String namaBarangTemu, String jenisBarangTemu, String warnaBarangTemu, String lokasiBarangTemu, String tanggalBarangTemu, String namaPenemu) {
        kumpulanBarangTemu.add(new BarangTemu(idBarangTemu, namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu, tanggalBarangTemu, namaPenemu));
    }
    
    public void ubahBarangTemu(int diubah, int index) {
        String dataBarangTemu;
        switch(diubah){
            case 1:
                System.out.print("$ Masukkan nama barang temu: ");
                dataBarangTemu = input.nextLine();
                kumpulanBarangTemu.get(index).setNamaBarang(dataBarangTemu);
                break;
            case 2:
                System.out.print("$ Masukkan jenis barang temu: ");
                dataBarangTemu = input.nextLine();
                kumpulanBarangTemu.get(index).setJenisBarang(dataBarangTemu);
                break;
            case 3:
                System.out.print("$ Masukkan warna barang temu: ");
                dataBarangTemu = input.nextLine();
                kumpulanBarangTemu.get(index).setWarnaBarang(dataBarangTemu);
                break;
            case 4:
                System.out.print("$ Masukkan lokasi temu barang: ");
                dataBarangTemu = input.nextLine();
                kumpulanBarangTemu.get(index).setLokasiBarang(dataBarangTemu);
                break;
            case 5:
                System.out.print("$ Masukkan tanggal temu barang: ");
                dataBarangTemu = input.nextLine();
                kumpulanBarangTemu.get(index).setTanggalTemu(dataBarangTemu);
                break;
        }
    }
    
    public void hapusBarangTemu(int index) {
        kumpulanBarangTemu.remove(index);
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
    
    public void tambahPengambilanBarang(String idPengambilanBarang, String tanggalPengambilanBarang, String idBarang, String idPengambil) {
        kumpulanPengambilanBarang.add(new PengambilanBarang(idPengambilanBarang, tanggalPengambilanBarang, idBarang, idPengambil));
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
                System.out.print("$ Masukkan id barang: ");
                dataPengambilanBarang = input.nextLine();
                kumpulanPengambilanBarang.get(index).setIdBarang(dataPengambilanBarang);
                break;
            case 3:
                System.out.print("$ Masukkan id pengambil: ");
                dataPengambilanBarang = input.nextLine();
                kumpulanPengambilanBarang.get(index).setIdPengambil(dataPengambilanBarang);
                break;
        }
    }
    
    public void hapusPengambilanBarang(int index) {
        kumpulanPengambilanBarang.remove(index);
    }    
    
    public void tampilRequestPengambilanBarang() {
        System.out.println("DATA PENGAMBILAN BARANG");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.printf("%-5s%-24s%-50s%s\n", "No", "Tanggal Pengambilan", "Nama Barang", "Nama Pengambil");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanRequestPengambilanBarang.size(); i++){
            System.out.printf("%-5s%-24s%-50s%s\n", String.valueOf(i + 1), kumpulanRequestPengambilanBarang.get(i).getTanggalPengambilanBarang(), Main.getNamaBarangDariIdBarang(kumpulanRequestPengambilanBarang.get(i).getIdBarang()), Main.getNamaPengambilDariIdPengambil(kumpulanRequestPengambilanBarang.get(i).getIdPengambil()));
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
    }
    
    public void terimaRequestPengambilanBarang() {
        System.out.println("Method Verifikasi Pengambilan Barang");
    }
    
    public void tolakRequestPengambilanBarang() {
        System.out.println("Method Verifikasi Pengambilan Barang");
    }
}
