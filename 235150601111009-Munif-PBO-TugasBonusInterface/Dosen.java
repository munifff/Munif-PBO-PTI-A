public class Dosen extends Civitas implements PesertaKelas {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jeniskelamin, String nip, double gaji) {
        super(nama, umur, jeniskelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    @Override
    public void masukKelas() {
        System.out.println("Dosen jalan masuk ruang kelas");
    }

    @Override
    public void naikLift() {
        System.out.println("Naik sedang naik lift");
    }

    public void ikutPenelitian() {
        System.out.println("Dosen ikut melakukan penelitian");
    }
}