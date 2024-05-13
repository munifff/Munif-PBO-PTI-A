public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return penjualan * komisi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Penjualan: " + penjualan + "\nBesaran Komisi: " + komisi + "\nPendapatan: Rp. " + gaji();
    }
}