package praktikum;

abstract class AbstrackKue {
    private String nama;
    private double harga;

    public AbstrackKue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama: " + nama + ", Harga: " + hitungHarga();
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}

