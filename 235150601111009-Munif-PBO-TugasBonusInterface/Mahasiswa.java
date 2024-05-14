public class Mahasiswa extends Civitas implements PesertaKelas{
    private String nim;
    private double ipk;
    private int golUkt;

    public Mahasiswa(String nama, int umur, boolean jeniskelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jeniskelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    @Override
    public void naikLift() {
        System.out.println("naik Lift");
    }

    public void ngerjaInTugas() {
        System.out.println("Mahasiswa sedang mengerjakan tugasnya");
    }

    public void pasrah() {
        System.out.println("Mahasiswa pasrah yallah yallah");
    }

    public void mengikutiOrganisasi(String nama) {
        System.out.println("Mahasiswa sedang mengikuti organisasi " + nama);
    }

    public void presentasi() {
        System.out.println("Mahasiswa sedang melakukan presentasi");
    }

    public void masukKelas() {
        System.out.println("Mahasiswa masuk ruang kelas");
    }
}