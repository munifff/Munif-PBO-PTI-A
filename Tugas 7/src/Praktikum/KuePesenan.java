package praktikum;

public class KuePesenan extends AbstrackKue{
    private double berat;

    public KuePesenan(String nama, int harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    public double getBerat() {
        return berat;
    }
}

class KueJadi extends AbstrackKue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }
}

