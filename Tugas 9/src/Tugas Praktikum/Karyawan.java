package Praktikum;

import java.util.Arrays;

public abstract class Karyawan implements Bayar {
    private int nomorRegistrasi;
    private String nama;
    private int gajiPerBulan;
    private Invoice[] faktur;

    public Karyawan(int nomorRegistrasi, String nama, int gajiPerBulan, Invoice[] faktur) {
        this.nomorRegistrasi = nomorRegistrasi;
        this.nama = nama;
        this.gajiPerBulan = gajiPerBulan;
        this.faktur = faktur;
    }

    public int getNomorRegistrasi() {
        return nomorRegistrasi;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPerBulan() {
        return gajiPerBulan;
    }

    public Invoice[] getFaktur() {
        return faktur;
    }

    public double totalJumlahFaktur() {
        return Arrays.stream(faktur)
                     .mapToDouble(Invoice::jumlahYangHarusDibayar)
                     .sum();
    }

    @Override
    public double jumlahYangHarusDibayar() {
        return gajiPerBulan - totalJumlahFaktur();
    }

    public static void welcomeMessage() {
        System.out.println("Selamat datang di sistem penggajian karyawan.");
    }

    public abstract void displayEmployeeType();

    @Override
    public String toString() {
        return "Karyawan{" +
                "nomorRegistrasi=" + nomorRegistrasi +
                ", nama='" + nama + '\'' +
                ", gajiPerBulan=" + gajiPerBulan +
                ", faktur=" + Arrays.toString(faktur) +
                ", totalGajiSetelahPotongan=" + jumlahYangHarusDibayar() +
                '}';
    }
}
