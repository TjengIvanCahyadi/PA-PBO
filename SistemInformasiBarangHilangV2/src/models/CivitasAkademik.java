package models;

import java.util.ArrayList;
import sisteminformasibaranghilangv2.Main;
import static sisteminformasibaranghilangv2.Main.input;
import static sisteminformasibaranghilangv2.Main.kumpulanBarang;
import static sisteminformasibaranghilangv2.Main.kumpulanPengambilanBarang;

public class CivitasAkademik extends User{
    // PROPERTY
    private String peranCivitasAkademik;
    
    // CONSTRUCTOR
    public CivitasAkademik(String idCivitasAkademik, String namaCivitasAkademik, String emailCivitasAkademik, String nomorTeleponCivitasAkademik, String usernameCivitasAkademik, String passwordCivitasAkademik, String peranCivitasAkademik){
        super(idCivitasAkademik, namaCivitasAkademik, emailCivitasAkademik, nomorTeleponCivitasAkademik, usernameCivitasAkademik, passwordCivitasAkademik);
        this.peranCivitasAkademik = peranCivitasAkademik;
    }

    // GETTER
    public String getPeranCivitasAkademik() {
        return peranCivitasAkademik;
    }

    // SETTER
    public void setPeranCivitasAkademik(String peranCivitasAkademik) {
        this.peranCivitasAkademik = peranCivitasAkademik;
    }

    // YANG BISA DILAKUKAN CIVITAS AKADEMIK
    public void tampilProfileCivitasAkademik(){
        System.out.println("Nama            : " + namaUser);
        System.out.println("Email           : " + emailUser);
        System.out.println("Nomor Telepon   : " + nomorTeleponUser);
        System.out.println("Username        : " + usernameUser);
        System.out.println("Password        : " + passwordUser);
        System.out.println("Peran           : " + peranCivitasAkademik);
    }
    
    public void ubahCivitasAkademik(int diubah) {
        String dataCivitasAkademik;
        switch(diubah){
            case 1:
                System.out.print("$ Masukkan nama civitas akademik: ");
                dataCivitasAkademik = input.nextLine(); 
                namaUser = dataCivitasAkademik;
                break;
            case 2:
                System.out.print("$ Masukkan email civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                emailUser = dataCivitasAkademik;
                break;
            case 3:
                System.out.print("$ Masukkan nomor telepon civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                nomorTeleponUser = dataCivitasAkademik;
                break;
            case 4:
                while (true) {
                    System.out.print("$ Masukkan username civitas akademik: ");
                    dataCivitasAkademik = input.nextLine();
                    if (Main.usernameNotExists(dataCivitasAkademik)) {
                        usernameUser = dataCivitasAkademik;
                        break;
                    } else {
                        System.out.println("\nUsername telah digunakan!\n");
                    }
                }
            case 5:
                System.out.print("$ Masukkan password civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                passwordUser = dataCivitasAkademik;
                break;
            case 6:
                System.out.print("$ Masukkan peran civitas akademik: ");
                dataCivitasAkademik = input.nextLine();
                peranCivitasAkademik = dataCivitasAkademik;
                break;
        }
    }
    
    // TAMBAH BARANG DENGAN LOKASI
    public void tambahBarangHilang(String idBarangHilang, String namaBarangHilang, String jenisBarangHilang, String warnaBarangHilang, String lokasiBarangHilang, String tanggalBarangHilang, String idPemilik) {
        kumpulanBarang.add(new Barang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, lokasiBarangHilang, "Hilang", tanggalBarangHilang, idPemilik));
    }
    
    // TAMBAH BARANG TANPA LOKASI
    public void tambahBarangHilang(String idBarangHilang, String namaBarangHilang, String jenisBarangHilang, String warnaBarangHilang, String tanggalBarangHilang, String idPemilik) {
        kumpulanBarang.add(new Barang(idBarangHilang, namaBarangHilang, jenisBarangHilang, warnaBarangHilang, "", "Hilang", tanggalBarangHilang, idPemilik));
    }
    
    public void ubahBarangHilang(int diubah, String idUser) {
        for (Barang barang : kumpulanBarang) {
            if (barang.getIdUser().equals(idUser)) {
                String dataBarangTemu;
                switch(diubah){
                    case 1:
                        System.out.print("$ Masukkan nama barang hilang: ");
                        dataBarangTemu = input.nextLine();
                        barang.setNamaBarang(dataBarangTemu);
                        break;
                    case 2:
                        System.out.print("$ Masukkan jenis barang hilang: ");
                        dataBarangTemu = input.nextLine();
                        barang.setJenisBarang(dataBarangTemu);
                        break;
                    case 3:
                        System.out.print("$ Masukkan warna barang hilang: ");
                        dataBarangTemu = input.nextLine();
                        barang.setWarnaBarang(dataBarangTemu);
                        break;
                    case 4:
                        System.out.print("$ Masukkan lokasi hilang barang: ");
                        dataBarangTemu = input.nextLine();
                        barang.setLokasiBarang(dataBarangTemu);
                        break;
                    case 5:
                        System.out.print("$ Masukkan tanggal hilang barang: ");
                        dataBarangTemu = input.nextLine();
                        barang.setTanggalBarang(dataBarangTemu);
                        break;
                }
                break;
            }
        }
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
    
    public void requestAmbilBarang(String idPengambilanBarang, String tanggalPengambilanBarang, String idBarang, String idPengambil) {
        kumpulanPengambilanBarang.add(new PengambilanBarang(idPengambilanBarang, tanggalPengambilanBarang, "Pending", idBarang, idPengambil));
    }
}
