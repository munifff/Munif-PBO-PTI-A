import java.util.Scanner;

public class KeretaApi {
    private String merkKereta;
    private String tipeKelas;
    private int kapasitasMuatan;
    private int kekuatanMesin;
    private boolean jenisKereta; // true untuk barang, false untuk komersial

    public KeretaApi(String merkKereta, String tipeKelas, int kapasitasMuatan, int kekuatanMesin, boolean jenisKereta) {
        this.merkKereta = merkKereta;
        this.tipeKelas = tipeKelas;
        this.kapasitasMuatan = kapasitasMuatan;
        this.kekuatanMesin = kekuatanMesin;
        this.jenisKereta = jenisKereta;
    }

    public void merk(String merk) {
        System.out.println("Kereta dengan merek : " + merk);
    }

    public void tipeKelas(String tipeKelas) {
        System.out.println("Kereta dengan tipe : " + tipeKelas);
    }

    public void kapasitasMuatan(int kapasitasMuatan) {
        System.out.println("Kereta dengan kapsitas muatan : " + kapasitasMuatan);
    }

    public void kekuatanMesin(int kekuatanMesin) {
        System.out.println("Kereta dengan mesin : " + kekuatanMesin);
    }

    public void jenisKereta(boolean jenisKereta) {
        System.out.println("Kereta dengan jenis : " + jenisKereta);
    }

    public void kecelakaan() {
        System.out.println("Kereta mengalami kecelakaan.");
    }

    public void bergerak(boolean maju) {
        if (maju) {
            System.out.println("Kereta bergerak maju.");
        } else {
            System.out.println("Kereta bergerak mundur.");
        }
    }

    public void berangkat() {
        System.out.println("Kereta berangkat dari stasiun.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan merk kereta: ");
        String merk = scanner.nextLine();

        System.out.print("Masukkan tipe kelas kereta: ");
        String tipeKelas = scanner.nextLine();

        System.out.print("Masukkan kapasitas muatan kereta: ");
        int kapasitasMuatan = scanner.nextInt();

        System.out.print("Masukkan kekuatan mesin kereta: ");
        int kekuatanMesin = scanner.nextInt();

        System.out.print("Apakah kereta untuk barang? (true/false): ");
        boolean jenisKereta = scanner.nextBoolean();

        KeretaApi kereta = new KeretaApi(merk, tipeKelas, kapasitasMuatan, kekuatanMesin, jenisKereta);
        
        kereta.merk(merk);
        kereta.tipeKelas(tipeKelas);
        kereta.kapasitasMuatan(kapasitasMuatan);
        kereta.kekuatanMesin(kekuatanMesin);
        kereta.jenisKereta(jenisKereta);
        kereta.kecelakaan();
        kereta.bergerak(true);
        kereta.berangkat();
        scanner.close();
    }
}
