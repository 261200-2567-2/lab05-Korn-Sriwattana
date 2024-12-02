public class Archer extends RangedCharacter {
    public Archer(String name) {
        super(name, 70, 30, 10, 15); // กำหนดค่าพื้นฐานสำหรับ Archer
    }

    @Override
    public void rangedAttack() {
        System.out.println(name + " performs a ranged attack using a bow!");
    }
}
