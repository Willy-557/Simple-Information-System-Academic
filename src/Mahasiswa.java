/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Mahasiswa extends Person{
    private String id;
    private int sks;
    private double ipk;
    private int angkatan;
    private String prodi;
    
    private MatkulMahasiswa[] matkul;
    private int matkul_count;

    public Mahasiswa(String id, int angkatan, String prodi, String nama, int usia) {
        super(nama, usia);
        this.id = id;
        this.sks = 0;
        this.ipk = 0;
        this.angkatan = angkatan;
        this.prodi = prodi; 
        this.matkul = new MatkulMahasiswa[10];
    }
    
    public void cetak() {
        System.out.println("Mahasiswa berhasil didaftarkan!");
        System.out.println("  ID           : " + id);
        System.out.println("  Nama         : " + getNama());
        System.out.println("  Usia         : " + getUsia());
        System.out.println("  Angkatan     : " + angkatan);
        System.out.println("  Prodi        : " + prodi);
        System.out.println("  SKS Diambil  : " + sks);
        System.out.println("  IPK          : " + ipk);
    }

    @Override
    public String toString() {
        return id + " | " + getNama() + " | Angkatan: " + angkatan + " | Prodi: " + prodi + " | SKS: " + sks + " | IPK: " + ipk;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public MatkulMahasiswa[] getMatkul() {
        return matkul;
    }

    public void setMatkul(MatkulMahasiswa[] matkul) {
        this.matkul = matkul;
    }

    public int getMatkul_count() {
        return matkul_count;
    }

    public void setMatkul_count(int matkul_count) {
        this.matkul_count = matkul_count;
    }
}
