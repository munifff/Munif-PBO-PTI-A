import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pelanggan {
    private int nomorPelanggan;
    private String nama;
    private int saldo;
    private int jenisRekening;
    private int pin;  // Menambahkan atribut pin untuk Pelanggan

    public Pelanggan(int nomorPelanggan, String nama, int saldo, int jenisRekening, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.jenisRekening = jenisRekening;
        this.pin = pin;
    }

    public int getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getJenisRekening() {
        return jenisRekening;
    }

    public int getPin() {
        return pin;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

public class SwalayanProgram {
    private static Map<Integer, Pelanggan> databasePelanggan = new HashMap<>();
    private static int failedAuthAttempts = 0;
    private static int activePelanggan = -1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Selamat Datang di Swalayan Tiny ===");
            System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Top-up");
            System.out.println("4. Bayar");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    daftar();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    topUp();
                    break;
                case 4:
                    bayar();
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1-5.");
                    break;
            }
        }
    }

    private static void daftar() {
        System.out.print("Masukkan nomor pelanggan (10 digit): ");
        int nomorPelanggan = scanner.nextInt();
        scanner.nextLine();

        if (String.valueOf(nomorPelanggan).length() != 10) {
            System.out.println("Nomor pelanggan harus terdiri dari 10 digit.");
            return;
        }

        if (databasePelanggan.containsKey(nomorPelanggan)) {
            System.out.println("Nomor pelanggan sudah terdaftar.");
            return;
        }

        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan saldo awal: ");
        int saldo = scanner.nextInt();
        scanner.nextLine();

        if (saldo < 10000) {
            System.out.println("Saldo minimal harus Rp10.000.");
            return;
        }

        System.out.print("Masukkan jenis rekening (38/56/74): ");
        int jenisRekening = scanner.nextInt();
        scanner.nextLine();

        // if (jenisRekening != 38 && jenisRekening != 56 && jenisRekening != 74) {
        //     System.out.println("Jenis rekening tidak valid.");
        //     return;
        // }

        System.out.print("Masukkan PIN (4 digit): ");
        int pin = scanner.nextInt();
        scanner.nextLine();

        if (String.valueOf(pin).length() != 4) {
            System.out.println("PIN harus terdiri dari 4 digit.");
            return;
        }

        Pelanggan pelanggan = new Pelanggan(nomorPelanggan, nama, saldo, jenisRekening, pin);
        databasePelanggan.put(nomorPelanggan, pelanggan);
        System.out.println("Pelanggan berhasil didaftarkan.");
    }

    private static void login() {
        System.out.print("Masukkan nomor pelanggan (10 digit): ");
        int nomorPelanggan = scanner.nextInt();
        scanner.nextLine();

        if (String.valueOf(nomorPelanggan).length() != 10) {
            System.out.println("Nomor pelanggan harus terdiri dari 10 digit.");
            return;
        }

        System.out.print("Masukkan PIN: ");
        int pin = scanner.nextInt();
        scanner.nextLine();

        Pelanggan pelanggan = databasePelanggan.get(nomorPelanggan);
        if (pelanggan == null || pin != pelanggan.getPin()) {
            System.out.println("Autentikasi gagal. Nomor pelanggan atau PIN salah.");
            failedAuthAttempts++;
            if (failedAuthAttempts >= 3) {
                System.out.println("Anda telah melakukan 3x kesalahan autentikasi. Akun diblokir.");
                databasePelanggan.remove(nomorPelanggan);
            }
        } else {
            activePelanggan = nomorPelanggan;
            System.out.println("Autentikasi berhasil. Selamat datang, " + pelanggan.getNama() + "!");
        }
    }

    private static void topUp() {
        if (activePelanggan == -1) {
            System.out.println("Silakan login terlebih dahulu.");
            return;
        }

        Pelanggan pelanggan = databasePelanggan.get(activePelanggan);
        System.out.print("Masukkan jumlah top-up: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        pelanggan.setSaldo(pelanggan.getSaldo() + jumlah);
        System.out.println("Top-up berhasil. Saldo saat ini: Rp" + pelanggan.getSaldo());
    }

    private static void bayar() {
        if (activePelanggan == -1) {
            System.out.println("Silakan login terlebih dahulu.");
            return;
        }

        Pelanggan pelanggan = databasePelanggan.get(activePelanggan);
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        if (jumlah > pelanggan.getSaldo()) {
            System.out.println("Saldo tidak mencukupi untuk melakukan pembelian.");
            return;
        }

        int cashback = 0;
        if (jumlah > 1000000) {
            if (pelanggan.getJenisRekening() == 38) {
                cashback = (int) (jumlah * 0.05);
            } else if (pelanggan.getJenisRekening() == 56) {
                cashback = (int) (jumlah * 0.07);
            } else if (pelanggan.getJenisRekening() == 74) {
                cashback = (int) (jumlah * 0.10);
            }
        } else {
            if (pelanggan.getJenisRekening() == 56 || pelanggan.getJenisRekening() == 74) {
                cashback = (int) (jumlah * 0.02);
            }
        }

        int totalPembayaran = jumlah - cashback;
        pelanggan.setSaldo(pelanggan.getSaldo() - totalPembayaran);
        System.out.println("Pembayaran berhasil. Total yang harus dibayar: Rp" + totalPembayaran);
        System.out.println("Cashback yang didapat: Rp" + cashback);
        System.out.println("Saldo saat ini: Rp" + pelanggan.getSaldo());
    }
}
