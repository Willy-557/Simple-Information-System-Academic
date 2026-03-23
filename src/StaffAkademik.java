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
    private String divisi
    private String id;

    public StaffAkademik(String divisi, String id, String nama, int usia) {
        super(nama, usia);
        this.dokDiproses = 0;
        this.divisi = divisi;
        this.id = id;
    }
    
    public void cetak() {
        System.out.println("Staf berhasil didaftarkan!");
        System.out.println("  ID               : " + id);
        System.out.println("  Nama             : " + getNama());
        System.out.println("  Usia             : " + getUsia());
        System.out.println("  Divisi           : " + divisi);
        System.out.println("  Dokumen Diproses : " + dokDiproses);
    }

    public int getDokDiproses() {
        return dokDiproses;
    }

    public void setDokDiproses(int dokDiproses) {
        this.dokDiproses = dokDiproses;
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
    
    
}
