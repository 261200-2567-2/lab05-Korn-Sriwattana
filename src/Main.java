// คลาสหลัก Lab05
public class Main {
    public static void main(String[] args) {
        // สร้างตัวละคร
        RPGCharacter swordman = new Swordman("Tul");
        RPGCharacter archer = new Archer("Pam");

        // สร้างอุปกรณ์เสริม
        Accessory shield = new ProtectiveAccessory("Shield", 5);
        Accessory boots = new AgilityAccessory("Boots", 3);

        // การใช้งาน
        swordman.equip(shield);
        swordman.showStatus();

        archer.equip(boots);
        archer.showStatus();
    }
}
