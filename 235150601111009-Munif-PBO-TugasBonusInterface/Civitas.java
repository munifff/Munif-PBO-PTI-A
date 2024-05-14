public abstract class Civitas {
    private String nama;
    private int umur;
    private boolean jeniskelamin;
    public Civitas(String nama, int umur, boolean genre) {
        this.nama = nama;
        this.umur = umur;
        this.jeniskelamin = genre;
    }
    public abstract void naikLift();

    public void makanDiKantin(String kantin) {
        System.out.println("sedang makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println("sedang main game di game corner");
    }
}