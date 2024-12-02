// Interface สำหรับ Accessories
public interface Accessory {
    String Name();
    String OwnerName();
    void activated(RPGCharacter character);
    void deactivated(RPGCharacter character);
}
