package player;

public class Player {
    private String name;
    private int health;
    private int potions;
    private int shieldValue;
    private int damage;
    private int karma;
    private int coins;
    private int weaponValue;

    public Player(int health, int potions, int shieldValue, int damage, int karma, int coins, int weaponValue){
        this.health = health;
        this.potions = potions;
        this.shieldValue = shieldValue;
        this.damage = damage;
        this.karma = karma;
        this.coins = coins;
        this.weaponValue = weaponValue;
    }

    public void setName(String name){ this.name = name; }

    public String getName(){ return name; }

    public void setHealth(int health){ this.health = health; }

    public int getHealth(){ return health; }

    public void setPotions(int potions){ this.potions = potions; }

    public int getPotions(){ return potions; }

    public void setShieldValue(int shieldValue){ this.shieldValue = shieldValue; }

    public int getShieldValue(){ return shieldValue; }

    public void setDamage(int damage){ this.damage = damage; }

    public int getDamage(){ return damage; }

    public void setKarma(int karma){ this.karma = karma; }

    public int getKarma(){ return karma; }

    public void setCoins(int coins){ this.coins = coins; }

    public int getCoins(){ return coins; }

    public void setWeaponValue(int weaponValue){ this.weaponValue = weaponValue; }

    public int getWeaponValue(){ return weaponValue; }
}
