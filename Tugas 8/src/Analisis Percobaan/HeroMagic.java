package analisisPercobaan;

public class HeroMagic extends Hero {
    private String power = "Magic";

    public HeroMagic(String name, double health) {
        super(name, health);
    }

    public String getPower() {
        return power;
    }

    @Override
    public void display() {
        System.out.println(getName() + " is a " + power + " hero.");
    }
}
