/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class MataKuliah {
    private String namaMatkul;
    private int sks;
    private int semester;
    private String id;

    public MataKuliah(String namaMatkul, int sks, int semester, String id) {
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.semester = semester;
        this.id = id;
    }
    
    public void cetak() {
        System.out.println("Mata kuliah berhasil ditambahkan!");
        System.out.println("  ID        : " + id);
        System.out.println("  Nama      : " + namaMatkul);
        System.out.println("  SKS       : " + sks);
        System.out.println("  Semester  : " + semester);
    }

    @Override
    public String toString() {
        return id + " | " + namaMatkul + " | " + sks + " SKS | Sem " + semester;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
