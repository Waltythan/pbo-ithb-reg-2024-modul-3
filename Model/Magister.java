package Model;

import java.util.List;

public class Magister extends Mahasiswa {
    private List<MatKul> mataKuliah;
    private String judulTesis;

    public Magister(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, List<MatKul> mataKuliah, String judulTesis) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.mataKuliah = mataKuliah;
        this.judulTesis = judulTesis;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMata Kuliah: " + mataKuliah + "\nJudul Penelitian Tesis: " + judulTesis;
    }

}