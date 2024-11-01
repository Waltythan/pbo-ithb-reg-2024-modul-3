package Model;

import java.util.List;

public class MatkulAmbil {
    
    private MataKuliah mataKuliah;
    private List<Presensi> listPresensi;
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(MataKuliah mataKuliah, List<Presensi> listPresensi, int n1, int n2, int n3) {
        this.mataKuliah = mataKuliah;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setPresensi(List<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MataKuliah: " + mataKuliah + "\nPresensi: " + listPresensi + "\nN1: " + n1 + "\nN2: " + n2 + "\nN3: " + n3;
    }

}