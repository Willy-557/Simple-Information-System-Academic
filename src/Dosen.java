/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Dosen extends Person{
    private String id;
    private String gelar;
    private String bidangIlmu;
    private int MKDiajar;
    
    private MataKuliah[] matkulYangDiajar;
    private int matkul_count = 0;

    public Dosen(String id, String gelar, String bidangIlmu, String nama, int usia) {
        super(nama, usia);
        this.id = id;
        this.gelar = gelar;
        this.bidangIlmu = bidangIlmu;
        this.MKDiajar = 0;
        this.matkulYangDiajar = new MataKuliah[20];
    }
    
    public void cetak() {
        System.out.println("Dosen berhasil didaftarkan!");
        System.out.println("  ID           : " + id);
        System.out.println("  Nama         : " + getNama());
        System.out.println("  Usia         : " + getUsia());
        System.out.println("  Gelar        : " + gelar);
        System.out.println("  Bidang Ilmu  : " + bidangIlmu);
        System.out.println("  MK Diajar    : " + MKDiajar);
    }

    @Override
    public String toString() {
        return id + " | " + getNama() + " | " + bidangIlmu + " | MK Diajar: " + MKDiajar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getBidangIlmu() {
        return bidangIlmu;
    }

    public void setBidangIlmu(String bidangIlmu) {
        this.bidangIlmu = bidangIlmu;
    }

    public int getMKDiajar() {
        return MKDiajar;
    }

    public void setMKDiajar(int MKDiajar) {
        this.MKDiajar += MKDiajar;
    }

    public MataKuliah[] getMatkulYangDiajar() {
        return matkulYangDiajar;
    }

    public void setMatkulYangDiajar(MataKuliah mk) {
        matkulYangDiajar[matkul_count] = mk;
        matkul_count++;
        
        System.out.println(getNama() + " ditugaskan mengajar: " + mk.getNamaMatkul());
        System.out.println("Total MK diajar " + getNama() + ": " + MKDiajar);
    }

    public int getMatkul_count() {
        return matkul_count;
    }

    public void setMatkul_count(int matkul_count) {
        this.matkul_count = matkul_count;
    }
    
    public boolean cekMatkulDiajar(String namaMatkul) {
        boolean cek = false;
        for (int i = 0; i < matkul_count; i++) {
            if (matkulYangDiajar[i].getNamaMatkul().equals(namaMatkul)) {
                cek = true;
            }
        }
        return cek;
    }
    
}
