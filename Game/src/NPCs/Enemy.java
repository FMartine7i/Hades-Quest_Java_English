package NPCs;

public class Enemy {
    private String name;
    private int health;
    private int damage;
    private int coinsReward;

    public Enemy(String name, int health, int damage, int coinsReward){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.coinsReward = coinsReward;
    }

    public void setName(String name){ this.name = name; }
    public void setHealth(int health){ this.health = health; }
    public void setDamage(int damage){ this.damage = damage; }
    public void setCoinsReward(int coinsReward){ this.coinsReward = coinsReward; }

    public String getName(){ return name; }
    public int getHealth(){ return health; }
    public int getDamage(){ return damage; }
    public int getCoinsReward(){ return coinsReward; }
}
