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

    public Dosen(String id, String gelar, String bidangIlmu, String nama, int usia) {
        super(nama, usia);
        this.id = id;
        this.gelar = gelar;
        this.bidangIlmu = bidangIlmu;
        this.MKDiajar = 0;
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
        this.MKDiajar = MKDiajar;
    }
    
    
    
}
