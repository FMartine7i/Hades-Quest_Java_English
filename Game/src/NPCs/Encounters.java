package NPCs;
import player.Player;
import utils.MyMethods;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Encounters {
    private static ArrayList<Enemy> weakEnemies = new ArrayList<>();
    private static ArrayList<Enemy> commonEnemies = new ArrayList<>();
    private static ArrayList<Enemy> strongEnemies = new ArrayList<>();
    private static Random random = new Random();

    public static void initializeEnemies(){
        int randWeak = random.nextInt(10,50);
        int randCommon = random.nextInt(50, 200);
        int randStrong = random.nextInt(250, 1000);

        //weak enemies
        weakEnemies.add(new Enemy("Ghost", 5, 1, randWeak));
        weakEnemies.add(new Enemy("Undead Archer", 6, 2, randWeak));
        weakEnemies.add(new Enemy("Satyr", 6, 2, randWeak));

        //common enemies
        commonEnemies.add(new Enemy("Cyclops", 10, 6, randCommon));
        commonEnemies.add(new Enemy("Skeleton", 10, 5, randStrong));
        commonEnemies.add(new Enemy("Gorgon", 9, 3, randCommon));

        //Strong enemies
        strongEnemies.add(new Enemy("Putrid Cyclops", 30, 20, randStrong));
        strongEnemies.add(new Enemy("Centaur", 25, 25, randStrong));
        strongEnemies.add(new Enemy("Night Witch", 22, 26, randStrong));
    }

    public static void firstEncounter(Player player, Scanner input){
        int rand = random.nextInt(10,50);
        Enemy undead = new Enemy("Undead Warrior",5, 1, rand);

        MyMethods.print("You and Phobos continue on your way until you hear metallic and heavy footsteps.");
        MyMethods.waitForInput(input);
        MyMethods.print("Phobos: that's an undead warrior. There are plenty around the Underworld.");
        MyMethods.print("They only have one goal: to eliminate any intruder... and I think they already know you don't belong here!");
        MyMethods.print("You hold boldly your sword and get ready for the confrontation!");
        MyMethods.waitForInput(input);
        
        combat(player, undead, input);
    }

    public static void randomWeakEncounter(){
        
    }

    public static void combat(Player player, Enemy enemy, Scanner input){
        int playerHealth = player.getHealth();
        int potions = player.getPotions();
        int enemyHealth = enemy.getHealth();
        String enemyName = enemy.getName();

        while (enemyHealth > 0){
            System.out.println("\n" + enemy.getName());
            System.out.println("Damage: " + enemy.getDamage() + "\nHealth: " + enemyHealth);
            System.out.println("-------------------------------------");
            System.out.println("|    (A)ttack          (D)efend     |");
            System.out.println("|              (H)eal               |");
            System.out.println("-------------------------------------");
            System.out.println(player.getName());
            System.out.println("Health: " + playerHealth + "\tPotions: " + player.getPotions() + "\n");
            String option = input.nextLine();

            if (option.equalsIgnoreCase("a")){
                int attackValue = random.nextInt(1, player.getWeaponValue() + random.nextInt(1, 2));
                int damageTaken = enemy.getDamage() - player.getShieldValue();

                if (damageTaken < 0)
                    damageTaken = 0;

                switch (random.nextInt(0, 2)){
                    case 0:
                        MyMethods.print("You bravely brandish your sword, striking the " + enemyName + ", but not without taking some damage yourself!");
                        break;
                    case 1:
                        MyMethods.print("As you lunge at the " + enemyName +" with your weapon, it strikes back fiercely, dealing a brutal blow to you!");
                        break;
                    case 2:
                        MyMethods.print("You skillfully strike at the " + enemyName + ", but it swiftly counters, hitting you back with force.");
                        break;
                }

                player.setHealth(playerHealth - damageTaken);
                playerHealth = player.getHealth();
                enemy.setHealth(enemyHealth - attackValue);
                enemyHealth -= attackValue;
                System.out.println("You lose " + damageTaken + " health and deal " + attackValue + " damage.");
            }
            else if (option.equalsIgnoreCase("d")){
                int damageTaken = (enemy.getDamage()/4) - player.getShieldValue();
                int attackValue = random.nextInt(0, player.getShieldValue()) + random.nextInt(1, 4);

                if (damageTaken < 0)
                    damageTaken = 0;

                switch (random.nextInt(0, 1)){
                    case 0:
                        MyMethods.print("You ready your sword in defensive stance as the " + enemyName + " attacks you.");
                        break;
                    case 1:
                        MyMethods.print("As the " + enemyName + " prepares to strike, you put yourself in defensive position.");
                        break;
                }

                player.setHealth(playerHealth - damageTaken);
                playerHealth = player.getHealth();
                enemy.setHealth(enemyHealth - attackValue);
                enemyHealth -= attackValue;
                System.out.println("You lose " + damageTaken + " health and deal " + attackValue + " damage.");
                System.out.println("You lose " + damageTaken + " health and deal " + attackValue + " damage.");
            }
            else if (option.equalsIgnoreCase("h")){
                if (potions == 0){
                    int damageTaken = enemy.getDamage() - player.getShieldValue();
                    if (damageTaken < 0)
                        damageTaken = 0;

                    MyMethods.print("You grab your bag hoping there's some recovery potion.");
                    System.out.println("Unfortunately for you, the bag is empty.");

                    player.setHealth(playerHealth - damageTaken);
                    playerHealth = player.getHealth();
                    MyMethods.print("The " + enemyName + " fiercely charges towards you and you lose " + damageTaken + " health!");
                }
                else{
                    int potionValue = 5;

                    MyMethods.print("You reach into your bag and pull out a glowing purple flask and take a drink.");
                    if (playerHealth + potionValue < 10){
                        player.setHealth(playerHealth + potionValue);
                        System.out.println("You gain " + potionValue + " health!");
                    }
                    else{
                        int healthRemaining = 10 - playerHealth;
                        player.setHealth(playerHealth + healthRemaining);
                        System.out.println("You gain " + healthRemaining + " health!");
                    }

                    if (random.nextInt(0, 3) == 0){
                        int damageTaken = (enemy.getDamage()/2) - player.getShieldValue();
                        if (damageTaken < 0)
                            damageTaken = 0;
                        player.setHealth(playerHealth - damageTaken);
                        playerHealth = player.getHealth();
                        MyMethods.print("Bad luck! As you were healing, the " + enemyName + " took advantage and you loose " + damageTaken + " health.");
                    }
                }
            }
            else
                System.out.println("Invalid option. Select 'A', 'D' or 'H'.");

            if (playerHealth <= 0){
                MyMethods.print("....... YOU ARE DEAD . . . . .");
                MyMethods.print("Sadly, the " + enemyName + " has bested you in combat. You gasp as the ground crumbles and takes you to the Tartarus.");
                MyMethods.waitForInput(input);
                System.exit(0);
            }
        }
    }
}
