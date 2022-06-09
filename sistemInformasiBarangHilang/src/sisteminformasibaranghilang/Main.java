package sisteminformasibaranghilang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;
import java.util.Date;
import java.text.SimpleDateFormat;
import models.Admin;
import models.Barang;
import models.BarangHilang;
import models.BarangTemu;
import models.CivitasAkademik;
import models.PengambilanBarang;
import models.Petugas;
import models.User;
import static models.User.login;

/*
TAMBAHIN MENU REQUEST BARANG HILANg
TAMBAHIN MENU CLAIM BARANG TEMU -> INI UDAH NGGAK SIH? YANG REQUEST PENGAMBILAN BARANG
PROPERTY LOKASI UNTUK CLASS BARANG TEMU DAN HILANG DIBUAT OPSIONAL -> udah
 
HANYA SARAN DARI BANG ADE, BOLEH DIIKUTIN ATAU TIDAK
BARANG TEMU JIKA TIDAK DIAMBIL DALAM 7 X 24 JAM, MAKA BARANG BERHAK DI CLAIM SIAPAPUN
 */
public class Main {

    // Objek class Admin
    public static Admin admin1 = new Admin("9004e59e-9c6c-4ea4-bfcf-c6bdbb715ae0", "Faisal Husada",
            "faisalhusada@gmail.com", "+62878555675", "admin1", "admin1");
    public static Admin admin2 = new Admin("98f9ccdd-037d-4876-8e9b-6d415ea7e38f", "Arsy Madya Budianto",
            "arsymadyabudianto@gmail.com", "+62855555315", "admin2", "admin2");

    // Objek class Petugas
    public static Petugas petugas1 = new Petugas("ade924a7-8a88-4306-aea8-6cfac4743e58", "Muhammad Rizky Hari Nugroho",
            "rizkyHari@gmail.com", "+62899555609", "petugas1", "petugas1");
    public static Petugas petugas2 = new Petugas("093aed94-8946-4158-873a-046b4ac0e503", "Muhammad Rizeky Rahmatullah",
            "rizekyRahmatullah@gmail.com", "+62898555975", "petugas2", "petugas2");

    // Objek class CivitasAkademik
    public static CivitasAkademik civitasAkademik1 = new CivitasAkademik("862e13c6-32b8-4b73-8c17-ffc8c6d98440",
            "Tjeng, Ivan Cahyadi", "ivanCahyadi@gmail.com", "+62878555471", "civak1", "civak1", "Mahasiswa");
    public static CivitasAkademik civitasAkademik2 = new CivitasAkademik("7fecd532-03ab-4676-9566-2a77b1ae3b66",
            "Ihsan Magribi", "ihsanmagribi@gmail.com", "+62878555141", "civak2", "civak2", "Mahasiswa");

    // Objek class BarangHilang
    public static BarangHilang barangHilang1 = new BarangHilang("1097a65b-6a0a-4d5e-b23a-2e7f64461171", "Kunci Motor",
            "Kunci Kendaraan", "Hitam", "Parkiran Gedung Baru", "28-08-2021", "862e13c6-32b8-4b73-8c17-ffc8c6d98440");
    public static BarangHilang barangHilang2 = new BarangHilang("5a57efa4-1a50-422b-975c-3a698714c79e", "Laptop",
            "Elektronik", "Abu Metalik", "Ruang C307", "22-04-2022", "7fecd532-03ab-4676-9566-2a77b1ae3b66");

    // Objek class BarangTemu
    public static BarangTemu barangTemu1 = new BarangTemu("e4cdcac4-7bc3-47ff-88d9-8fbebe36a4a5", "Buku", "ATK", "Biru",
            "Ruang D404", "17-04-2022", "ade924a7-8a88-4306-aea8-6cfac4743e58");
    public static BarangTemu barangTemu2 = new BarangTemu("5078b9f4-6c2d-4eea-bfa6-f8378113d06d", "Smartphone Vivo",
            "Elektronik", "Hitam", "Ruang Perpustakaan", "21-02-2022", "093aed94-8946-4158-873a-046b4ac0e503");

    // Objek class Barang untuk ArrayList kumpulanBarang
    public static Barang barang1 = new Barang("ea6ca7ad-ee97-473b-9af5-6b11120b5ed0", "Buku", "ATK", "Merah",
            "Ruang C304");
    public static Barang barang2 = new Barang("be9ff41c-7cc7-451e-8548-4c0db14c4659", "Jaket", "Pakaian", "Krem",
            "Ruang C308");

    // Objek class PengambilanBarang
    public static PengambilanBarang pengambilanBarang1 = new PengambilanBarang("97da6ec4-e135-42f2-9f35-d0769523fd9f",
            "01-06-2022", "ea6ca7ad-ee97-473b-9af5-6b11120b5ed0", "862e13c6-32b8-4b73-8c17-ffc8c6d98440");
    public static PengambilanBarang pengambilanBarang2 = new PengambilanBarang("a2f41841-1f70-4422-a322-3625e7179f1d",
            "05-06-2022", "be9ff41c-7cc7-451e-8548-4c0db14c4659", "7fecd532-03ab-4676-9566-2a77b1ae3b66");

    // ArrayList yang menampung Admin
    public static ArrayList<Admin> kumpulanAdmin = new ArrayList<>(Arrays.asList(admin1, admin2));

    // ArrayList yang menampung Petugas
    public static ArrayList<Petugas> kumpulanPetugas = new ArrayList<>(Arrays.asList(petugas1, petugas2));

    // ArrayList yang menampung Civitas Akademik
    public static ArrayList<CivitasAkademik> kumpulanCivitasAkademik = new ArrayList<>(
            Arrays.asList(civitasAkademik1, civitasAkademik2));

    // ArrayList untuk menampung Admin, Petugas, dan CivitasAkademik
    public static ArrayList<User> kumpulanUser = new ArrayList<>(
            Arrays.asList(admin1, admin2, petugas1, petugas2, civitasAkademik1, civitasAkademik2));

    // ArrayList untuk menampung barang hilang dan barang temu
    public static ArrayList<Barang> kumpulanBarang = new ArrayList<>(
            Arrays.asList(barangHilang1, barangHilang2, barangTemu1, barangTemu2, barang1, barang2));

    // ArrayList yang menampung Barang Hilang
    public static ArrayList<BarangHilang> kumpulanBarangHilang = new ArrayList<>(
            Arrays.asList(barangHilang1, barangHilang2));

    // ArrayList yang menampung Barang Temu
    public static ArrayList<BarangTemu> kumpulanBarangTemu = new ArrayList<>(Arrays.asList(barangTemu1, barangTemu2));

    // ArrayList yang menampung PengambilanBarang
    public static ArrayList<PengambilanBarang> kumpulanPengambilanBarang = new ArrayList<>(
            Arrays.asList(pengambilanBarang1, pengambilanBarang2));

    // ArrayList yang menampung request pengambilan barang
    public static ArrayList<PengambilanBarang> kumpulanRequestPengambilanBarang = new ArrayList<>();

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

    // Tanggal hari ini
    public static String stringDate = dateFormat.format(date);

    public static boolean usernameNotExists(String username) {
        for (User user : kumpulanUser) {
            if (user.getUsernamePengguna().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static String getNamaPemilikDariIdPemilik(String idPemilik) {
        for (CivitasAkademik civak : kumpulanCivitasAkademik) {
            if (civak.getIdPengguna().equals(idPemilik)) {
                return civak.getNamaPengguna();
            }
        }
        return "Unknown";
    }

    public static String getNamaPenemuDariIdPenemu(String idPenemu) {
        for (Petugas petugas : kumpulanPetugas) {
            if (petugas.getIdPengguna().equals(idPenemu)) {
                return petugas.getNamaPengguna();
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

    public static String getNamaPengambilDariIdPengambil(String idPengambil) {
        for (User user : kumpulanUser) {
            if (user.getIdPengguna().equals(idPengambil)) {
                return user.getNamaPengguna();
            }
        }
        return "Unknown";
    }

    public static void manajemenPengambilanBarang() {
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$           Manajemen Pengambilan Barang         $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Pengambilan Barang             $");
            System.out.println("$ [2] Ubah Data Pengambilan Barang               $");
            System.out.println("$ [3] Hapus Data Pengambilan Barang              $");
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
            System.out.println("");
            int nomorPengambilanBarang;
            if (menu == 1) {
                tempPetugas.tampilPengambilanBarang();
            } else if (menu == 2) {
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
                        System.out.println("$ [2] Id Barang                                  $");
                        System.out.println("$ [3] Id Pengambil                               $");
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
                        System.out.println("");
                        if (menu > 0 && menu < 4) {
                            tempPetugas.ubahBarangTemu(menu, nomorPengambilanBarang);
                            System.out.println("\nData pengambilan barang berhasil diubah!\n");
                        } else if (menu == 4) {
                            break;
                        } else {
                            System.out.println("\nPilihan tidak ditemukan!\n");
                        }
                    }
                } else {
                    System.out.println("\nNomor petugas tidak ditemukan!\n");
                }
            } else if (menu == 3) {
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
            } else if (menu == 4) {
                break;
            } else {

            }
        }
    }

    public static void manajemenBarangTemu() {
        while (true) {
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
            int nomorBarangTemu;
            if (menu == 1) {
                tempPetugas.tampilBarangTemu();
            } else if (menu == 2) {
                String idBarangTemu, namaBarangTemu, jenisBarangTemu, warnaBarangTemu, lokasiBarangTemu,
                        tanggalBarangTemu;
                idBarangTemu = UUID.randomUUID().toString();
                System.out.print("$ Masukkan nama barang temu: ");
                namaBarangTemu = input.nextLine();
                System.out.print("$ Masukkan jenis barang temu: ");
                jenisBarangTemu = input.nextLine();
                System.out.print("$ Masukkan warna barang temu: ");
                warnaBarangTemu = input.nextLine();
                System.out.print("$ Masukkan lokasi barang temu: ");
                lokasiBarangTemu = input.nextLine();
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
                    if (menu == 1) {
                        tanggalBarangTemu = stringDate;
                        break;
                    } else if (menu == 2) {
                        System.out.print("$ Masukkan tanggal barang temu(DD-MM-YYYY): ");
                        tanggalBarangTemu = input.nextLine();
                        break;
                    } else {
                        System.out.println("\nPilihan tidak ditemukan!\n");
                    }
                }
                tempPetugas.tambahBarangTemu(idBarangTemu, namaBarangTemu, jenisBarangTemu, warnaBarangTemu,
                        lokasiBarangTemu, tanggalBarangTemu, tempPetugas.getIdPengguna());
            } else if (menu == 3) {
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
                if (nomorBarangTemu >= 0 && nomorBarangTemu < kumpulanBarangTemu.size()) {
                    while (true) {
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$                Ubah Barang Temu                $");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("$ [1] Nama                                       $");
                        System.out.println("$ [2] Jenis                                      $");
                        System.out.println("$ [3] Warna                                      $");
                        System.out.println("$ [4] Lokasi Temu                                $");
                        System.out.println("$ [5] Tanggal Temu                               $");
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
                            tempPetugas.ubahBarangTemu(menu, nomorBarangTemu);
                            System.out.println("\nData barang temu berhasil diubah!\n");
                        } else if (menu == 6) {
                            break;
                        } else {
                            System.out.println("\nMenu tidak ditemukan!\n");
                        }
                    }
                } else {
                    System.out.println("\nNomor petugas tidak ditemukan!\n");
                }
            } else if (menu == 4) {
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
                if (nomorBarangTemu >= 0 && nomorBarangTemu < kumpulanBarangTemu.size()) {
                    tempPetugas.hapusBarangTemu(nomorBarangTemu);
                    System.out.println("Data barang temu berhasil dihapus!\n");
                } else {
                    System.out.println("\nNomor barang temu tidak ditemukan!\n");
                }
            } else if (menu == 5) {
                break;
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    public static void manajemenBarangHilang() {
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$             Manajemen Barang Hilang            $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Barang Hilang                  $");
            System.out.println("$ [2] Hapus Data Barang Hilang                   $");
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
            int nomorBarangHilang;
            if (menu == 1) {
                tempPetugas.tampilBarangHilang();
            } else if (menu == 2) {
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
                if (nomorBarangHilang >= 0 && nomorBarangHilang < kumpulanBarangHilang.size()) {
                    tempPetugas.hapusBarangHilang(nomorBarangHilang);
                    System.out.println("Data barang hilang berhasil dihapus!\n");
                } else {
                    System.out.println("\nData barang hilang tidak ditemukan!\n");
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    public static void manajemenCivitasAkademik() {
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
            if (menu == 1) {
                tempPetugas.tampilCivitasAkademik();
            } else if (menu == 2) {
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
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    public static void manajemenPetugas() {
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
            if (menu == 1) {
                tempAdmin.tampilPetugas();
            } else if (menu == 2) {
                String idPetugas, namaPetugas, emailPetugas, nomorTeleponPetugas, usernamePetugas, passwordPetugas;
                idPetugas = UUID.randomUUID().toString();
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
                tempAdmin.registerPetugas(idPetugas, namaPetugas, emailPetugas, nomorTeleponPetugas,
                        usernamePetugas, passwordPetugas);
                kumpulanUser.add(new Petugas(idPetugas, namaPetugas, emailPetugas, nomorTeleponPetugas,
                        usernamePetugas, passwordPetugas));
                System.out.println("\nData petugas berhasil ditambahkan!\n");
            } else if (menu == 3) {
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
            } else if (menu == 4) {
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
            } else if (menu == 5) {
                break;
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    public static void menuVerifikasiPengambilanBarang() {
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
            System.out.println("");
            int nomorRequest;
            if (menu == 1) {
                tempPetugas.tampilRequestPengambilanBarang();
            } else if (menu == 2) {
                tempPetugas.tampilRequestPengambilanBarang();
                while (true) {
                    try {
                        System.out.print("$ Masukkan nomor request: ");
                        nomorRequest = Integer.parseInt(input.nextLine()) - 1;
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("\nNomor request berupa bilangan bulat!\n");
                    }
                }
                System.out.println("");
                if (nomorRequest >= 0 && nomorRequest < kumpulanRequestPengambilanBarang.size()) {
                    kumpulanPengambilanBarang.add(kumpulanRequestPengambilanBarang.get(nomorRequest));
                    kumpulanRequestPengambilanBarang.remove(kumpulanRequestPengambilanBarang.get(nomorRequest));
                    for (BarangTemu barangTemu : kumpulanBarangTemu) {
                        if (barangTemu.getIdBarang().equals(kumpulanRequestPengambilanBarang.get(nomorRequest).getIdBarang())) {
                            kumpulanBarangTemu.remove(barangTemu);
                        }
                    }
                } else {
                    System.out.println("\nNomor request tidak ditemukan!\n");
                }
            } else if (menu == 3) {

            } else if (menu == 4) {
                break;
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    public static void menuCivitasAkademik() {
        while (true) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$              Menu Civitas Akademik             $");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("$ [1] Tampil Data Barang Hilang                  $");
            System.out.println("$ [2] Tampil Data Barang Temu                    $");
            System.out.println("$ [3] Lapor Barang Hilang                        $");
            System.out.println("$ [4] Ubah Data Barang Hilang                    $");
            System.out.println("$ [5] Request Pengambilan Barang                 $");
            System.out.println("$ [6] Tampil Profile                             $");
            System.out.println("$ [7] Ubah Profile                               $");
            System.out.println("$ [8] Logout                                     $");
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
            if (menu == 1) {
                tempCivak.tampilBarangHilang();
            } else if (menu == 2) {
                tempCivak.tampilBarangTemu();
            } else if (menu == 3) {
                String idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang;
                while (true) {
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
                    if (menu == 1 || menu == 2) {
                        idBarangHilang = UUID.randomUUID().toString();
                        System.out.print("$ Masukkan nama barang hilang: ");
                        namaBarangHilang = input.nextLine();
                        System.out.print("$ Masukkan jenis barang hilang: ");
                        jenisBarangHilang = input.nextLine();
                        System.out.print("$ Masukkan warna barang hilang: ");
                        warnaBarangHilang = input.nextLine();
                        while (true) {
                            int menuTanggal;
                            System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$                     Tanggal                    $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$ [1] Hari ini                                   $");
                            System.out.println("$ [2] Custom                                     $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            while (true) {
                                try {
                                    System.out.print("$ Masukkan menu: ");
                                    menuTanggal = Integer.parseInt(input.nextLine());
                                    break;
                                } catch (NumberFormatException ex) {
                                    System.out.println("\nMenu berupa bilangan bulat!\n");
                                }
                            }
                            if (menuTanggal == 1) {
                                tanggalBarangHilang = stringDate;
                                break;
                            } else if (menuTanggal == 2) {
                                System.out.print("$ Masukkan tanggal barang hilang(DD-MM-YYYY): ");
                                tanggalBarangHilang = input.nextLine();
                                break;
                            } else {
                                System.out.println("\nPilihan tidak ditemukan!\n");
                            }
                        }
                        if (menu == 1) {
                            System.out.print("\n$ Masukkan lokasi barang hilang: ");
                            lokasiBarangHilang = input.nextLine();
                            tempCivak.tambahBarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, tanggalBarangHilang, tempCivak.getIdPengguna());
                        } else {
                            tempCivak.tambahBarangHilang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, tanggalBarangHilang, tempCivak.getIdPengguna());
                        }
                        System.out.println("\nBarang hilang berhasil dilaporkan\n");
                        System.out.println("");
                        break;
                    } else if (menu == 3) {
                        break;
                    } else {
                        System.out.println("\nMenu tidak ditemukan!\n");
                    }
                }
            } else if (menu == 4) {
                int nomorBarangHilang;
                System.out.println("Ubah data barang hilang yang user ini laporkan saja");
                tempCivak.tampilBarangHilang();
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
                if (nomorBarangHilang >= 0 && nomorBarangHilang < kumpulanBarangHilang.size()) {
                    if (kumpulanBarangHilang.get(nomorBarangHilang).getIdPemilik().equals(tempCivak.getIdPengguna())) {
                        while (true) {
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$               Ubah Barang Hilang               $");
                            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                            System.out.println("$ [1] Nama                                       $");
                            System.out.println("$ [2] Jenis                                      $");
                            System.out.println("$ [3] Warna                                      $");
                            System.out.println("$ [4] Lokasi Hilang                              $");
                            System.out.println("$ [5] Tanggal Hilang                             $");
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
                                tempCivak.ubahBarangHilang(menu, nomorBarangHilang);
                                System.out.println("\nData barang temu berhasil diubah!\n");
                            } else if (menu == 6) {
                                break;
                            } else {
                                System.out.println("\nMenu tidak ditemukan!\n");
                            }
                        }
                    } else {
                        System.out.println("\nAnda tidak dapat mengubah data milik orang lain!\n");
                    }
                } else {
                    System.out.println("\nNomor petugas tidak ditemukan!\n");
                }
            } else if (menu == 5) {
                int nomorRequest;
                tempCivak.tampilBarangTemu();
                while (true) {
                    try {
                        System.out.print("$ Masukkan nomor barang: ");
                        nomorRequest = Integer.parseInt(input.nextLine()) - 1;
                        break;
                    } catch (NumberFormatException ex) {
                        System.out.println("\nNomor barang berupa bilangan bulat!\n");
                    }
                }
                System.out.println("");
                if (nomorRequest >= 0 && nomorRequest < kumpulanBarangTemu.size()) {
                    tempCivak.requestAmbilBarang(UUID.randomUUID().toString(), stringDate, kumpulanBarangTemu.get(nomorRequest).getIdBarang(), tempCivak.getIdPengguna());
                    System.out.println("\nData request berhasil ditambahkan!\n");
                } else {
                    System.out.println("\nNomor barang tidak ditemukan!\n");
                }
            } else if (menu == 6) {
                tempCivak.tampilProfileCivitasAkademik();
                System.out.println("");
            } else if (menu == 7) {
                tempCivak.tampilProfileCivitasAkademik();
                System.out.println("");
                while (true) {
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
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
            } else if (menu == 8) {
                System.out.print("$ Konfirmasi logout(y/n): ");
                String konfirmasi = input.nextLine();
                System.out.println("");
                if (konfirmasi.equals("y")) {
                    tempCivak = null;
                    break;
                }
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    public static void menuPetugas() {
        while (true) {
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
            if (menu == 1) {
                manajemenCivitasAkademik();
            } else if (menu == 2) {
                manajemenBarangHilang();
            } else if (menu == 3) {
                manajemenBarangTemu();
            } else if (menu == 4) {
                manajemenPengambilanBarang();
            } else if (menu == 5) {
                menuVerifikasiPengambilanBarang();
            } else if (menu == 6) {
                System.out.print("$ Konfirmasi logout(y/n): ");
                String konfirmasi = input.nextLine();
                System.out.println("");
                if (konfirmasi.equals("y")) {
                    tempPetugas = null;
                    break;
                }
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }

        }
    }

    public static void menuAdmin() {
        while (true) {
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
            if (menu == 1) {
                manajemenPetugas();
            } else if (menu == 2) {
                tempAdmin.tampilCivitasAkademik();
            } else if (menu == 3) {
                tempAdmin.tampilBarangHilang();
            } else if (menu == 4) {
                tempAdmin.tampilBarangTemu();
            } else if (menu == 5) {
                tempAdmin.tampilPengambilanBarang();
            } else if (menu == 6) {
                System.out.print("$ Konfirmasi logout(y/n): ");
                String konfirmasi = input.nextLine();
                System.out.println("");
                if (konfirmasi.equals("y")) {
                    tempAdmin = null;
                    break;
                }
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }

    // METHOD PERTAMA YANG AKAN DIJALANKAN PADA SAAT PROGRAM DIJALANKAN
    public static void main(String[] args) {
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
            System.out.println("");
            if (menu == 1) {
                System.out.print("$ Masukkan Username: ");
                String username = input.nextLine();
                System.out.print("$ Masukkan Password: ");
                String password = input.nextLine();
                System.out.println("");
                if (login(username, password)) {
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
            } else if (menu == 2) {
                String namaPendaftar, emailPendaftar, nomorTeleponPendaftar, peranPendaftar, usernamePendaftar, passwordPendaftar;
                System.out.print("$ Masukkan Nama Anda: ");
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
                kumpulanCivitasAkademik.add(new CivitasAkademik(UUID.randomUUID().toString(), namaPendaftar, emailPendaftar, nomorTeleponPendaftar,
                        usernamePendaftar, passwordPendaftar, peranPendaftar));
            } else if (menu == 3) {
                System.out.println("\nKeluar Aplikasi...\n");
                System.out.println("Terima Kasih");
                break;
            } else {
                System.out.println("\nMenu tidak ditemukan!\n");
            }
        }
    }
}
