public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            double gajiNormal = upahPerJam * 40;
            double gajiLembur = (totalJam - 40) * upahPerJam * 1.5;
            return gajiNormal + gajiLembur;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nUpah/Jam: " + upahPerJam + "\nTotal Jam: " + totalJam + "\nPendapatan: Rp. " + gaji();
    }
}

