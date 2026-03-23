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
    
}
