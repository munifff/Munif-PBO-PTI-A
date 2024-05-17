package Praktikum;

public class PegawaiTetap extends Karyawan {
    private int bonus;

    public PegawaiTetap(int nomorRegistrasi, String nama, int gajiPerBulan, Invoice[] faktur, int bonus) {
        super(nomorRegistrasi, nama, gajiPerBulan, faktur);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeType() {
        System.out.println("Tipe Karyawan: Pegawai Tetap");
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus=" + bonus;
    }
}
