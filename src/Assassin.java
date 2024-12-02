public class Assassin extends MeleeCharacter {
    public Assassin(String name) {
        super(name, 80, 25, 0, 20);
    }

    @Override
    public void meleeAttack() {
        System.out.println(name + " uses Dagger Attack!");
    }
}
