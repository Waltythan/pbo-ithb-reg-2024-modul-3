package Model;

import java.util.List;

public class Sarjana extends Mahasiswa {

    private List<MataKuliah> mataKuliah;

    public Sarjana(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, List<MataKuliah> mataKuliah) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.mataKuliah = mataKuliah;
    }

    public List<MataKuliah> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(List<MataKuliah> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMata Kuliah: " + mataKuliah;
    }

}