import java.util.Scanner;

public class Tugas1 {
    static String[][] Pengguna = {{"Pengguna1", "password1"}, {"Pengguna2", "password2"}, {"Pengguna3", "password3"}};
    static boolean Masuk = false;
    static String Data_Pengguna = "";

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        while (true) {
            System.out.println(" ");
            System.out.println("========================");
            System.out.println("Haloooooo");
            System.out.println("Selamat Datang di Sistem Akademik Mahasiswa Universitas Konoha");
            System.out.println(" ");
            System.out.println("1. Daftar");
            System.out.println("2. Masuk");
            System.out.println("3. Keluar");
            System.out.println("4. Keluar dari SIAM Konoha");
            System.out.println("========================");
            System.out.println(" ");
            System.out.print("Pilih Menu Berapa? : ");
            int Pilih_Menu = Input.nextInt();
            
            switch (Pilih_Menu) {
                case 1:
                    Daftar(Input);
                    break;
                case 2:
                    Masuk(Input);
                    break;
                case 3:
                    Keluar();
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("========================");
                    System.out.println("Siap Keluarr...");
                    System.out.println("========================");
                    System.exit(0);
                default:
                    System.out.println("");
                    System.out.println("##########################");
                    System.out.println("Pilihan yang anda masukkan salah!. mohon isikan opsi menu dengan benar dan tepat !!!");
                    System.out.println("##########################");
                    System.out.println(" ");
            }
        }
    }

    static void Daftar(Scanner scanner) {
        System.out.println(" ");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Pendaftaran Username: ");
        String username = scanner.next();
        System.out.print("Masukkan Pendaftaran password: ");
        String password = scanner.next();
        System.out.println("----------------------------------");
        System.out.println(" ");

        boolean Pengguna_Terdaftar = false;
        for (String[] Pengguna1 : Pengguna) {
            if (Pengguna1[0].equals(username)) {
                Pengguna_Terdaftar = true;
                break;
            }
        }

        if (Pengguna_Terdaftar) {
            System.out.println(" ");
            System.out.println("========================");
            System.out.println("Sayang sekali");
            System.out.println("Nama pengguna sudah Terdaftar. Silakan pilih yang lain.");
            System.out.println("========================");
            System.out.println(" ");
        } else {
            String[][] Penggunabaru = new String[Pengguna.length + 1][2];
            for (int i = 0; i < Pengguna.length; i++) {
                Penggunabaru[i] = Pengguna[i];
            }
            Penggunabaru[Penggunabaru.length - 1] = new String[]{username, password};
            Pengguna = Penggunabaru;
            System.out.println(" ");
            System.out.println("========================");
            System.out.println("Penftaran Akun Sukses.");
            System.out.println("========================");
            System.out.println(" ");
        }
    }

    static void Masuk(Scanner Input) {
        if (Masuk) {
            System.out.println(" ");
            System.out.println("========================");
            System.out.println("Kamu sudah masuk.");
            System.out.println("========================");
            System.out.println(" ");
            return;
        }
        
        System.out.println(" ");
        System.out.println("========================");
        System.out.print("Masukkan username: ");
        String username = Input.next();
        System.out.print("Masukkan password: ");
        String password = Input.next();
        System.out.println("========================");
        System.out.println(" ");

        for (String[] PENGGUNA : Pengguna) {
            if (PENGGUNA[0].equals(username) && PENGGUNA[1].equals(password)) {
                Masuk = true;
                Data_Pengguna = username;
                System.out.println("========================");
                System.out.println("SELAMAT DATANG " + username);
                System.out.println("Login Anda Berhasil");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("|   Jumlah SKS    |     Nama Mata Kuliah       |        Dosen       |");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("|                 |                            |                    |");
                System.out.println("|                 |                            |                    |");
                System.out.println("|                 |                            |                    |");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("========================");
                return;
            }
        }
        System.out.println("========================");
        System.out.println("Username atau password salah.");
        System.out.println("Mohon masukkan dengan benar!");
        System.out.println("========================");
    }

    static void Keluar() {
        if (!Masuk) {
            System.out.println(" ");
            System.out.println("========================");
            System.out.println("Anda belum masuk.");
            System.out.println("========================");
            System.out.println(" ");
        } else {
            Masuk = false;
            Data_Pengguna = "";
            System.out.println(" ");
            System.out.println("========================");
            System.out.println("Anda Berhasil logout.");
            System.out.println("========================");
        }
    }
}
