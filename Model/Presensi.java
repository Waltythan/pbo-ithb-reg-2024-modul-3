package Model;

public class Presensi {
    private String tanggal;
    private Kehadiran status;

    public Presensi(String tanggal, Kehadiran status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Kehadiran getStatus() {
        return status;
    }

    public void setStatus(Kehadiran status) {
        this.status = status;
    }

    public boolean isHadir() {
        return this.status == Kehadiran.HADIR;
    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + "\nStatus: " + status;
    }

}