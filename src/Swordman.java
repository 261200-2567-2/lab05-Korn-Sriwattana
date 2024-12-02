public class Swordman extends MeleeCharacter {
    public Swordman(String name) {
        super(name, 100, 20, 15, 10);
    }

    @Override
    public void meleeAttack() {
        System.out.println(name + " uses Sword Attack!");
    }
}
