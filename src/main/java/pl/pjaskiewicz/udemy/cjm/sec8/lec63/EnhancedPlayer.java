package pl.pjaskiewicz.udemy.cjm.sec8.lec63;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 10;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        } else {
            System.out.println("Health value is out of the limits");
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //Reduce lives remaining for the player
        }
    }

    public int getHealth() {
        return this.hitPoints;
    }
}
