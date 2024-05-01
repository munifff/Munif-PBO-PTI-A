import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia lakiMenikah = new Manusia("Wahyu", true, "236176318318", true);
        Manusia perempuanMenikah = new Manusia("Nayla", false, "283718737817", true);
        Manusia belumMenikah = new Manusia("Al Ghifari", true, "1763817938173", false);

        System.out.println("Manusia:");
        System.out.println("1. " + lakiMenikah.toString());
        System.out.println("2. " + perempuanMenikah.toString());
        System.out.println("3. " + belumMenikah.toString());

        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Alex", true, "165150600000007", false, "165150600000001", 2.9);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Isri", true, "165150600000003", false, "165150600000002", 3.2);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Davis", true, "165150600000001", false, "165150600000003", 3.9);

        System.out.println("\nMahasiswa FILKOM:");
        System.out.println("1. " + mahasiswa1.toString());
        System.out.println("2. " + mahasiswa2.toString());
        System.out.println("3. " + mahasiswa3.toString());

        Pekerja pekerja1 = new Pekerja("Dandy", true, "23456782312", true, 9000, LocalDate.of(2022, 2, 1), 2);
        Pekerja pekerja2 = new Pekerja("Yuven", true, "425184312341", true, 7000, LocalDate.of(2015, 9, 1), 0);
        Pekerja pekerja3 = new Pekerja("Eka", true, "2131273891", true, 8000, LocalDate.of(2004, 3, 2), 10);

        System.out.println("\nPekerja:");
        System.out.println("a. " + pekerja1.toString());
        System.out.println("b. " + pekerja2.toString());
        System.out.println("c. " + pekerja3.toString());

        Manager manager = new Manager("Devan", true, "1236812837", true, 7500, LocalDate.of(2016, 2, 5), 2, "Technology");

        System.out.println("\nManager:");
        System.out.println(manager.toString());
    }
}