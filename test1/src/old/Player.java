package old;

public abstract class Player {
    public int hp, level;
    public String type, weapon;

    public Player(int hp, int level, String type, String weapon){
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.weapon = weapon;
    }

    public abstract String getFullInfo();
    public abstract void levelUp();
    public abstract boolean doDamage();
}
