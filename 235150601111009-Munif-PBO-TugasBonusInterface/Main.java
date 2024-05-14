public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Devan", 27, true, "123456789", 5000000.0);
        Mahasiswa mahasiswa = new Mahasiswa("AL-Gifari", 19, false, "123456787656", 3.2, 4);
        Resepsionis resepsionis = new Resepsionis("Wahyu", 48, false, 287892, "Resepsionis", 30000.0);
        Pengajar pengajar = new Pengajar();
        Asprak asprak = new Asprak();

        Civitas civitasDosen = dosen;
        Civitas civitasMahasiswa = mahasiswa;
        Civitas civitasResepsionis = resepsionis;
        PesertaKelas pesertaKelasPengajar = pengajar;
    }
}