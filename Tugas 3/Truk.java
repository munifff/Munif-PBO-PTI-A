import java.util.Scanner;

public class Truk {
    private String merkTruk;
    private String warnaTruk;
    private String bahanBakar;
    private String fungsi;
    private int kapasitasMuatan;
    private int kekuatanMesin;

    public Truk(String merkTruk, String warnaTruk, String bahanBakar, String fungsi, int kapasitasMuatan, int kekuatanMesin) {
        this.merkTruk = merkTruk;
        this.warnaTruk = warnaTruk;
        this.bahanBakar = bahanBakar;
        this.fungsi = fungsi;
        this.kapasitasMuatan = kapasitasMuatan;
        this.kekuatanMesin = kekuatanMesin;
    }

    public void merk(String merk) {
        System.out.println("Truk dengan merk " + merk);
    }

    public void warna(String warna) {
        System.out.println("Truk dengan warna " + warna);
    }
    
    public void bahanBakar(String bahanBakar) {
        System.out.println("Truk dengan bahan bakar " + bahanBakar);
    }

    public void fungsi(String fungsi) {
        System.out.println("Truk berfungsi sebagai " + fungsi);
    }

    public void kapasitasMuatan(int kapasitasMuatan) {
        System.out.println("dengan kapasitas " + kapasitasMuatan);
    }

    public void kekuatanMesin(int kekuatanMesin) {
        System.out.println("dengan kekuatan mesin " + kekuatanMesin);
    }

    public void mengangkut(String barang) {
        System.out.println("Truk mengangkut barang: " + barang);
    }

    public void offroad() {
        System.out.println("Truk melakukan perjalanan offroad.");
    }

    public void mogok() {
        System.out.println("Truk mogok di tengah perjalanan.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan merk truk: ");
        String merk = scanner.nextLine();

        System.out.print("Masukkan warna truk: ");
        String warna = scanner.nextLine();

        System.out.print("Masukkan bahan bakar truk: ");
        String bahanBakar = scanner.nextLine();

        System.out.print("Masukkan fungsi truk: ");
        String fungsi = scanner.nextLine();

        System.out.print("Masukkan kapasitas muatan truk: ");
        int kapasitasMuatan = scanner.nextInt();

        System.out.print("Masukkan kekuatan mesin truk: ");
        int kekuatanMesin = scanner.nextInt();

        Truk truk = new Truk(merk, warna, bahanBakar, fungsi, kapasitasMuatan, kekuatanMesin);

        truk.mengangkut("Material konstruksi");
        truk.merk(merk);
        truk.warna(warna);
        truk.bahanBakar(bahanBakar);
        truk.fungsi(fungsi);
        truk.kapasitasMuatan(kapasitasMuatan);
        truk.kekuatanMesin(kekuatanMesin);
        truk.offroad();
        truk.mogok();
        scanner.close();
    }
}
