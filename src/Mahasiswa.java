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

    public Mahasiswa(String id, int sks, double ipk, int angkatan, String prodi, String nama, int usia) {
        super(nama, usia);
        this.id = id;
        this.sks = 0;
        this.ipk = 0;
        this.angkatan = angkatan;
        this.prodi = prodi;
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
    
    
    
}
