package models;

import static sisteminformasibaranghilang.Main.input;
import static sisteminformasibaranghilang.Main.kumpulanBarangHilang;
import static sisteminformasibaranghilang.Main.kumpulanBarangTemu;
import static sisteminformasibaranghilang.Main.kumpulanCivitasAkademik;
import static sisteminformasibaranghilang.Main.kumpulanPengambilanBarang;

public class Petugas extends User{
    // CONSTRUCTOR
    public Petugas(String idPengguna, String namaPengguna, String emailPengguna, String nomorTeleponPengguna, String usernamePengguna, String passwordPengguna){
        super(idPengguna, namaPengguna, emailPengguna, nomorTeleponPengguna, usernamePengguna, passwordPengguna);
    }
    
    // YANG BISA DILAKUKAN PETUGAS
    public void hapusCivitasAkademik(int index){
        kumpulanCivitasAkademik.remove(index);
    }
    
    // TAMBAH BARANG DENGAN LOKASI
    public void tambahBarangHilang(String idBarangHilang, String namaBarangHilang, String jenisBarangHilang, String warnaBarangHilang, String lokasiBarangHilang, String tanggalBarangHilang, String namaPemilik) {
        BarangHilang tempBarangHilang = new BarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang, namaPemilik);
        kumpulanBarangHilang.add(tempBarangHilang);
    }
    
    // TAMBAH BARANG TANPA LOKASI
    public void tambahBarangHilang(String idBarangHilang, String namaBarangHilang, String jenisBarangHilang, String warnaBarangHilang, String tanggalBarangHilang, String namaPemilik) {
        BarangHilang tempBarangHilang = new BarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, "", tanggalBarangHilang, namaPemilik);
        kumpulanBarangHilang.add(tempBarangHilang);
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
            case 6:
                System.out.print("$ Masukkan pemilik barang: ");
                dataBarangHilang = input.nextLine();
                kumpulanBarangHilang.get(index).setNamaPemilik(dataBarangHilang);
                break;
        }
    }
    
    public void hapusBarangHilang(int index) {
        kumpulanBarangHilang.remove(index);
    }
    
    public void tambahBarangTemu(String idBarangTemu, String namaBarangTemu, String jenisBarangTemu, String warnaBarangTemu, String lokasiBarangTemu, String tanggalBarangTemu, String namaPenemu) {
        BarangTemu tempBarangTemu = new BarangTemu(idBarangTemu, namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu, tanggalBarangTemu, namaPenemu);
        kumpulanBarangTemu.add(tempBarangTemu);
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
            case 6:
                System.out.print("$ Masukkan penemu barang: ");
                dataBarangTemu = input.nextLine();
                kumpulanBarangTemu.get(index).setNamaPenemu(dataBarangTemu);
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
        System.out.printf("%-5s%-20s%-20s%s\n", "No", "Tanggal Pengambilan", "Nama Barang", "Nama Pengambil");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (int i = 0; i < kumpulanPengambilanBarang.size(); i++){
            System.out.printf("%-5s%-20s%-20s%s\n", String.valueOf(i + 1), kumpulanPengambilanBarang.get(i).getTanggalPengambilanBarang(), kumpulanPengambilanBarang.get(i).getBarang().getNamaBarang(), kumpulanPengambilanBarang.get(i).getPengambil().getNamaPengguna());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
    
    public void tambahPengambilanBarang() {
        System.out.println("Method Tambah Pengambilan Barang");
    }
    
    public void ubahPengambilanBarang() {
        System.out.println("Method Ubah Pengambilan Barang");
    }
    
    public void hapusPengambilanBarang() {
        System.out.println("Method Hapus Pengambilan Barang");
    }    
    
    public void verifikasiPengambilanBarang() {
        System.out.println("Method Verifikasi Pengambilan Barang");
    }
}
