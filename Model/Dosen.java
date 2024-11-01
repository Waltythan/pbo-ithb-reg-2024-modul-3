package Model;

import java.util.List;

public abstract class Dosen extends Staff {

    private String departemen;
    private List<MatkulAjar> ajarMatkul;

    public Dosen(String nama, String alamat, String TTL, String telepon, String NIK, String departemen, List<MatkulAjar> ajarMatkul) {
        super(nama, alamat, TTL, telepon, NIK);
        this.departemen = departemen;
        this.ajarMatkul = ajarMatkul;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public List<MatkulAjar> getAjarMatkul() {
        return ajarMatkul;
    }

    public void setAjarMatkul(List<MatkulAjar> ajarMatkul) {
        this.ajarMatkul = ajarMatkul;
    }

    public int getUnit() {
        int unit = 0;
        for (MatkulAjar matkulAjar : ajarMatkul) {
            for (Presensi presensi : matkulAjar.getPresensiStaff()) {
                if (presensi.isHadir()) {
                    unit++;
                }
            }
        }
        return unit;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen + "\nAjar Matkul: " + ajarMatkul;
    }
    
}