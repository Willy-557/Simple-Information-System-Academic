/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class MatkulMahasiswa {
    private MataKuliah mataKuliah;

    public MatkulMahasiswa(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
}
