import java.util.Scanner;

public class Bus {
    private String merkBus;
    private String warnaBus;
    private String bahanBakar;
    private int kapasitas;
    private int kecepatan;

    public Bus(String merkBus, String warnaBus, String bahanBakar, int kapasitas, int kecepatan) {
        this.merkBus = merkBus;
        this.warnaBus = warnaBus;
        this.bahanBakar = bahanBakar;
        this.kapasitas = kapasitas;
        this.kecepatan = kecepatan;
    }

    public Bus(String merkBus, String warnaBus) {
        this(merkBus, warnaBus, "Solar", 50, 60);
    }

    public Bus(String merkBus, String warnaBus, String bahanBakar) {
        this(merkBus, warnaBus, bahanBakar, 50, 60);
    }

    public void merk(String merk) {
        System.out.println("Bus dengan merk " + merk);
    }

    public void warna(String warna) {
        System.out.println("Dengan warna " + warna);
    }

    public void bahanBakar(String bahanBakar) {
        System.out.println("Dengan bahan bakar " + bahanBakar);
    }

    public void kapasitas(int kapasitas) {
        System.out.println("Dengan kapasitas membawa " + kapasitas + " orang");
    }

    public void kecepatan(int kecepatan) {
        System.out.println("Dengan kecepatan " + kecepatan + " km/jam");
    }

    public void mencariNafkah(String tujuan) {
        System.out.println("Bus berangkat menuju destinasi pariwisata: " + tujuan);
    }

    public void mogok() {
        System.out.println("Bus mogok di tengah jalan.");
    }

    public void kecelakaan() {
        System.out.println("Bus mengalami kecelakaan.");
    }

    public void balapan(String lokasi) {
        System.out.println("Bus berpartisipasi dalam balapan di lokasi: " + lokasi);
    }
    
    public void nanjak() {
        System.out.println("Bus sedang menanjak.");
    }

    public void ngebut() {
        System.out.println("Bus sedang melaju dengan kecepatan tinggi.");
    }


    public Bus getBusInstance() {
        return this;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan merk bus: ");
        String merk = input.nextLine();

        System.out.print("Masukkan warna bus: ");
        String warna = input.nextLine();

        System.out.print("Masukkan bahan bakar bus: ");
        String bahanBakar = input.nextLine();

        System.out.print("Masukkan kapasitas bus: ");
        int kapasitas = input.nextInt();

        System.out.print("Masukkan kecepatan bus: ");
        int kecepatan = input.nextInt();

        Bus bus = new Bus(merk, warna, bahanBakar, kapasitas, kecepatan);

        bus.merk(merk);
        bus.warna(warna);
        bus.bahanBakar(bahanBakar);
        bus.kapasitas(kapasitas);
        bus.kecepatan(kecepatan);
        bus.mencariNafkah("Bali");
        bus.mogok();
        bus.kecelakaan();
        bus.balapan("Sirkuit Sentul");
        bus.nanjak();
        bus.ngebut();

        Bus bus2 = new Bus("Scania", "Merah");
        Bus bus3 = new Bus("Volvo", "Biru", "Solar");

        input.close();
    }
}
