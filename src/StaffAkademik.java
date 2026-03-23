/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class StaffAkademik extends Person {
    private int dokDiproses;
    private String divisi;
    private String id;
    
    private IsiDokumen[] dokumen;
    private int ctr_dok = 0;

    public StaffAkademik(String divisi, String id, String nama, int usia) {
        super(nama, usia);
        this.dokDiproses = 0;
        this.divisi = divisi;
        this.id = id;
        this.dokumen = new IsiDokumen[10];
    }
    
    public void cetak() {
        System.out.println("Staf berhasil didaftarkan!");
        System.out.println("  ID               : " + id);
        System.out.println("  Nama             : " + getNama());
        System.out.println("  Usia             : " + getUsia());
        System.out.println("  Divisi           : " + divisi);
        System.out.println("  Dokumen Diproses : " + dokDiproses);
    }

    @Override
    public String toString() {
        return id + " | " + getNama() + " | Divisi: " + divisi + " | Dokumen: " + dokDiproses;
    }

    public int getDokDiproses() {
        return dokDiproses;
    }

    public void setDokDiproses(int dokDiproses) {
        this.dokDiproses += dokDiproses;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IsiDokumen[] getDokumen() {
        return dokumen;
    }

    public void setDokumen(String namaDokumen, Mahasiswa mhs) {
        dokumen[ctr_dok] = new IsiDokumen(namaDokumen, mhs);
        ctr_dok++;
        
        System.out.println(getNama() + " memproses dokumen untuk " + mhs.getNama() + ":");
        System.out.println("Dokumen  : " + namaDokumen);
        System.out.println("Dokumen berhasil diproses! Total dokumen Sari: " + getDokDiproses());
    }

    public int getCtr_dok() {
        return ctr_dok;
    }

    public void setCtr_dok(int ctr_dok) {
        this.ctr_dok = ctr_dok;
    }
}
