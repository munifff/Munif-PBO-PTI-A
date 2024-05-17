package Praktikum;

public class Invoice implements Bayar {
    private String namaProduk;
    private int kuantitas;
    private int hargaPerItem;

    public Invoice(String namaProduk, int kuantitas, int hargaPerItem) {
        this.namaProduk = namaProduk;
        this.kuantitas = kuantitas;
        this.hargaPerItem = hargaPerItem;
    }

    @Override
    public double jumlahYangHarusDibayar() {
        return kuantitas * hargaPerItem;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public int getHargaPerItem() {
        return hargaPerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "namaProduk='" + namaProduk + '\'' +
                ", kuantitas=" + kuantitas +
                ", hargaPerItem=" + hargaPerItem +
                ", total=" + jumlahYangHarusDibayar() +
                '}';
    }
}
