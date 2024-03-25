import java.util.Scanner;

public class Main {
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

        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan informasi bus");
        System.out.println("2. Cek keadaan bus (mogok/kecelakaan)");
        System.out.print("Pilih menu: ");
        int menu = input.nextInt();

        if (menu == 1) {
            bus.merk(merk);
            bus.warna(warna);
            bus.bahanBakar(bahanBakar);
            bus.kapasitas(kapasitas);
            bus.kecepatan(kecepatan);
        } else if (menu == 2) {
            System.out.println("\nMenu:");
            System.out.println("1. Bus mogok");
            System.out.println("2. Bus mengalami kecelakaan");
            System.out.print("Pilih menu: ");
            int menu2 = input.nextInt();

            if (menu2 == 1) {
                bus.mogok();
            } else if (menu2 == 2) {
                bus.kecelakaan();
            }
        }

        input.close();
    }
}
