package sisteminformasibaranghilangv2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;
import models.Admin;
import models.Barang;
import models.CivitasAkademik;
import models.PengambilanBarang;
import models.Petugas;
import models.User;

public class Main {

    // ArrayList yang menampung Admin
    public static ArrayList<Admin> kumpulanAdmin = new ArrayList<>(
            Arrays.asList(
                    new Admin("9004e59e-9c6c-4ea4-bfcf-c6bdbb715ae0", "Faisal Husada", "faisalhusada@gmail.com", "+62878555675", "admin1", "admin1"),
                    new Admin("98f9ccdd-037d-4876-8e9b-6d415ea7e38f", "Arsy Madya Budianto", "arsymadyabudianto@gmail.com", "+62855555315", "admin2", "admin2")
            )
    );

    // ArrayList yang menampung Petugas
    public static ArrayList<Petugas> kumpulanPetugas = new ArrayList<>(
            Arrays.asList(
                    new Petugas("ade924a7-8a88-4306-aea8-6cfac4743e58", "Muhammad Rizky Hari Nugroho", "rizkyHari@gmail.com", "+62899555609", "petugas1", "petugas1"),
                    new Petugas("093aed94-8946-4158-873a-046b4ac0e503", "Muhammad Rizeky Rahmatullah", "rizekyRahmatullah@gmail.com", "+62898555975", "petugas2", "petugas2")
            )
    );

    // ArrayList yang menampung Civitas Akademik
    public static ArrayList<CivitasAkademik> kumpulanCivitasAkademik = new ArrayList<>(
            Arrays.asList(
                    new CivitasAkademik("862e13c6-32b8-4b73-8c17-ffc8c6d98440", "Tjeng, Ivan Cahyadi", "ivanCahyadi@gmail.com", "+62878555471", "civak1", "civak1", "Mahasiswa"),
                    new CivitasAkademik("7fecd532-03ab-4676-9566-2a77b1ae3b66", "Ihsan Magribi", "ihsanmagribi@gmail.com", "+62878555141", "civak2", "civak2", "Mahasiswa")
            )
    );

    // ArrayList untuk menampung Barang
    public static ArrayList<Barang> kumpulanBarang = new ArrayList<>(
            Arrays.asList(
                    new Barang("1097a65b-6a0a-4d5e-b23a-2e7f64461171", "Kunci Motor", "Kunci Kendaraan", "Hitam", "Parkiran Gedung Baru", "Hilang", "28-08-2021", "862e13c6-32b8-4b73-8c17-ffc8c6d98440"),
                    new Barang("5a57efa4-1a50-422b-975c-3a698714c79e", "Laptop", "Elektronik", "Abu Metalik", "Ruang C307", "Hilang", "22-04-2022", "7fecd532-03ab-4676-9566-2a77b1ae3b66"),
                    new Barang("e4cdcac4-7bc3-47ff-88d9-8fbebe36a4a5", "Buku", "ATK", "Biru", "Ruang D404", "Ditemukan", "17-04-2022", "ade924a7-8a88-4306-aea8-6cfac4743e58"),
                    new Barang("5078b9f4-6c2d-4eea-bfa6-f8378113d06d", "Smartphone Vivo", "Elektronik", "Hitam", "Ruang Perpustakaan", "Ditemukan", "21-02-2022", "093aed94-8946-4158-873a-046b4ac0e503"),
                    new Barang("ea6ca7ad-ee97-473b-9af5-6b11120b5ed0", "Buku", "ATK", "Merah", "Ruang C304", "Diklaim", "10-06-2022", "7fecd532-03ab-4676-9566-2a77b1ae3b66"),
                    new Barang("be9ff41c-7cc7-451e-8548-4c0db14c4659", "Jaket", "Pakaian", "Krem", "Ruang C308", "Diklaim", "09-06-2022", "862e13c6-32b8-4b73-8c17-ffc8c6d98440")
            )
    );

    // ArrayList yang menampung PengambilanBarang
    public static ArrayList<PengambilanBarang> kumpulanPengambilanBarang = new ArrayList<>(
            Arrays.asList(
                    new PengambilanBarang("97da6ec4-e135-42f2-9f35-d0769523fd9f", "01-06-2022", "Claimed", "ea6ca7ad-ee97-473b-9af5-6b11120b5ed0", "862e13c6-32b8-4b73-8c17-ffc8c6d98440"),
                    new PengambilanBarang("a2f41841-1f70-4422-a322-3625e7179f1d", "05-06-2022", "Claimed", "be9ff41c-7cc7-451e-8548-4c0db14c4659", "7fecd532-03ab-4676-9566-2a77b1ae3b66")
            )
    );

    // Objek class Scanner untuk menerima input
    public static Scanner input = new Scanner(System.in);

    // variabel untuk menu
    public static int menu;

    // Temporary variabel untuk menampung user yang login
    public static Admin tempAdmin;
    public static Petugas tempPetugas;
    public static CivitasAkademik tempCivak;

    // Objek class Date
    public static Date date = new Date();

    // Objek class SimpleDateFormat
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static boolean usernameNotExists(String username) {
        for (Admin admin : kumpulanAdmin) {
            if (admin.getUsernameUser().equals(username)) {
                return false;
            }
        }
        for (Petugas petugas : kumpulanPetugas) {
            if (petugas.getUsernameUser().equals(username)) {
                return false;
            }
        }
        for (CivitasAkademik civak : kumpulanCivitasAkademik) {
            if (civak.getUsernameUser().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static String getNamaDariId(String as, String id) {
        if (as.equals("Pemilik") || as.equals("Pengambil")) {
            for (CivitasAkademik civak : kumpulanCivitasAkademik) {
                if (civak.getIdUser().equals(id)) {
                    return civak.getNamaUser();
                }
            }
        } else if (as.equals("Penemu")) {
            for (Petugas petugas : kumpulanPetugas) {
                if (petugas.getIdUser().equals(id)) {
                    return petugas.getNamaUser();
                }
            }
        } else if (as.equals("Semua")) {
            for (CivitasAkademik civak : kumpulanCivitasAkademik) {
                if (civak.getIdUser().equals(id)) {
                    return civak.getNamaUser();
                }
            }
            for (Petugas petugas : kumpulanPetugas) {
                if (petugas.getIdUser().equals(id)) {
                    return petugas.getNamaUser();
                }
            }
        }
        return "Unknown";
    }

    public static String getNamaBarangDariIdBarang(String idBarang) {
        for (Barang barang : kumpulanBarang) {
            if (barang.getIdBarang().equals(idBarang)) {
                return barang.getNamaBarang();
            }
        }
        return "Unknown";
    }
    
    public static ArrayList getBarangDariStatus(String status) {
        ArrayList<Barang> tempKumpulanBarang = new ArrayList();
        for (Barang barang : kumpulanBarang) {
            if (barang.getStatusBarang().equals(status)) {
                tempKumpulanBarang.add(barang);
            }
        }
        return tempKumpulanBarang;
    }
    
    public static ArrayList getBarangDariStatusDanIdUser(String status, String idUser) {
        ArrayList<Barang> tempKumpulanBarang = new ArrayList();
        for (Barang barang : kumpulanBarang) {
            if (barang.getStatusBarang().equals(status) && barang.getIdUser().equals(idUser)) {
                tempKumpulanBarang.add(barang);
            }
        }
        return tempKumpulanBarang;
    }
    
    public static ArrayList getPengambilanBarangDariIdUser(String idUser) {
        ArrayList<PengambilanBarang> tempKumpulanPengambilanBarang = new ArrayList();
        for (PengambilanBarang pengambilanBarang : kumpulanPengambilanBarang) {
            if (pengambilanBarang.getIdPengambil().equals(idUser)) {
                tempKumpulanPengambilanBarang.add(pengambilanBarang);
            }
        }
        return tempKumpulanPengambilanBarang;
    }

    public static void manajemenPetugas() {
        OUTER:
        while (true) {
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
            int nomorPetugas;
            switch (menu) {
                case 1 -> {
                    if (!kumpulanPetugas.isEmpty()) {
                        tempAdmin.tampilPetugas();
                    } else {
                        System.out.println("\nTidak ada data Petugas!\n");
                    }
                }
                case 2 -> {
                    String namaPetugas, emailPetugas, nomorTeleponPetugas, usernamePetugas, passwordPetugas;
                    System.out.print("$ Masukkan nama petugas: ");
                    namaPetugas = input.nextLine();
                    System.out.print("$ Masukkan email petugas: ");
                    emailPetugas = input.nextLine();
                    System.out.print("$ Masukkan nomor telepon petugas: ");
                    nomorTeleponPetugas = input.nextLine();
                    while (true) {
                        System.out.print("$ Masukkan username petugas: ");
                        usernamePetugas = input.nextLine();
                        if (usernameNotExists(usernamePetugas)) {
                            break;
                        } else {
                            System.out.println("Username telah digunakan!");
                        }
                    }
                    System.out.print("$ Masukkan password petugas: ");
                    passwordPetugas = input.nextLine();
                    tempAdmin.tambahPetugas(UUID.randomUUID().toString(), namaPetugas, emailPetugas, nomorTeleponPetugas, usernamePetugas, passwordPetugas);
                    System.out.println("\nData petugas berhasil ditambahkan!\n");
                }
                case 3 -> {
                    if (!kumpulanPetugas.isEmpty()) {
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
                        if (nomorPetugas >= 0 && nomorPetugas < kumpulanPetugas.size()) {
                            while (true) {
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
                                if (menu > 0 && menu < 6) {
                                    tempAdmin.ubahPetugas(menu, nomorPetugas);
                                    System.out.println("\nData petugas berhasil diubah!\n");
                                } else if (menu == 6) {
                                    break;
                                } else {
                                    System.out.println("\nMenu tidak ditemukan!\n");
                                }
                            }
                        } else {
                            System.out.println("\nNomor petugas tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data Petugas!\n");
                    }
                }
                case 4 -> {
                    if (!kumpulanPetugas.isEmpty()) {
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
                        if (nomorPetugas >= 0 && nomorPetugas < kumpulanPetugas.size()) {
                            tempAdmin.hapusPetugas(nomorPetugas);
                            System.out.println("\nPetugas berhasil dihapus!\n");
                        } else {
                            System.out.println("\nNomor petugas tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data Petugas!\n");
                    }
                }
                case 5 -> {
                    break OUTER;
                }
                default ->
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    public static void manajemenCivitasAkademik() {
        OUTER:
        while (true) {
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
            System.out.println("");
            switch (menu) {
                case 1 -> tempPetugas.tampilCivitasAkademik();
                case 2 -> {
                    if (!kumpulanCivitasAkademik.isEmpty()) {
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
                        if (nomorCivak >= 0 && nomorCivak < kumpulanCivitasAkademik.size()) {
                            tempPetugas.hapusCivitasAkademik(nomorCivak);
                            System.out.println("Data Civitas Akademik berhasil dihapus!\n");
                        } else {
                            System.out.println("\nNomor civitas akademik tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nData Civitas Akademik Tidak Ada!\n");
                    }
                }
                case 3 -> {
                    break OUTER;
                }
                default -> System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static void manajemenBarang() {
        OUTER:
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$                Manajemen Barang                $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Barang                         $");
            System.out.println("$ [2] Hapus Data Barang                          $");
            System.out.println("$ [3] Tampil Data Barang Temu                    $");
            System.out.println("$ [4] Tambah Data Barang Temu                    $");
            System.out.println("$ [5] Ubah Data Barang Temu                      $");
            System.out.println("$ [6] Tampil Data Barang Hilang                  $");
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
            switch (menu) {
                case 1 -> {
                    if (!kumpulanBarang.isEmpty()) {
                        tempPetugas.tampilBarang();
                    } else {
                        System.out.println("\nTidak ada data Barang\n");
                    }
                }
                case 2 -> {
                    if (!kumpulanBarang.isEmpty()) {
                        int nomorBarang;
                        tempPetugas.tampilBarang();
                        System.out.println("HAPUS BARANG HILANG\n");
                        while (true) {
                            try {
                                System.out.print("$ Masukkan nomor barang hilang: ");
                                nomorBarang = Integer.parseInt(input.nextLine()) - 1;
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nNomor barang hilang berupa bilangan bulat!\n");
                            }
                        }
                        System.out.println("");
                        if (nomorBarang >= 0 && nomorBarang < kumpulanBarang.size()) {
                            tempPetugas.hapusBarang(nomorBarang);
                            System.out.println("Data barang berhasil dihapus!\n");
                        } else {
                            System.out.println("\nData barang tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data barang hilang!\n");
                    }
                }
                case 3 -> {
                    ArrayList<Barang> tempKumpulanBarangTemu = getBarangDariStatus("Ditemukan");
                    if (!tempKumpulanBarangTemu.isEmpty()) {
                        tempPetugas.tampilBarangTemu(tempKumpulanBarangTemu);
                    } else {
                        System.out.println("\nTidak ada data Barang Temu\n");
                    }
                }
                case 4 -> {
                    String namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu, tanggalBarangTemu;
                    System.out.print("$ Masukkan nama barang temu: ");
                    namaBarangTemu = input.nextLine();
                    System.out.print("$ Masukkan jenis barang temu: ");
                    jenisBarangTemu = input.nextLine();
                    System.out.print("$ Masukkan warna barang temu: ");
                    warnaBarangTemu = input.nextLine();
                    System.out.print("$ Masukkan lokasi barang temu: ");
                    lokasiBarangTemu = input.nextLine();
                    OUTER_1:
                    while (true) {
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$                     Tanggal                    $");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$ [1] Hari ini                                   $");
                        System.out.println("$ [2] Custom                                     $");
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
                        switch (menu) {
                            case 1 -> {
                                tanggalBarangTemu = dateFormat.format(date);
                                break OUTER_1;
                                }
                            case 2 -> {
                                System.out.print("$ Masukkan tanggal barang temu(dd-MM-yyyy): ");
                                tanggalBarangTemu = input.nextLine();
                                break OUTER_1;
                                }
                            default -> System.out.println("\nPilihan tidak ditemukan!\n");
                        }
                    }
                        tempPetugas.tambahBarangTemu(
                                UUID.randomUUID().toString(), namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu, tanggalBarangTemu, tempPetugas.getIdUser()
                        );
                }
                case 5 -> {
                    ArrayList<Barang> tempKumpulanBarangTemu = getBarangDariStatus("Ditemukan");
                    if (!tempKumpulanBarangTemu.isEmpty()) {
                        int nomorBarang;
                        tempPetugas.tampilBarangTemu(tempKumpulanBarangTemu);
                        while (true) {
                            try {
                                System.out.print("$ Masukkan nomor barang: ");
                                nomorBarang = Integer.parseInt(input.nextLine()) - 1;
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nNomor barang berupa bilangan bulat!\n");
                            }
                        }
                        System.out.println("");
                        if (nomorBarang >= 0 && nomorBarang < tempKumpulanBarangTemu.size()) {
                            while (true) {
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("$                Ubah Barang Temu                $");
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("$ [1] Nama                                       $");
                                System.out.println("$ [2] Jenis                                      $");
                                System.out.println("$ [3] Warna                                      $");
                                System.out.println("$ [4] Lokasi                                     $");
                                System.out.println("$ [5] Tanggal                                    $");
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
                                if (menu > 0 && menu < 6) {
                                    tempPetugas.ubahBarangTemu(menu, tempKumpulanBarangTemu.get(nomorBarang).getIdBarang());
                                    System.out.println("\nData barang temu berhasil diubah!\n");
                                } else if (menu == 6) {
                                    break;
                                } else {
                                    System.out.println("\nPilihan tidak ditemukan!\n");
                                }
                            }
                        } else {
                            System.out.println("\nNomor barang temu tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data Barang Temu\n");
                    }
                }
                case 6 -> {
                    ArrayList<Barang> tempKumpulanBarangHilang = getBarangDariStatus("Hilang");
                    if (!tempKumpulanBarangHilang.isEmpty()) {
                        tempPetugas.tampilBarangHilang(tempKumpulanBarangHilang);
                    } else {
                        System.out.println("\nTidak ada data Barang Hilang\n");
                    }
                }
                case 7 -> {
                    break OUTER;
                }
                default -> System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static void manajemenPengambilanBarang() {
        OUTER:
        while (true) {
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
            int nomorPengambilanBarang;
            switch (menu) {
                case 1 -> {
                    if (!kumpulanPengambilanBarang.isEmpty()) {
                        tempPetugas.tampilPengambilanBarang();
                    } else {
                        System.out.println("\nTidak ada data Pengambilan Barang\n");
                    }
                }
                case 2 -> {
                    String tanggalPengambilanBarang, idBarang, idPengambil;
                    OUTER_1:
                    while (true) {
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$                     Tanggal                    $");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$ [1] Hari ini                                   $");
                        System.out.println("$ [2] Custom                                     $");
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
                        switch (menu) {
                            case 1 -> {
                                tanggalPengambilanBarang = dateFormat.format(date);
                                break OUTER_1;
                            }
                            case 2 -> {
                                System.out.print("$ Masukkan tanggal pengambilan barang(dd-MM-yyyy): ");
                                tanggalPengambilanBarang = input.nextLine();
                                break OUTER_1;
                            }
                            default -> System.out.println("\nPilihan tidak ditemukan!\n");
                        }
                    }
                    System.out.print("$ Masukkan id barang: ");
                    idBarang = input.nextLine();
                    System.out.print("$ Masukkan id pengambil: ");
                    idPengambil = input.nextLine();
                    tempPetugas.tambahPengambilanBarang(UUID.randomUUID().toString(), tanggalPengambilanBarang, idBarang, idPengambil);
                }
                case 3 -> {
                    if (!kumpulanPengambilanBarang.isEmpty()) {
                        tempPetugas.tampilPengambilanBarang();
                        while (true) {
                            try {
                                System.out.print("$ Masukkan nomor barang: ");
                                nomorPengambilanBarang = Integer.parseInt(input.nextLine()) - 1;
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nNomor barang berupa bilangan bulat!\n");
                            }
                        }
                        System.out.println("");
                        if (nomorPengambilanBarang >= 0 && nomorPengambilanBarang < kumpulanPengambilanBarang.size()) {
                            while (true) {
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("$             Ubah Pengambilan Barang            $");
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("$ [1] Tanggal Pengambilan Barang                 $");
                                System.out.println("$ [2] Status Pengambilan Barang                  $");
                                System.out.println("$ [3] Id Barang                                  $");
                                System.out.println("$ [4] Id Pengambil                               $");
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
                                if (menu > 0 && menu < 5) {
                                    tempPetugas.ubahPengambilanBarang(menu, nomorPengambilanBarang);
                                    System.out.println("\nData pengambilan barang berhasil diubah!\n");
                                } else if (menu == 5) {
                                    break;
                                } else {
                                    System.out.println("\nPilihan tidak ditemukan!\n");
                                }
                            }
                        } else {
                            System.out.println("\nNomor Pengambilan Barang tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data Pengambilan Barang\n");
                    }
                }
                case 4 -> {
                    if (!kumpulanPengambilanBarang.isEmpty()) {
                        tempPetugas.tampilPengambilanBarang();
                        System.out.println("HAPUS PENGAMBILAN BARANG\n");
                        while (true) {
                            try {
                                System.out.print("$ Masukkan nomor pengambilan barang: ");
                                nomorPengambilanBarang = Integer.parseInt(input.nextLine()) - 1;
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nNomor pengambilan barang berupa bilangan bulat!\n");
                            }
                        }
                        System.out.println("");
                        if (nomorPengambilanBarang >= 0 && nomorPengambilanBarang < kumpulanPengambilanBarang.size()) {
                            tempPetugas.hapusPengambilanBarang(nomorPengambilanBarang);
                            System.out.println("Data pengambilan barang berhasil dihapus!\n");
                        } else {
                            System.out.println("\nData pengambilan barang tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data Pengambilan Barang\n");
                    }
                }
                case 5 -> {
                    break OUTER;
                }
                default -> System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static void verifikasiPengambilanBarang() {
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$          Verifikasi Pengambilan Barang         $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Request Pengambilan Barang          $");
            System.out.println("$ [2] Terima Request Pengambilan Barang          $");
            System.out.println("$ [3] Tolak Request Pengambilan Barang           $");
            System.out.println("$ [4] Kembali                                    $");
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
            int nomorRequest;
            if (menu == 1) {
                ArrayList<PengambilanBarang> tempKumpulanPengambilanBarang = getBarangDariStatus("Pending");
                if (!tempKumpulanPengambilanBarang.isEmpty()) {
                    tempPetugas.tampilPengambilanBarang(tempKumpulanPengambilanBarang);
                } else {
                    System.out.println("\nData request Pengambilan Barang tidak ada!\n");
                }
            } else if (menu == 2) {
                ArrayList<PengambilanBarang> tempKumpulanPengambilanBarang = getBarangDariStatus("Pending");
                if (!tempKumpulanPengambilanBarang.isEmpty()) {
                    tempPetugas.tampilPengambilanBarang(tempKumpulanPengambilanBarang);
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor barang: ");
                            nomorRequest = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor barang berupa bilangan bulat!\n");
                        }
                    }
                    if (nomorRequest >= 0 && nomorRequest < tempKumpulanPengambilanBarang.size()) {
                        for (PengambilanBarang pengambilanBarang : kumpulanPengambilanBarang) {
                            if (pengambilanBarang.getIdPengambilanBarang().equals(tempKumpulanPengambilanBarang.get(nomorRequest).getIdPengambilanBarang())) {
                                pengambilanBarang.setStatusPengambilanBarang("Accepted");
                            }
                        }
                    }
                } else {
                    System.out.println("\nData request Pengambilan Barang tidak ada!\n");
                }
            } else if (menu == 3) {
                ArrayList<PengambilanBarang> tempKumpulanPengambilanBarang = getBarangDariStatus("Pending");
                if (!tempKumpulanPengambilanBarang.isEmpty()) {
                    tempPetugas.tampilPengambilanBarang(tempKumpulanPengambilanBarang);
                    while (true) {
                        try {
                            System.out.print("$ Masukkan nomor barang: ");
                            nomorRequest = Integer.parseInt(input.nextLine()) - 1;
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("\nNomor barang berupa bilangan bulat!\n");
                        }
                    }
                    if (nomorRequest >= 0 && nomorRequest < tempKumpulanPengambilanBarang.size()) {
                        for (PengambilanBarang pengambilanBarang : kumpulanPengambilanBarang) {
                            if (pengambilanBarang.getIdPengambilanBarang().equals(tempKumpulanPengambilanBarang.get(nomorRequest).getIdPengambilanBarang())) {
                                pengambilanBarang.setStatusPengambilanBarang("Denied");
                            }
                        }
                    }
                } else {
                    System.out.println("\nData request Pengambilan Barang tidak ada!\n");
                }
            } else if (menu == 4){
                break;
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static void menuAdmin() {
        OUTER:
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$                   Menu Admin                   $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Manajemen Petugas                          $");
            System.out.println("$ [2] Tampil Data Civitas Akademik               $");
            System.out.println("$ [3] Tampil Data Barang                         $");
            System.out.println("$ [4] Tampil Data Barang Hilang                  $");
            System.out.println("$ [5] Tampil Data Barang Temu                    $");
            System.out.println("$ [6] Tampil Data Pengambilan Barang             $");
            System.out.println("$ [7] Logout                                     $");
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
            switch (menu) {
                case 1 -> manajemenPetugas();
                case 2 -> {
                    if (!kumpulanCivitasAkademik.isEmpty()) {
                        tempAdmin.tampilCivitasAkademik();
                    } else {
                        System.out.println("\nTidak ada data Civitas Akademik!\n");
                    }
                }
                case 3 -> {
                    if (!kumpulanBarang.isEmpty()) {
                        tempAdmin.tampilBarang();
                    } else {
                        System.out.println("\nTidak ada data Barang!\n");
                    }
                }
                case 4 -> {
                    ArrayList<Barang> tempKumpulanBarangHilang = getBarangDariStatus("Hilang");
                    if (!tempKumpulanBarangHilang.isEmpty()) {
                        tempAdmin.tampilBarangHilang(tempKumpulanBarangHilang);
                    } else {
                        System.out.println("\nTidak ada data Barang Hilang\n");
                    }
                }
                case 5 -> {
                    ArrayList<Barang> tempKumpulanBarangTemu = getBarangDariStatus("Ditemukan");
                    if (!tempKumpulanBarangTemu.isEmpty()) {
                        tempAdmin.tampilBarangTemu(tempKumpulanBarangTemu);
                    } else {
                        System.out.println("\nTidak ada data Barang Temu\n");
                    }
                }
                case 6 -> {
                    if (!kumpulanPengambilanBarang.isEmpty()) {
                        tempAdmin.tampilPengambilanBarang();
                    } else {
                        System.out.println("\nTidak ada data Pengambilan Barang\n");
                    }
                }
                case 7 -> {
                    System.out.print("$ Konfirmasi logout(y/n): ");
                    String konfirmasi = input.nextLine();
                    System.out.println("");
                    if (konfirmasi.equals("y")) {
                        tempAdmin = null;
                        break OUTER;
                    }
                }
                default ->
                    System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static void menuPetugas() {
        OUTER:
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$                  Menu Petugas                  $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Manajemen Civitas Akademik                 $");
            System.out.println("$ [2] Manajemen Barang                           $");
            System.out.println("$ [3] Manajemen Pengambilan Barang               $");
            System.out.println("$ [4] Verifikasi Pengambilan Barang              $");
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
            switch (menu) {
                case 1 -> manajemenCivitasAkademik();
                case 2 -> manajemenBarang();
                case 3 -> manajemenPengambilanBarang();
                case 4 -> verifikasiPengambilanBarang();
                case 5 -> {
                    System.out.print("$ Konfirmasi logout(y/n): ");
                    String konfirmasi = input.nextLine();
                    System.out.println("");
                    if (konfirmasi.equals("y")) {
                        tempPetugas = null;
                        break OUTER;
                    }
                }
                default -> System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    public static void menuCivitasAkademik() {
        OUTER:
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$              Menu Civitas Akademik             $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Barang Hilang                  $");
            System.out.println("$ [2] Lapor Barang Hilang                        $");
            System.out.println("$ [3] Ubah Data Barang Hilang                    $");
            System.out.println("$ [4] Tampil Data Barang Temu                    $");
            System.out.println("$ [5] Tampil Pengambilan Barang                  $");
            System.out.println("$ [6] Request Pengambilan Barang                 $");
            System.out.println("$ [7] Tampil Profile                             $");
            System.out.println("$ [8] Ubah Profile                               $");
            System.out.println("$ [9] Logout                                     $");
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
            switch (menu) {
                case 1 -> {
                    ArrayList<Barang> tempKumpulanBarangHilang = getBarangDariStatus("Hilang");
                    if (!tempKumpulanBarangHilang.isEmpty()) {
                        tempCivak.tampilBarangHilang(tempKumpulanBarangHilang);
                    } else {
                        System.out.println("\nTidak ada data Barang Hilang\n");
                    }
                }
                case 2 -> {
                    String namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang;
                    System.out.print("$ Masukkan nama barang hilang: ");
                    namaBarangHilang = input.nextLine();
                    System.out.print("$ Masukkan jenis barang hilang: ");
                    jenisBarangHilang = input.nextLine();
                    System.out.print("$ Masukkan warna barang hilang: ");
                    warnaBarangHilang = input.nextLine();
                OUTER_2:
                while (true) {
                    System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    System.out.println("$              Tanggal Barang Hilang             $");
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    System.out.println("$ [1] Hari ini                                   $");
                    System.out.println("$ [2] Custom                                     $");
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
                    switch (menu) {
                        case 1 -> {
                            tanggalBarangHilang = dateFormat.format(date);
                            break OUTER_2;
                        }
                        case 2 -> {
                            System.out.print("$ Masukkan tanggal barang temu(dd-MM-yyyy): ");
                            tanggalBarangHilang = input.nextLine();
                            break OUTER_2;
                        }
                        default -> System.out.println("\nPilihan tidak ada!\n");
                    }
                }
                OUTER_1:
                while (true) {
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    System.out.println("$              Lokasi Barang Hilang              $");
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    System.out.println("$ [1] Dengan Lokasi                              $");
                    System.out.println("$ [2] Tanpa Lokasi                               $");
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
                    switch (menu) {
                        case 1 -> {
                            System.out.print("$ Masukkan lokasi barang hilang: ");
                            lokasiBarangHilang = input.nextLine();
                            tempCivak.tambahBarangHilang(UUID.randomUUID().toString(), namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang, tempCivak.getIdUser());
                            break OUTER_1;
                        }
                        case 2 -> {
                            tempCivak.tambahBarangHilang(UUID.randomUUID().toString(), namaBarangHilang, jenisBarangHilang, warnaBarangHilang, tanggalBarangHilang, tempCivak.getIdUser());
                            break OUTER_1;
                        }
                        default -> System.out.println("\nPilihan tidak ada!\n");
                    }
                }
                }
                case 3 -> {
                    ArrayList<Barang> tempKumpulanBarangHilang = getBarangDariStatusDanIdUser("Hilang", tempCivak.getIdUser());
                    if (!tempKumpulanBarangHilang.isEmpty()) {
                        int nomorBarang;
                        tempPetugas.tampilBarangHilang(tempKumpulanBarangHilang);
                        while (true) {
                            try {
                                System.out.print("$ Masukkan nomor barang: ");
                                nomorBarang = Integer.parseInt(input.nextLine()) - 1;
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nNomor barang berupa bilangan bulat!\n");
                            }
                        }
                        System.out.println("");
                        if (nomorBarang >= 0 && nomorBarang < tempKumpulanBarangHilang.size()) {
                            while (true) {
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("$               Ubah Barang Hilang               $");
                                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                                System.out.println("$ [1] Nama                                       $");
                                System.out.println("$ [2] Jenis                                      $");
                                System.out.println("$ [3] Warna                                      $");
                                System.out.println("$ [4] Lokasi                                     $");
                                System.out.println("$ [5] Tanggal                                    $");
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
                                if (menu > 0 && menu < 6) {
                                    tempCivak.ubahBarangHilang(menu, tempKumpulanBarangHilang.get(nomorBarang).getIdUser());
                                    System.out.println("\nData barang hilang berhasil diubah!\n");
                                } else if (menu == 6) {
                                    break;
                                } else {
                                    System.out.println("\nPilihan tidak ditemukan!\n");
                                }
                            }
                        } else {
                            System.out.println("\nNomor barang hilang tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data Barang Hilang\n");
                    }
                }
                case 4 -> {
                    ArrayList<Barang> tempKumpulanBarangTemu = getBarangDariStatus("Ditemukan");
                    if (!tempKumpulanBarangTemu.isEmpty()) {
                        tempCivak.tampilBarangTemu(tempKumpulanBarangTemu);
                    } else {
                        System.out.println("\nTidak ada data Barang Temu\n");
                    }
                }
                case 5 -> {
                    ArrayList<PengambilanBarang> tempKumpulanPengambilanBarang = getPengambilanBarangDariIdUser(tempCivak.getIdUser());
                    if (!tempKumpulanPengambilanBarang.isEmpty()) {
                        tempCivak.tampilPengambilanBarang(tempKumpulanPengambilanBarang);
                    } else {
                        System.out.println("\nTidak ada data Pengambilan Barang\n");
                    }
                }
                case 6 -> {
                    ArrayList<Barang> tempKumpulanBarangTemu = getBarangDariStatus("Ditemukan");
                    if (!tempKumpulanBarangTemu.isEmpty()) {
                        int nomorBarang;
                        tempCivak.tampilBarangTemu(tempKumpulanBarangTemu);
                        while (true) {
                            try {
                                System.out.print("$ Masukkan nomor barang: ");
                                nomorBarang = Integer.parseInt(input.nextLine()) - 1;
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("\nNomor barang berupa bilangan bulat!\n");
                            }
                        }
                        System.out.println("");
                        if (nomorBarang >= 0 && nomorBarang < tempKumpulanBarangTemu.size()) {
                            tempCivak.requestAmbilBarang(UUID.randomUUID().toString(), dateFormat.format(date), tempKumpulanBarangTemu.get(nomorBarang).getIdBarang(), tempCivak.getIdUser());
                            System.out.println("\nRequest Pengambilan Barang berhasil ditambahkan!\n");
                        } else {
                            System.out.println("\nNomor barang tidak ditemukan!\n");
                        }
                    } else {
                        System.out.println("\nTidak ada data Barang Temu\n");
                    }
                }
                case 7 -> {
                    tempCivak.tampilProfileCivitasAkademik();
                }
                case 8 -> {
                    tempCivak.tampilProfileCivitasAkademik();
                    while (true) {
                        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$                  Ubah Profile                  $");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$ [1] Nama                                       $");
                        System.out.println("$ [2] Email                                      $");
                        System.out.println("$ [3] Nomor Telepon                              $");
                        System.out.println("$ [4] Username                                   $");
                        System.out.println("$ [5] Password                                   $");
                        System.out.println("$ [6] Peran                                      $");
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
                        if (menu > 0 && menu < 7) {
                            tempCivak.ubahCivitasAkademik(menu);
                            System.out.println("\nProfile anda berhasil diubah!\n");
                        } else if (menu == 7) {
                            break;
                        } else {
                            System.out.println("\nMenu tidak ditemukan!\n");
                        }
                    }
                }
                case 9 -> {
                    System.out.print("$ Konfirmasi logout(y/n): ");
                    String konfirmasi = input.nextLine();
                    System.out.println("");
                    if (konfirmasi.equals("y")) {
                        tempCivak = null;
                        break OUTER;
                    }
                }
                default -> System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
    
    // METHOD PERTAMA YANG AKAN DIJALANKAN PADA SAAT PROGRAM DIJALANKAN
    public static void main(String[] args) {
        OUTER:
        while (true) {
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
            switch (menu) {
                case 1 -> {
                    System.out.print("\n$ Masukkan Username: ");
                    String username = input.nextLine();
                    System.out.print("$ Masukkan Password: ");
                    String password = input.nextLine();
                    System.out.println("");
                    if (User.login(username, password)) {
                        if (tempAdmin != null) {
                            menuAdmin();
                        } else if (tempPetugas != null) {
                            menuPetugas();
                        } else if (tempCivak != null) {
                            menuCivitasAkademik();
                        }
                    } else {
                        System.out.println("\nusername atau password salah!\n");
                    }
                }
                case 2 -> {
                    String namaPendaftar, emailPendaftar, nomorTeleponPendaftar, peranPendaftar, usernamePendaftar, passwordPendaftar;
                    System.out.print("\n$ Masukkan Nama Anda: ");
                    namaPendaftar = input.nextLine();
                    System.out.print("$ Masukkan Email Anda: ");
                    emailPendaftar = input.nextLine();
                    System.out.print("$ Masukkan Nomor Telepon Anda: ");
                    nomorTeleponPendaftar = input.nextLine();
                    System.out.print("$ Masukkan Peran Anda: ");
                    peranPendaftar = input.nextLine();
                    while (true) {
                        System.out.print("$ Masukkan Username Akun: ");
                        usernamePendaftar = input.nextLine();
                        if (usernameNotExists(usernamePendaftar)) {
                            break;
                        } else {
                            System.out.println("\nMasukkan username yang lain!\n");
                        }
                    }
                    System.out.print("$ Masukkan Password Akun: ");
                    passwordPendaftar = input.nextLine();
                    kumpulanCivitasAkademik.add(
                            new CivitasAkademik(UUID.randomUUID().toString(), namaPendaftar, emailPendaftar, nomorTeleponPendaftar, usernamePendaftar, passwordPendaftar, peranPendaftar)
                    );
                }
                case 3 -> {
                    System.out.println("\nKeluar Aplikasi...\n");
                    System.out.println("Terima Kasih");
                    break OUTER;
                }
                default -> System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
}
