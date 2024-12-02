// อุปกรณ์เสริมประเภท Agility
public class AgilityAccessory implements Accessory {
    private String name;
    private String ownerName;
    private int speedBoost;

    public AgilityAccessory(String name, int speedBoost) {
        this.name = name;
        this.speedBoost = speedBoost;
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
        System.out.println(character.getName() + " equipped " + name + " (Speed +" + speedBoost + ")");
    }

    @Override
    public void deactivated(RPGCharacter character) {
        System.out.println(character.getName() + " unequipped " + name);
    }
}
