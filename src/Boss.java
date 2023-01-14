public class Boss {

    private int health;
    private int damage;
    private String protection;

    public Boss(int health, int damage, String protection) {
        this.health = health;
        this.damage = damage;
        this.protection = protection;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getProtection() {
        return protection;
    }
}
