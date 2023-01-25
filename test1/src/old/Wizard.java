package old;

public class Wizard extends Player {
    public int manaLevel;
    public String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.element = element;
        this.manaLevel = manaLevel;
    }

    @Override
    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + manaLevel + " " + element;
    }

    @Override
    public void levelUp() {
        super.level++;
    }

    @Override
    public boolean doDamage() {
        if (manaLevel >= 10) {
            manaLevel -= 10;
            return true;
        } else {
            return false;
        }
    }
}
