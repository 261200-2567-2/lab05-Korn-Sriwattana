// อุปกรณ์เสริมประเภท Protective
public class ProtectiveAccessory implements Accessory {
    private String name;
    private String ownerName;
    private int defenseBoost;

    public ProtectiveAccessory(String name, int defenseBoost) {
        this.name = name;
        this.defenseBoost = defenseBoost;
    }

    @Override
    public String Name() {
        return name;
    }

    @Override
    public String OwnerName() {
        return ownerName;
    }

    @Override
    public void activated(RPGCharacter character) {
        System.out.println(character.getName() + " equipped " + name + " (Defense +" + defenseBoost + ")");
    }

    @Override
    public void deactivated(RPGCharacter character) {
        System.out.println(character.getName() + " unequipped " + name);
    }
}
