package analisisPercobaan;

public class Main {
    public static void main(String[] args) {
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);
    //Object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup",100);
    hero1.display();
    //upcasting
    Hero heroUp = (Hero)hero1;
    heroUp.display();
    //System.out.println(heroUp.getType()); //ini error
    //Object dgn class Hero
    Hero heroReg = new Hero("Boy",100);
    heroReg.display();
    //downcasting
    //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    //heroDown.display();
    //heroUp dikembalikan ke hero1
    HeroIntel hero2 = (HeroIntel) heroUp;
    hero2.display(); //ini berhasil downcasting

    //HeroAgility hero3 = (HeroAgility) heroUp; hero3.display();
    }
}


//no 5
/*package analisisPercobaan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan kelas HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        // Upcasting dari HeroIntel ke Hero
        Hero heroUpIntel = (Hero) hero1;
        heroUpIntel.display();

        // Membuat objek dengan kelas HeroMagic
        HeroMagic heroMagic = new HeroMagic("Gandalf", 150);
        heroMagic.display();

        // Upcasting dari HeroMagic ke Hero
        Hero heroUpMagic = (Hero) heroMagic;
        heroUpMagic.display();

        // Downcasting dari Hero ke HeroMagic
        HeroMagic heroMagicDown = (HeroMagic) heroUpMagic;
        heroMagicDown.display();
        System.out.println("Hero Power: " + heroMagicDown.getPower());

        // Downcasting dari Hero ke HeroIntel (Akan berhasil karena awalnya memang HeroIntel)
        HeroIntel hero2 = (HeroIntel) heroUpIntel;
        hero2.display();

        // Downcasting yang akan gagal
        // HeroAgility hero3 = (HeroAgility) heroUpMagic; // Akan menyebabkan ClassCastException
        // hero3.display();
    }
}
 */
    