// Interface สำหรับตัวละคร
public interface RPGCharacter {
    String getName();
    int getHp();
    void equip(Accessory accessory);
    void unequip(Accessory accessory);
    void showStatus();
}
