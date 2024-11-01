package Model;

import java.util.List;

public class MatkulAjar {

    private MataKuliah mataKuliah;
    private List<PresensiStaff> presensiStaff;

    public MatkulAjar(MataKuliah mataKuliah, List<PresensiStaff> presensiStaff) {
        this.mataKuliah = mataKuliah;
        this.presensiStaff = presensiStaff;
    }

    public MataKuliah getMatkul() {
        return mataKuliah;
    }

    public void setMatkul(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return "Matkul: " + mataKuliah + "\nPresensi Staff: " + presensiStaff;
    }
    
}