package TDD;

public class Unit {

    private int health;
    private final int damage;

    public int getHealth() {
        return health;
    }
    public Unit(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int takeDamage(int damage ) {
        health -= damage;
        return  health;
    }

    public void addDamage(Unit unitTom) {
        unitTom.takeDamage(damage);
    }
}
