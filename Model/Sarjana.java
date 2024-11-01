package Model;

import java.util.List;

public class Sarjana extends Mahasiswa {

    private List<MatKul> mataKuliah;

    public Sarjana(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, List<MatKul> mataKuliah) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.mataKuliah = mataKuliah;
    }

    public List<MatKul> getmataKuliah() {
        return mataKuliah;
    }

    public void setmataKuliah(List<MatKul> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMata Kuliah: " + mataKuliah;
    }

}