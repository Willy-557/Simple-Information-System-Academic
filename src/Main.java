
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        MataKuliah[] matkul = new MataKuliah[10];
        int ctr_arr_matkul = 0;
        int idMatkul = 1;
        
        Mahasiswa[] mhs = new Mahasiswa[10];
        int ctr_arr_mhs = 0;
        int idMhs = 1;
        
        Dosen[] dosen = new Dosen[10];
        int ctr_arr_dosen = 0;
        int idDosen = 1;
        
        StaffAkademik[] staff = new StaffAkademik[10];
        int ctr_arr_staff = 0;
        int idStaff = 1;
        
        while (true) {
            System.out.println("==============================\n" +
                                "          SIAKADU\n" +
                                "  Sistem Informasi Akademik\n" +
                                "==============================");
            System.out.println("");
            System.out.println("==============================\n" +
                                "          SIAKADU\n" +
                                "==============================\n" +
                                "  1. Kelola Mata Kuliah\n" +
                                "  2. Kelola Civitas\n" +
                                "  3. Aktivitas\n" +
                                "  4. Laporan\n" +
                                "  5. Exit\n" +
                                "==============================");
            
            System.out.print(">> ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            
            if (menu == 5) {
                System.out.println("=== TERIMA KASIH TELAH MENGGUNAKAN SIAKADU ===\n" +
                                    "  Total Mata Kuliah   : 3\n" +
                                    "  Total Mahasiswa     : 2\n" +
                                    "  Total Dosen         : 1\n" +
                                    "  Total Staf          : 1\n" +
                                    "==============================\n" +
                                    "Sampai jumpa!");
                break;
            }
            else if (menu > 5 || menu < 1) {
                System.out.println("Error");
                continue;
            }
            else {
                if (menu == 1) {
                    while (true) {
                        System.out.println("=== KELOLA MATA KULIAH ===\n" +
                                            "  1. Tambah Mata Kuliah\n" +
                                            "  2. Lihat Semua Mata Kuliah\n" +
                                            "  0. Kembali");
                        System.out.print(">> ");
                        int menu1 = scanner.nextInt();
                        scanner.nextLine();

                        if (menu1 == 0) {
                            break;
                        }
                        else if (menu1 > 2 || menu1 < 0) {
                            System.out.println("Error");
                            continue;
                        }
                        else {
                            if (menu1 == 1) {
                                System.out.print("Nama MK   : ");
                                String namaMatkul = scanner.nextLine();
                                
                                System.out.print("SKS       : ");
                                int sks = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Semester  : ");
                                int semester = scanner.nextInt();
                                scanner.nextLine();
                                
                                if (sks > 4 || sks < 1) {
                                    System.out.println("SKS harus antara 1-4. Masukkan ulang.");
                                    continue;
                                }
                                else {
                                    String id = "MK-00" + idMatkul;
                                    
                                    matkul[ctr_arr_matkul] = new MataKuliah(namaMatkul, sks, semester, id);
                                    matkul[ctr_arr_matkul].cetak();
                                    ctr_arr_matkul++;
                                    idMatkul++;
                                }
                            }
                            else if (menu1 == 2) {
                                if (ctr_arr_matkul == 0) {
                                    System.out.println("Masih belum menambahkan matkul");
                                }
                                else {
                                    System.out.println("=== SEMUA MATA KULIAH ===");
                                    for (int i = 0; i < ctr_arr_matkul; i++) {
                                        System.out.println(matkul[i].toString());
                                    }
                                }
                            }
                        }
                    }
                }
                else if (menu == 2) {
                    while (true) {
                        System.out.println("=== KELOLA CIVITAS ===\n" +
                                            "  1. Daftarkan Mahasiswa\n" +
                                            "  2. Daftarkan Dosen\n" +
                                            "  3. Daftarkan Staf Akademik\n" +
                                            "  4. Lihat Semua Civitas\n" +
                                            "  0. Kembali");

                        System.out.print(">> ");
                        int menu2 = scanner.nextInt();
                        scanner.nextLine();

                        if (menu2 == 0) {
                                break;
                            }
                        else if (menu2 > 4 || menu2 < 0) {
                            System.out.println("Error");
                            continue;
                        }
                        else {
                            if (menu2 == 1) {
                                System.out.print("Nama         : ");
                                String nama = scanner.nextLine();
                                
                                System.out.print("Usia         : ");
                                int usia = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Angkatan     : ");
                                int angkatan = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Program Studi: ");
                                String prodi = scanner.nextLine();
                                
                                String id = "MHS-00" + idMhs;
                                
                                mhs[ctr_arr_mhs] = new Mahasiswa(id, angkatan, prodi, nama, usia);
                                mhs[ctr_arr_mhs].cetak();
                                ctr_arr_mhs++;
                                idMhs++;
                            }
                            else if (menu2 == 2) {
                                System.out.print("Nama         : ");
                                String nama = scanner.nextLine();
                                
                                System.out.print("Usia         : ");
                                int usia = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Gelar        : ");
                                String gelar = scanner.nextLine();
                                
                                System.out.print("Bidang Ilmu  : ");
                                String bidangIlmu = scanner.nextLine();
                                
                                String id = "DSN-00" + idDosen;
                                
                                dosen[ctr_arr_dosen] = new Dosen(id, gelar, bidangIlmu, nama, usia);
                                dosen[ctr_arr_dosen].cetak();
                                ctr_arr_dosen++;
                                idDosen++;
                            }
                            else if (menu2 == 3) {
                                System.out.print("Nama         : ");
                                String nama = scanner.nextLine();
                                
                                System.out.print("Usia         : ");
                                int usia = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.print("Divisi       : ");
                                String divisi = scanner.nextLine();
                                
                                String id = "STF-00" + idDosen;
                                
                                staff[ctr_arr_staff] = new StaffAkademik(divisi, id, nama, usia);
                                staff[ctr_arr_staff].cetak();
                                ctr_arr_staff++;
                                idStaff++;
                            }
                            else if (menu2 == 4) {
                                System.out.println("=== SEMUA CIVITAS ===");
                                System.out.println("-- Mahasiswa --");
                                if (ctr_arr_mhs == 0) {
                                    System.out.println("Belum menambahkan Mahasiswa!");
                                }
                                else {
                                    for (int i = 0; i < ctr_arr_mhs; i++) {
                                    System.out.println(mhs[i].toString());
                                    }
                                }
                                System.out.println("");
                                System.out.println("-- Dosen --");
                                if (ctr_arr_dosen == 0) {
                                    System.out.println("Belum menambahkan Dosen!");
                                }
                                else {
                                    for (int i = 0; i < ctr_arr_dosen; i++) {
                                        System.out.println(dosen[i].toString());
                                    }
                                }
                                System.out.println("");
                                System.out.println("-- Staff Akademik --");
                                if (ctr_arr_staff == 0) {
                                    System.out.println("Belum menambahkan Staff Akademik!");
                                }
                                else {
                                    for (int i = 0; i < ctr_arr_staff; i++) {
                                        System.out.println(staff[i].toString());
                                    }
                                }  
                                System.out.println("");
                            }
                        }
                    }   
                }
                else if (menu == 3) {
                    while (true) {
                        System.out.println("=== AKTIVITAS ===\n" +
                                            "  1. Mahasiswa Ambil Mata Kuliah\n" +
                                            "  2. Dosen Mengajar Mata Kuliah\n" +
                                            "  3. Staf Proses Dokumen Mahasiswa\n" +
                                            "  0. Kembali");

                        System.out.print(">> ");
                        int menu3 = scanner.nextInt();
                        scanner.nextLine();

                        if (menu3 == 0) {
                            break;
                        }
                        else if (menu3 > 3 || menu3 < 0) {
                            System.out.println("Error");
                            continue;
                        }
                        else {
                            if (menu3 == 1) {
                                if (ctr_arr_mhs == 0) {
                                    System.out.println("Belum menambahkan Mahasiswa!");
                                }
                                else {
                                    System.out.println("Daftar Mahasiswa:");
                                    for (int i = 0; i < ctr_arr_mhs; i++) {
                                        System.out.println(mhs[i].toString());
                                    }
                                    
                                    System.out.print("Pilih ID Mahasiswa : ");
                                    String idMhsDicari = scanner.nextLine();
                                    
                                    Mahasiswa ditemukanMhs = null;
                                    boolean mhsDitemukan = false;
                                    int noIndexMhs = -1;
                                    for (int i = 0; i < ctr_arr_mhs; i++) {
                                        if (mhs[i].getId().equals(idMhsDicari)) {
                                            ditemukanMhs = mhs[i];
                                            mhsDitemukan = true;
                                            noIndexMhs = i;
                                            break;
                                        }
                                    }
                                    
                                    if(!mhsDitemukan) {
                                        System.out.println("Mahasiswa dengan ID '" + idMhsDicari + "' tidak ditemukan!");
                                    }
                                    else {
                                        if (ctr_arr_matkul == 0) {
                                           System.out.println("Daftar Mata Kuliah masih kosong!");
                                        }
                                        else {
                                            for (int i = 0; i < ctr_arr_matkul; i++) {
                                                System.out.println(matkul[i].toString());
                                            }

                                            System.out.print("Pilih ID MK : ");
                                            String IDMKDicari = scanner.nextLine();

                                            boolean MKDitemukan = false;
                                            MataKuliah ditemukanMK = null;
                                            for (int i = 0; i < ctr_arr_matkul; i++) {
                                                if (matkul[i].getId().equals(IDMKDicari)) {
                                                    MKDitemukan = true;
                                                    ditemukanMK = matkul[i];
                                                    break;
                                                }
                                            }

                                            if (!MKDitemukan) {
                                                System.out.println("Mata Kuliah dengan ID '" + IDMKDicari + "' tidak ditemukan!");
                                            }
                                            else {
                                                int totalSks = mhs[noIndexMhs].getSks() + ditemukanMK.getSks();
                                                if (totalSks <= 24) {
                                                    boolean pengecekan = mhs[noIndexMhs].cekPengambilanMK(ditemukanMK.getNamaMatkul());
                                                    
                                                    if (pengecekan) {
                                                        System.out.println("  " + mhs[noIndexMhs].getNama() + " sudah mengambil " + ditemukanMK.getNamaMatkul() + " sebelumnya!");
                                                    }
                                                    else {
                                                        mhs[noIndexMhs].setSks(ditemukanMK.getSks());
                                                        mhs[noIndexMhs].setMatkul(ditemukanMK);
                                                    }
                                                }
                                                else {
                                                    System.out.println("  Total SKS melebihi batas! Maksimal 24 SKS.");
                                                    System.out.println("  SKS saat ini: " + mhs[noIndexMhs].getSks() + ", MK ini: " + ditemukanMK.getSks() + " SKS.");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else if (menu3 == 2) {
                                if (ctr_arr_dosen == 0) {
                                    System.out.println("Belum menambahkan Dosen!");
                                }
                                else {
                                    System.out.println("Daftar Dosen:");
                                    for (int i = 0; i < ctr_arr_dosen; i++) {
                                        System.out.println(dosen[i].toString());
                                    }
                                    
                                    System.out.print("Pilih ID Dosen : ");
                                    String idDosenDicari = scanner.nextLine();
                                    
                                    Dosen ditemukanDosen = null;
                                    boolean dosenDitemukan = false;
                                    int noIndexDosen = -1;
                                    for (int i = 0; i < ctr_arr_dosen; i++) {
                                        if (dosen[i].getId().equals(idDosenDicari)) {
                                            ditemukanDosen = dosen[i];
                                            dosenDitemukan = true;
                                            noIndexDosen = i;
                                            break;
                                        }
                                    }
                                    
                                    if(!dosenDitemukan) {
                                        System.out.println("Dosen dengan ID '" + idDosenDicari + "' tidak ditemukan!");
                                    }
                                    else {
                                        if (ctr_arr_matkul == 0) {
                                           System.out.println("Daftar Mata Kuliah masih kosong!");
                                        }
                                        else {
                                            for (int i = 0; i < ctr_arr_matkul; i++) {
                                                System.out.println(matkul[i].toString());
                                            }

                                            System.out.print("Pilih ID MK : ");
                                            String IDMKDicari = scanner.nextLine();

                                            boolean MKDitemukan = false;
                                            MataKuliah ditemukanMK = null;
                                            for (int i = 0; i < ctr_arr_matkul; i++) {
                                                if (matkul[i].getId().equals(IDMKDicari)) {
                                                    MKDitemukan = true;
                                                    ditemukanMK = matkul[i];
                                                    break;
                                                }
                                            }

                                            if (!MKDitemukan) {
                                                System.out.println("Mata Kuliah dengan ID '" + IDMKDicari + "' tidak ditemukan!");
                                            }
                                            else {
                                                boolean pengecekan = dosen[noIndexDosen].cekMatkulDiajar(ditemukanMK.getNamaMatkul());

                                                if (pengecekan) {
                                                    System.out.println("  " + dosen[noIndexDosen].getNama() + " sudah mengajar " + ditemukanMK.getNamaMatkul() + "! ");
                                                }
                                                else {
                                                    dosen[noIndexDosen].setMatkulYangDiajar(ditemukanMK);
                                                    dosen[noIndexDosen].setMKDiajar(1);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }    
                }
            }
        }
    }
    
}
