package sisteminformasibaranghilang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;
import models.Admin;
import models.Barang;
import models.BarangHilang;
import models.BarangTemu;
import models.CivitasAkademik;
import models.PengambilanBarang;
import models.Petugas;

/*
TAMBAHIN MENU REQUEST BARANG HILANG
TAMBAHIN MENU CLAIM BARANG TEMU
PROPERTY LOKASI UNTUK CLASS BARANG TEMU DAN HILANG DIBUAT OPSIONAL

HANYA SARAN DARI BANG ADE, BOLEH DIIKUTIN ATAU TIDAK
BARANG TEMU JIKA TIDAK DIAMBIL DALAM 7 X 24 JAM, MAKA BARANG BERHAK DI CLAIM SIAPAPUN
*/

public class Main {
    // Objek class Admin
    public static Admin admin1 = new Admin("9004e59e-9c6c-4ea4-bfcf-c6bdbb715ae0", "Faisal Husada", "faisalhusada@gmail.com", "+62878555675", "admin1", "admin1");
    public static Admin admin2 = new Admin("98f9ccdd-037d-4876-8e9b-6d415ea7e38f", "Arsy Madya Budianto", "arsymadyabudianto@gmail.com", "+62855555315", "admin2", "admin2");
    
    // Objek class Petugas
    public static Petugas petugas1 = new Petugas("ade924a7-8a88-4306-aea8-6cfac4743e58", "Muhammad Rizky Hari Nugroho", "rizkyHari@gmail.com", "+62899555609", "petugas1", "petugas1");
    public static Petugas petugas2 = new Petugas("093aed94-8946-4158-873a-046b4ac0e503", "Muhammad Rizeky Rahmatullah", "rizekyRahmatullah@gmail.com", "+62898555975", "petugas2", "petugas2");
    
    // Objek class CivitasAkademik
    public static CivitasAkademik civitasAkademik1 = new CivitasAkademik("862e13c6-32b8-4b73-8c17-ffc8c6d98440", "Tjeng, Ivan Cahyadi", "ivanCahyadi@gmail.com", "+62878555471", "civitasAkademik1", "civitasAkademik1", "Mahasiswa");
    public static CivitasAkademik civitasAkademik2 = new CivitasAkademik("7fecd532-03ab-4676-9566-2a77b1ae3b66", "Ihsan Magribi", "ihsanmagribi@gmail.com", "+62878555141", "civitasAkademik2", "civitasAkademik2", "Mahasiswa");
    
    // Objek class BarangHilang
    public static BarangHilang barangHilang1 = new BarangHilang("1097a65b-6a0a-4d5e-b23a-2e7f64461171", "Kunci Motor", "Kunci Kendaraan", "Hitam", "Parkiran Gedung Baru", "28-08-2021", "Tjeng, Ivan Cahyadi");
    public static BarangHilang barangHilang2 = new BarangHilang("5a57efa4-1a50-422b-975c-3a698714c79e", "Laptop", "Elektronik", "Abu Metalik", "Ruang C307", "22-04-2022", "Ihsan Magribi");
    
    // Objek class BarangTemu
    public static BarangTemu barangTemu1 = new BarangTemu("e4cdcac4-7bc3-47ff-88d9-8fbebe36a4a5", "Buku", "ATK", "Biru", "Ruang D404", "17-04-2022", "Muhammad Rizky Hari Nugroho");
    public static BarangTemu barangTemu2 = new BarangTemu("5078b9f4-6c2d-4eea-bfa6-f8378113d06d", "Smartphone Vivo", "Elektronik", "Hitam", "Ruang Perpustakaan", "21-02-2022", "Muhammad Rizeky Rahmatullah");
    
    // Objek class Barang untuk data PengambilanBarang
    public static Barang barang1 = new Barang("ea6ca7ad-ee97-473b-9af5-6b11120b5ed0", "Buku", "ATK", "Merah", "Ruang C304");
    public static Barang barang2 = new Barang("be9ff41c-7cc7-451e-8548-4c0db14c4659", "Jaket", "Pakaian", "Krem", "Ruang C308");
    
    // Objek class PengambilanBarang
    public static PengambilanBarang pengambilanBarang1 = new PengambilanBarang("97da6ec4-e135-42f2-9f35-d0769523fd9f", "01-06-2022", barang1, civitasAkademik1);
    public static PengambilanBarang pengambilanBarang2 = new PengambilanBarang("a2f41841-1f70-4422-a322-3625e7179f1d", "05-06-2022", barang2, civitasAkademik2);
    
    // ArrayList yang menampung Admin
    public static ArrayList<Admin> kumpulanAdmin = new ArrayList<>(Arrays.asList(admin1, admin2));
    
    // ArrayList yang menampung Petugas
    public static ArrayList<Petugas> kumpulanPetugas = new ArrayList<>(Arrays.asList(petugas1, petugas2));
    
    // ArrayList yang menampung Civitas Akademik
    public static ArrayList<CivitasAkademik> kumpulanCivitasAkademik = new ArrayList<>(Arrays.asList(civitasAkademik1, civitasAkademik2));
    
    // ArrayList yang menampung Barang Hilang
    public static ArrayList<BarangHilang> kumpulanBarangHilang = new ArrayList<>(Arrays.asList(barangHilang1, barangHilang2));
    
    // ArrayList yang menampung Barang Temu
    public static ArrayList<BarangTemu> kumpulanBarangTemu = new ArrayList<>(Arrays.asList(barangTemu1, barangTemu2));
    
    // ArrayList yang menampung PengambilanBarang
    public static ArrayList<PengambilanBarang> kumpulanPengambilanBarang = new ArrayList<>(Arrays.asList(pengambilanBarang1, pengambilanBarang2));
    
    // Objek class Scanner untuk menerima input
    public static Scanner input = new Scanner(System.in);
    
    // variabel untuk menu
    public static int menu;
    
    // Temporary variabel untuk menampung user yang login
    public static Admin tempAdmin;
    public static Petugas tempPetugas;
    public static CivitasAkademik tempCivak;
    
    public static void manajemenPetugas(){
        do{
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$                Manajemen Petugas               $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Petugas                        $");
            System.out.println("$ [2] Tambah Data Petugas                        $");
            System.out.println("$ [3] Ubah Data Petugas                          $");
            System.out.println("$ [4] Hapus Data Petugas                         $");
            System.out.println("$ [5] Kembali                                    $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            switch(menu){
                case 1:
                    tempAdmin.tampilPetugas();
                    break;
                case 2:
                    String idPetugas = UUID.randomUUID().toString();
                    System.out.print("$ Masukkan nama petugas: ");
                    String namaPetugas = input.nextLine();
                    System.out.print("$ Masukkan email petugas: ");
                    String emailPetugas = input.nextLine();
                    System.out.print("$ Masukkan nomor telepon petugas: ");
                    String nomorTeleponPetugas = input.nextLine();
                    System.out.print("$ Masukkan username petugas: ");
                    String usernamePetugas = input.nextLine();
                    System.out.print("$ Masukkan password petugas: ");
                    String passwordPetugas = input.nextLine();
                    tempAdmin.registerPetugas(idPetugas, namaPetugas, emailPetugas, nomorTeleponPetugas, usernamePetugas, passwordPetugas);
                    System.out.println("\nPetugas berhasil ditambahkan!\n");
                    break;
                case 3:
                    int nomorPetugas;
                    tempAdmin.tampilPetugas();
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor petugas: ");
                            nomorPetugas = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor petugas berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if(nomorPetugas < kumpulanPetugas.size()){
                        while(true){
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$                  Ubah Petugas                  $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$ [1] Nama                                       $");
                            System.out.println("$ [2] Email                                      $");
                            System.out.println("$ [3] Nomor Telepon                              $");
                            System.out.println("$ [4] Username                                   $");
                            System.out.println("$ [5] Password                                   $");
                            System.out.println("$ [6] Kembali                                    $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            while (true) {
                                try {
                                    System.out.print("$ Masukkan menu: ");
                                    menu = Integer.parseInt(input.nextLine());
                                    break;
                                } catch (NumberFormatException ex) {
                                    System.out.println("\nMenu berupa bilangan bulat!\n");
                                }
                            }
                            System.out.println("");
                            if(menu > 0 && menu < 6){
                                tempAdmin.ubahPetugas(menu, nomorPetugas);
                                System.out.println("\nData petugas berhasil diubah!\n");
                            } else if (menu == 6){
                                break;
                            } else{
                                System.out.println("\nMenu tidak ditemukan!\n");
                            }
                        }
                    } else{
                        System.out.println("\nNomor petugas tidak ditemukan!\n");
                    }
                    break;
                case 4:
                    tempAdmin.tampilPetugas();
                    System.out.println("HAPUS PETUGAS\n");
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor petugas: ");
                            nomorPetugas = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor petugas berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if (nomorPetugas <= kumpulanPetugas.size()){
                        tempAdmin.hapusPetugas(nomorPetugas);
                        System.out.println("Petugas berhasil dihapus!");
                    } else{
                        System.out.println("\nNomor barang tidak ditemukan!\n");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 5);
    }
    
    public static void manajemenCivitasAkademik(){
        do{
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$           Manajemen Civitas Akademik           $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Civitas Akademik               $");
            System.out.println("$ [2] Hapus Data Civitas Akademik                $");
            System.out.println("$ [3] Kembali                                    $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("\n");
            switch(menu){
                case 1:
                    tempPetugas.tampilCivitasAkademik();
                    break;
                case 2:
                    int nomorCivak;
                    tempPetugas.tampilCivitasAkademik();
                    System.out.println("HAPUS CIVITAS AKADEMIK\n");
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor civitas akademik: ");
                            nomorCivak = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor civitas akademik berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if (nomorCivak <= kumpulanCivitasAkademik.size()){
                        tempPetugas.hapusCivitasAkademik(nomorCivak);
                        System.out.println("Data Civitas Akademik berhasil dihapus!\n");
                    } else{
                        System.out.println("\nNomor civitas akademik tidak ditemukan!\n");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 3);
    }
    
    public static void manajemenBarangHilang(){
        do{
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$             Manajemen Barang Hilang            $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Barang Hilang                  $");
            System.out.println("$ [2] Tambah Data Barang Hilang                  $");
            System.out.println("$ [3] Ubah Data Barang Hilang                    $");
            System.out.println("$ [4] Hapus Data Barang Hilang                   $");
            System.out.println("$ [5] Kembali                                    $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            switch(menu){
                case 1:
                    tempPetugas.tampilBarangHilang();
                    break;
                case 2:
                    String idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang, namaPemilik;
                    while(true){
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$            Tambah Data Barang Hilang           $");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$ [1] Dengan Lokasi                              $");
                        System.out.println("$ [2] Tanpa Lokasi                               $");
                        System.out.println("$ [3] Kembali                                    $");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        while (true) {
                            try {
                                System.out.print("$ Masukkan menu: ");
                                menu = Integer.parseInt(input.nextLine());
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nMenu berupa bilangan bulat!\n");
                            }
                        }
                        System.out.println("");
                        if(menu == 1 || menu == 2){
                            idBarangHilang = UUID.randomUUID().toString();
                            System.out.println("$ Masukkan nama barang hilang: ");
                            namaBarangHilang = input.nextLine();
                            System.out.println("$ Masukkan jenis barang hilang: ");
                            jenisBarangHilang = input.nextLine();
                            System.out.println("$ Masukkan warna barang hilang: ");
                            warnaBarangHilang = input.nextLine();

                            // TANGGAL INI HARUSNYA BISA PILIH MAU TANGGAL SAAT INI ATAU CUSTOM
                            System.out.println("$ Masukkan tanggal barang hilang(DD-MM-YYYY): ");
                            tanggalBarangHilang = input.nextLine();
                            // TANGGAL INI HARUSNYA BISA PILIH MAU TANGGAL SAAT INI ATAU CUSTOM

                            System.out.println("$ Masukkan nama pemilik barang: ");
                            namaPemilik = input.nextLine();
                            if (menu == 1){
                                System.out.println("$ Masukkan lokasi barang hilang: ");
                                lokasiBarangHilang = input.nextLine();
                                tempPetugas.tambahBarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang, namaPemilik);
                            } else{
                                tempPetugas.tambahBarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, tanggalBarangHilang, namaPemilik);
                            }
                            break;
                        } else{
                            System.out.println("\nMenu tidak ditemukan!\n");
                        }
                    }
                    break;
                case 3:
                    int nomorBarangHilang;
                    tempPetugas.tampilBarangHilang();
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor barang: ");
                            nomorBarangHilang = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor barang berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if(nomorBarangHilang < kumpulanBarangHilang.size()){
                        while(true){
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$               Ubah Barang Hilang               $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$ [1] Nama                                       $");
                            System.out.println("$ [2] Jenis                                      $");
                            System.out.println("$ [3] Warna                                      $");
                            System.out.println("$ [4] Lokasi Hilang                              $");
                            System.out.println("$ [5] Tanggal Hilang                             $");
                            System.out.println("$ [6] Nama Pemilik                               $");
                            System.out.println("$ [7] Kembali                                    $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            while (true) {
                                try {
                                    System.out.print("$ Masukkan menu: ");
                                    menu = Integer.parseInt(input.nextLine());
                                    break;
                                } catch (NumberFormatException ex) {
                                    System.out.println("\nMenu berupa bilangan bulat!\n");
                                }
                            }
                            System.out.println("");
                            if(menu > 0 && menu < 7){
                                tempPetugas.ubahBarangHilang(menu, nomorBarangHilang);
                                System.out.println("\nData barang hilang berhasil diubah!\n");
                            } else if (menu == 7){
                                break;
                            } else{
                                System.out.println("\nMenu tidak ditemukan!\n");
                            }
                        }
                    } else{
                        System.out.println("\nNomor petugas tidak ditemukan!\n");
                    }
                    break;
                case 4:
                    tempPetugas.tampilBarangHilang();
                    System.out.println("HAPUS BARANG HILANG\n");
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor barang hilang: ");
                            nomorBarangHilang = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor barang hilang berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if (nomorBarangHilang < kumpulanBarangHilang.size()){
                        tempPetugas.hapusBarangHilang(nomorBarangHilang);
                        System.out.println("Data barang hilang berhasil dihapus!\n");
                    } else{
                        System.out.println("\nNomor barang hilang tidak ditemukan!\n");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 5);
    }
    
    public static void manajemenBarangTemu(){
        do{
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$              Manajemen Barang Temu             $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Barang Temu                    $");
            System.out.println("$ [2] Tambah Data Barang Temu                    $");
            System.out.println("$ [3] Ubah Data Barang Temu                      $");
            System.out.println("$ [4] Hapus Data Barang Temu                     $");
            System.out.println("$ [5] Kembali                                    $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            switch(menu){
                case 1:
                    tempPetugas.tampilBarangTemu();
                    break;
                case 2:
                    String idBarangTemu, namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu, tanggalBarangTemu, namaPenemu;
                    idBarangTemu = UUID.randomUUID().toString();
                    System.out.println("$ Masukkan nama barang temu: ");
                    namaBarangTemu = input.nextLine();
                    System.out.println("$ Masukkan jenis barang temu: ");
                    jenisBarangTemu = input.nextLine();
                    System.out.println("$ Masukkan warna barang temu: ");
                    warnaBarangTemu = input.nextLine();
                    System.out.println("$ Masukkan lokasi barang temu: ");
                    lokasiBarangTemu = input.nextLine();

                    // TANGGAL INI HARUSNYA BISA PILIH MAU TANGGAL SAAT INI ATAU CUSTOM
                    System.out.println("$ Masukkan tanggal barang temu(DD-MM-YYYY): ");
                    tanggalBarangTemu = input.nextLine();
                    // TANGGAL INI HARUSNYA BISA PILIH MAU TANGGAL SAAT INI ATAU CUSTOM

                    System.out.println("$ Masukkan nama penemu barang: ");
                    namaPenemu = input.nextLine();
                    tempPetugas.tambahBarangTemu(idBarangTemu, namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu, tanggalBarangTemu, namaPenemu);
                    break;
                case 3:
                    /*
                        DOING THIS TASK
                        PLEASE MOVE THIS COMMENT TO ANOTHER TASK AFTER THE TASK DONE!
                        OR
                        PLEASE REMOVE THIS COMMENT AFTER THE TASK DONE!
                    */
                    int nomorBarangTemu;
                    tempPetugas.tampilBarangTemu();
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor barang: ");
                            nomorBarangTemu = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor barang berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if(nomorBarangTemu < kumpulanBarangTemu.size()){
                        while(true){
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$                Ubah Barang Temu                $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$ [1] Nama                                       $");
                            System.out.println("$ [2] Jenis                                      $");
                            System.out.println("$ [3] Warna                                      $");
                            System.out.println("$ [4] Lokasi Temu                                $");
                            System.out.println("$ [5] Tanggal Temu                               $");
                            System.out.println("$ [6] Nama Penemu                                $");
                            System.out.println("$ [7] Kembali                                    $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            while (true) {
                                try {
                                    System.out.print("$ Masukkan menu: ");
                                    menu = Integer.parseInt(input.nextLine());
                                    break;
                                } catch (NumberFormatException ex) {
                                    System.out.println("\nMenu berupa bilangan bulat!\n");
                                }
                            }
                            System.out.println("");
                            if(menu > 0 && menu < 7){
                                tempPetugas.ubahBarangTemu(menu, nomorBarangTemu);
                                System.out.println("\nData barang hilang berhasil diubah!\n");
                            } else if (menu == 7){
                                break;
                            } else{
                                System.out.println("\nMenu tidak ditemukan!\n");
                            }
                        }
                    } else{
                        System.out.println("\nNomor petugas tidak ditemukan!\n");
                    }
                    break;
                case 4:
                    tempPetugas.tampilBarangTemu();
                    System.out.println("HAPUS BARANG TEMU\n");
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor barang temu: ");
                            nomorBarangTemu = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor barang temu berupa bilangan bulat!\n");
                        }
                    }
                    System.out.println("");
                    if (nomorBarangTemu < kumpulanBarangTemu.size()){
                        tempPetugas.hapusBarangTemu(nomorBarangTemu);
                        System.out.println("Data barang hilang berhasil dihapus!\n");
                    } else{
                        System.out.println("\nNomor barang hilang tidak ditemukan!\n");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 5);
    }

    public static void manajemenPengambilanBarang(){
        do{
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$           Manajemen Pengambilan Barang         $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Pengambilan Barang             $");
            System.out.println("$ [2] Tambah Data Pengambilan Barang             $");
            System.out.println("$ [3] Ubah Data Pengambilan Barang               $");
            System.out.println("$ [4] Hapus Data Pengambilan Barang              $");
            System.out.println("$ [5] Kembali                                    $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            switch(menu){
                case 1:
                    tempPetugas.tampilPengambilanBarang();
                    break;
                case 2:
                    tempPetugas.tambahPengambilanBarang();
                    break;
                case 3:
                    tempPetugas.ubahPengambilanBarang();
                    break;
                case 4:
                    tempPetugas.hapusPengambilanBarang();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 5);
    }
    
    public static void verifikasiPengambilanBarang(){
        System.out.println("verifikasi pengambilan barang");
    }
    
    public static void menuAdmin() {
        while(true){
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$                   Menu Admin                   $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Manajemen Petugas                          $");
            System.out.println("$ [2] Tampil Data Civitas Akademik               $");
            System.out.println("$ [3] Tampil Data Barang Hilang                  $");
            System.out.println("$ [4] Tampil Data Barang Temu                    $");
            System.out.println("$ [5] Tampil Data Pengambilan Barang             $");
            System.out.println("$ [6] Logout                                     $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            if(menu == 1){
                manajemenPetugas();
            } else if(menu == 2){
                tempAdmin.tampilCivitasAkademik();
            } else if(menu == 3){
                tempAdmin.tampilBarangHilang();
            } else if(menu == 4){
                tempAdmin.tampilBarangTemu();
            } else if(menu == 5){
                tempAdmin.tampilPengambilanBarang();
            } else if(menu == 6){
                System.out.print("$ Konfirmasi logout(y/n): ");
                String konfirmasi = input.nextLine();
                System.out.println("");
                if(konfirmasi.equals("y")){
                    tempAdmin = null;
                    break;
                }
            } else{
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static void menuPetugas() {
        while(true){
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$                  Menu Petugas                  $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Manajemen Civitas Akademik                 $");
            System.out.println("$ [2] Manajemen Barang Hilang                    $");
            System.out.println("$ [3] Manajemen Barang Temu                      $");
            System.out.println("$ [4] Manajemen Pengambilan Barang               $");
            System.out.println("$ [5] Verifikasi Pengambilan Barang              $");
            System.out.println("$ [6] Logout                                     $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            if(menu == 1){
                manajemenCivitasAkademik();
            } else if(menu == 2){
                manajemenBarangHilang();
            } else if(menu == 3){
                manajemenBarangTemu();
            } else if(menu == 4){
                manajemenPengambilanBarang();
            } else if(menu == 5){
                verifikasiPengambilanBarang();
            } else if(menu == 6){
                System.out.print("$ Konfirmasi logout(y/n): ");
                String konfirmasi = input.nextLine();
                System.out.println("");
                if(konfirmasi.equals("y")){
                    tempPetugas = null;
                    break;
                }
            } else{
                System.out.println("\nMenu tidak ditemukan!\n");
            }
            
        }
    }
    
    public static void menuCivitasAkademik() {
        while(true){
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$              Menu Civitas Akademik             $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Barang Hilang                  $");
            System.out.println("$ [2] Tampil Data Barang Temu                    $");
            System.out.println("$ [3] Request Pengambilan Barang                 $");
            System.out.println("$ [4] Ubah Profile                               $");
            System.out.println("$ [5] Logout                                     $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            if(menu == 1){
                tempCivak.tampilBarangHilang();
            } else if(menu == 2){
                tempCivak.tampilBarangTemu();
            } else if(menu == 3){
                tempCivak.requestAmbilBarang();
            } else if(menu == 4){
                System.out.println("change civak's profile");
            } else if(menu == 5){
                System.out.print("$ Konfirmasi logout(y/n): ");
                String konfirmasi = input.nextLine();
                System.out.println("");
                if(konfirmasi.equals("y")){
                    tempCivak = null;
                    break;
                }
            } else{
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static boolean login(String username, String password) {
        for(Admin admin : kumpulanAdmin){
            if(admin.loginVerification(username, password)) {
                tempAdmin = admin;
                return true;
            }
        }
        for(Petugas petugas : kumpulanPetugas){
            if(petugas.loginVerification(username, password)){
                tempPetugas = petugas;
                return true;
            }
        }
        for(CivitasAkademik civitasAkademik : kumpulanCivitasAkademik){
            if(civitasAkademik.loginVerification(username, password)){
                tempCivak = civitasAkademik;
                return true;
            }
        }
        return false;
    }
    
    // METHOD PERTAMA YANG AKAN DIJALANKAN PADA SAAT PROGRAM DIJALANKAN
    public static void main(String[] args) {
        do{
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$         Sistem Informasi Barang Hilang         $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Login                                      $");
            System.out.println("$ [2] Register                                   $");
            System.out.println("$ [3] Exit                                       $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            while (true) {
                try {
                    System.out.print("$ Masukkan menu: ");
                    menu = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("\nMenu berupa bilangan bulat!\n");
                }
            }
            System.out.println("");
            switch(menu){
                case 1:
                    System.out.print("$ Masukkan Username: ");
                    String username = input.nextLine();
                    System.out.print("$ Masukkan Password: ");
                    String password = input.nextLine();
                    if(login(username, password)){
                        System.out.println("");
                        if(tempAdmin != null){
                            menuAdmin();
                        } else if(tempPetugas != null){
                            menuPetugas();
                        } else if(tempCivak != null){
                            menuCivitasAkademik();
                        }
                    } else{
                        System.out.println("\nusername atau password salah!\n");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan Nama Anda: ");
                    String namaPendaftar = input.nextLine();
                    System.out.print("Masukkan Email Anda: ");
                    String emailPendaftar = input.nextLine();
                    System.out.print("Masukkan Nomor Telepon Anda: ");
                    String nomorTeleponPendaftar = input.nextLine();
                    System.out.print("Masukkan Peran Anda: ");
                    String peranPendaftar = input.nextLine();
                    System.out.print("Masukkan Username Akun: ");
                    String usernamePendaftar = input.nextLine();
                    System.out.print("Masukkan Password Anda: ");
                    String passwordPendaftar = input.nextLine();
                    String idPendaftar = UUID.randomUUID().toString();
                    tempCivak = new CivitasAkademik(idPendaftar, namaPendaftar, emailPendaftar, nomorTeleponPendaftar, usernamePendaftar, passwordPendaftar, peranPendaftar);
                    kumpulanCivitasAkademik.add(tempCivak);
                    tempCivak = null;
                    break;
                case 3:
                    System.out.println("\nKeluar Aplikasi...\n");
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        } while(menu != 3);
    }
}
