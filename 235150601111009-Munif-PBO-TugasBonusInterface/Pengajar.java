public class Pengajar implements PesertaKelas {
    @Override
    public void masukKelas() {
        System.out.println("Pengajar masuk ruangan kelas");
    }

    public void mengajar(String matkul) {
        System.out.println("sedang mengajar mata kuliah " + matkul);
    }

    public void mengasihTugas() {
        System.out.println("Pengajar sedang memberi tugas");
    }

    public void menilaiTugas() {
        System.out.println("Pengajar menilai tugas mahasiswa ");
    }
}