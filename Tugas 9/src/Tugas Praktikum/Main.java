package Praktikum;

public class Main {
    public static void main(String[] args) {
        // objek PegawaiTetap
        Invoice[] faktur1 = { new Invoice("Laptop", 1, 15000000) };
        PegawaiTetap pegawaiTetap = new PegawaiTetap(1, "Al ghifari", 25000000, faktur1, 5000000);

        // objek PegawaiInti
        Invoice[] faktur2 = { new Invoice("Buku", 10, 50000) };
        PegawaiInti pegawaiInti = new PegawaiInti(2, "Wahyu", 5000000, faktur2, 6);

        // Panggil semua metod
        Karyawan.welcomeMessage();
        
        System.out.println(pegawaiTetap);
        pegawaiTetap.displayEmployeeType();
        System.out.println("Bonus: " + pegawaiTetap.getBonus());

        System.out.println(pegawaiInti);
        pegawaiInti.displayEmployeeType();
        pegawaiInti.attendTrainingSession();
        pegawaiInti.trackContractDuration();
    }
}
