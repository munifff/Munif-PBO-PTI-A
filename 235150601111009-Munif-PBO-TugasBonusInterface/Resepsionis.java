public class Resepsionis extends Civitas {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public Resepsionis(String nama, int umur, boolean jeniskelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jeniskelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    @Override
    public void naikLift() {
        System.out.println("Naik Lift");
    }

    public void melayani() {
        System.out.println("Resepsionis sedang melakukan pelayanan");
    }

    public void melapor() {
        System.out.println("Resepsionis sedang melakukan pelaporan");
    }
}