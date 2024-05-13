public class Main {
    public static void main(String[] args) {
        // Array untuk pegawai tetap
        Pegawai[] pegawaiTetap = {
            new PegawaiTetap("Wahyu", "1234567890", 6000000),
            new PegawaiTetap("Munif", "9876543210", 7500000),
            new PegawaiTetap("Mega", "5678901234", 6000000)
        };

        // Array untuk pegawai harian
        Pegawai[] pegawaiHarian = {
            new PegawaiHarian("Al-Gifari", "1122334455", 60000, 40),
            new PegawaiHarian("Nayla", "2233445566", 70000, 45),
            new PegawaiHarian("Ibadun", "3344556677", 65000, 38)
        };

        // Array untuk sales
        Pegawai[] sales = {
            new Sales("Alex", "4455667788", 200, 5000.0),
            new Sales("Isri", "5566778899", 150, 7000.0),
            new Sales("Davis", "6677889900", 180, 6000.0)
        };

        // Menampilkan informasi pegawai tetap
        System.out.println("\nData Pegawai Tetap:");
        System.out.println("===================");
        for (Pegawai p : pegawaiTetap) {
            System.out.println(p + "\n");
        }

        // Menampilkan informasi pegawai harian
        System.out.println("\nData Pegawai Harian:");
        System.out.println("====================");
        for (Pegawai p : pegawaiHarian) {
            System.out.println(p + "\n");
        }

        // Menampilkan informasi sales
        System.out.println("\nData Sales:");
        System.out.println("===========");
        for (Pegawai p : sales) {
            System.out.println(p + "\n");
        }
    }
}