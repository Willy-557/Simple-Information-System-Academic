/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class IsiDokumen {
    private String namaDokumen;
    private Mahasiswa namaMahasiswa;

    public IsiDokumen(String namaDokumen, Mahasiswa namaMahasiswa) {
        this.namaDokumen = namaDokumen;
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getNamaDokumen() {
        return namaDokumen;
    }

    public void setNamaDokumen(String namaDokumen) {
        this.namaDokumen = namaDokumen;
    }

    public Mahasiswa getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(Mahasiswa namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }
}
