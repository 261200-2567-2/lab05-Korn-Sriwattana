// ตัวละครประเภท Melee
public abstract class MeleeCharacter implements RPGCharacter {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int speed;

    public MeleeCharacter(String name, int hp, int attack, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void equip(Accessory accessory) {
        accessory.activated(this);
    }

    @Override
    public void unequip(Accessory accessory) {
        accessory.deactivated(this);
    }

    @Override
    public void showStatus() {
        System.out.println("Character: " + name);
        System.out.println("HP: " + hp + ", Attack: " + attack + ", Defense: " + defense + ", Speed: " + speed);
    }

    public abstract void meleeAttack();
}
