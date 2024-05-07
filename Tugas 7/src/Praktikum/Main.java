package praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AbstrackKue[] kueArray = new AbstrackKue[20];

        // 10 JENIS KUE PESANAN
        kueArray[0] = new KuePesenan("Kue Pukis", 1000, 2.5);
        kueArray[1] = new KuePesenan("Kue Nastar", 1500, 1.8);
        kueArray[2] = new KuePesenan("Kue Brownise", 1500, 1.8);
        kueArray[3] = new KuePesenan("Kue Lapis Legit", 1500, 1.8);
        kueArray[4] = new KuePesenan("Kue Putri Salju", 1500, 1.8);
        kueArray[5] = new KuePesenan("Kue Lidah Kucing", 1500, 1.8);
        kueArray[6] = new KuePesenan("Kue Apem", 1500, 1.8);
        kueArray[7] = new KuePesenan("Kue Bolu Kukus", 1500, 1.8);
        kueArray[8] = new KuePesenan("Kue Serabi", 1500, 1.8);
        kueArray[9] = new KuePesenan("Kue Nastar", 1500, 1.8);
        
        // 10 JENIS KUE JADI
        kueArray[10] = new KueJadi("Kue Bolu", 2000, 3);
        kueArray[11] = new KueJadi("Kue Leker", 2000, 3);
        kueArray[12] = new KueJadi("Kue Bingka", 2000, 3);
        kueArray[13] = new KueJadi("Kue Putu", 2000, 3);
        kueArray[14] = new KueJadi("Kue Cucur", 2000, 3);
        kueArray[15] = new KueJadi("Kue Cenil", 2000, 3);
        kueArray[16] = new KueJadi("Kue Dadar Gulung", 2000, 3);
        kueArray[17] = new KueJadi("Kue Getuk", 2000, 3);
        kueArray[18] = new KueJadi("Kue Bolu", 2000, 3);
        kueArray[19] = new KueJadi("Kue Lapis", 2500, 2);

        // KUE BASI
        kueArray[12] = new KueBasi("Kue Bika Ambon", 3000, 5);
        kueArray[13] = new KueBasi("Kue Cromboloni", 3500, 4);

        int option;
        do {
            System.out.println("SELAMAT DATANG!");
            System.out.println("Silahkan pilih Menu!");
            System.out.println("1. Tampilkan semua kue beserta jenisnya");
            System.out.println("2. Hitung total harga semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari KueBasi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            option = input.nextInt();
            System.out.println(" ");

            switch (option) {
                case 1:
                    tampilkanSemuaKue(kueArray);
                    break;
                case 2:
                    hitungTotalHargaSemuaKue(kueArray);
                    break;
                case 3:
                    hitungTotalHargaDanBeratKuePesanan(kueArray);
                    break;
                case 4:
                    hitungTotalHargaDanJumlahKueJadi(kueArray);
                    break;
                case 5:
                    tampilkanKueDenganHargaTerbesar(kueArray);
                    break;
                case 6:
                    hitungTotalHargaDanLamaHariKueBasi(kueArray);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih kembali.");
            }
        } while (option != 0);

        input.close();
    }

    private static void tampilkanSemuaKue(AbstrackKue[] kueArray) {
        System.out.println("Daftar Kue");
        for (AbstrackKue kue : kueArray) {
            System.out.println("- " + kue.getNama() + " (" + kue.getClass().getSimpleName() + ")");
        }
        System.out.println(" ");
    }

    private static void hitungTotalHargaSemuaKue(AbstrackKue[] kueArray) {
        int totalHarga = 0;
        for (AbstrackKue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println(" ");
        System.out.println("Total harga semua jenis kue: Rp." + totalHarga + ",00");
        System.out.println(" ");
    }

    private static void hitungTotalHargaDanBeratKuePesanan(AbstrackKue[] kueArray) {
        int totalHarga = 0;
        double totalBerat = 0;
        for (AbstrackKue kue : kueArray) {
            if (kue instanceof KuePesenan) {
                totalHarga += kue.hitungHarga();
                totalBerat += ((KuePesenan) kue).getBerat();
            }
        }
        System.out.println(" ");
        System.out.println("Total harga Kue Pesanan: Rp." + totalHarga +",00");
        System.out.println("Total berat Kue Pesanan: " + totalBerat + " gram");
        System.out.println(" ");
    }

    private static void hitungTotalHargaDanJumlahKueJadi(AbstrackKue[] kueArray) {
        int totalHarga = 0;
        double totalJumlah = 0;
        for (AbstrackKue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHarga += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println(" ");
        System.out.println("Total harga KueJadi: Rp. " + totalHarga + ",00");
        System.out.println("Total jumlah KueJadi: " + totalJumlah + " biji");
        System.out.println(" ");
    }

    private static void tampilkanKueDenganHargaTerbesar(AbstrackKue[] kueArray) {
        AbstrackKue kueTerbesar = kueArray[0];
        for (AbstrackKue kue : kueArray) {
            if (kue.hitungHarga() > kueTerbesar.hitungHarga()) {
                kueTerbesar = kue;
            }
        }
        System.out.println(" ");
        System.out.println("Informasi Kue dengan harga terbesar adalah kue");
        System.out.println(kueTerbesar);
        System.out.println(" ");
    }

    private static void hitungTotalHargaDanLamaHariKueBasi(AbstrackKue[] kueArray) {
        int totalHarga = 0;
        int totalLamaHari = 0;
        for (AbstrackKue kue : kueArray) {
            if (kue instanceof KueBasi) {
                totalHarga += kue.hitungHarga();
                totalLamaHari += ((KueBasi) kue).getLamaHari();
            }
        }
        System.out.println(" ");
        System.out.println("Total harga Kue Basi: Rp." + totalHarga + ",00");
        System.out.println("Total lama hari Kue Basi: " + totalLamaHari);
        System.out.println(" ");
    }
}
