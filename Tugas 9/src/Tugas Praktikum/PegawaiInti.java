package Praktikum;

public class PegawaiInti extends Karyawan implements Kontrak {
    private int durasiMagang;

    public PegawaiInti(int nomorRegistrasi, String nama, int gajiPerBulan, Invoice[] faktur, int durasiMagang) {
        super(nomorRegistrasi, nama, gajiPerBulan, faktur);
        this.durasiMagang = durasiMagang;
    }

    public int getDurasiMagang() {
        return durasiMagang;
    }

    public void setDurasiMagang(int durasiMagang) {
        this.durasiMagang = durasiMagang;
    }

    @Override
    public void displayEmployeeType() {
        System.out.println("Tipe Karyawan: Pegawai Inti");
    }

    @Override
    public int getDurasiKontrak() {
        return durasiMagang;
    }

    @Override
    public void setDurasiKontrak(int durasiKontrak) {
        this.durasiMagang = durasiKontrak;
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Menghadiri sesi pelatihan.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Durasi kontrak tersisa: " + durasiMagang + " bulan.");
    }

    @Override
    public String toString() {
        return super.toString() + ", durasiMagang=" + durasiMagang;
    }
}
