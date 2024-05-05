import player.Player;
import utils.MyMethods;

import java.util.Scanner;

public class Main {

    static Player currentPlayer = new Player(10, 0, 0, 1, 0, 0, 0);

    public static void main(String[] args) {
        start();
    }

    private static void start(){
        String option;
        Scanner input = new Scanner(System.in);

        MyMethods.print("............... . . . . . . .  .  .  .  .  .  .  .   .   .");
        MyMethods.print(". . . . Hades' Quest: Legacy of the Fallen God . . . .");
        MyMethods.threadSleep(2000);

        MyMethods.print("\nAll your senses feel numb. You cannot hear anything in the middle of the infinite darkness.");
        MyMethods.print("Suddenly, a green beam cuts through the shadows, gently revealing the environment.");
        MyMethods.print("Now before you, a desolate scene appears: you are locked in a stone dungeon, whose only way out");
        MyMethods.print("appears to be a bars door. Though it you can see withered trees and green waterfalls, from");
        MyMethods.print("which emerge silhouettes of corpses.");
        MyMethods.waitForInput(input);
        MyMethods.print("Beyond the bars door you see a little strange creature. Would you like to get closer? y/N");
        MyMethods.threadSleep(300);
        option = input.nextLine();

        while (!option.equalsIgnoreCase("y")){
            if (option.equalsIgnoreCase("n"))
                MyMethods.print("You do nothing. You keep looking around but cannot find anything useful.");
            else
                MyMethods.print("You can't even remember how to answer a simple question...");
            MyMethods.print("You look at that creature one more time. Do you want to get closer?\ny/N");
            option = input.nextLine();
        }
        MyMethods.clear();

        MyMethods.print("You approach the bars and catch its attention.");
        MyMethods.print("Even though it looks like a little demon, it's the only thing that doesn't seem lethal in that place.");
        MyMethods.print("'Hmm', it clears its throat, 'What do we got here?' I can't believe my eyes! A human! heh heh heh...");
        MyMethods.print("'Name's Fobos. Now tell me yours, don't be shy!'");
        MyMethods.threadSleep(300);
        System.out.print("Write your name here: ");
        currentPlayer.setName(input.nextLine());
        String playerName = currentPlayer.getName();

        MyMethods.print("Fobos: " + playerName + "? Now that's a terrible name! Heh heh heh...");
        MyMethods.threadSleep(1000);
        MyMethods.clear();

        System.out.println("--------------------------------------------------");
        System.out.println("| 1. Where am I?                                 |");
        System.out.println("| 2. What are you?                               |");
        System.out.println("| 3. Am I dreaming?                              |");
        System.out.println("--------------------------------------------------");
        int numOption = input.nextInt();

        while (numOption != 1){
            if (numOption == 2){
                MyMethods.print("Fobos: WHAT am I? That's rude, man!");
                MyMethods.print("...Oh, never mind. I'm just one of Lord Hades' servant. A demon condemned to roam these wastelands.");
            }
            else if (numOption == 3)
                MyMethods.print("Fobos: Definitely no! heh heh...");
            else
                System.out.println("Invalid option.");
            System.out.println("--------------------------------------------------");
            System.out.println("| 1. Where am I?                                 |");
            System.out.println("| 2. What are you?                               |");
            System.out.println("| 3. Am I dreaming?                              |");
            System.out.println("--------------------------------------------------");
            numOption = input.nextInt();
        }

        MyMethods.print("Fobos: Lemme refresh your mind, bird-brain: now you find yourself in the domains of Lord Hades...");
        MyMethods.print("More precisely in the River Styx.");
        MyMethods.waitForInput(input);

        System.out.println("----------------------------------------------------");
        System.out.println("| 1. Did you just said the River Styx? Am I dead?  |");
        System.out.println("| 2. Who is this Hades?                            |");
        System.out.println("| 3. What is exactly the River Styx?               |");
        System.out.println("----------------------------------------------------");
        numOption = input.nextInt();

        while (numOption != 1){
            if (numOption == 2) {
                MyMethods.print("Fobos: Seems like that fall has either left you stupid or given you amnesia. Anyway...");
                MyMethods.print("Lord Hades is the boss around here... the big shot, y' know. He's Zeus' older brother, you know 'im? ");
                MyMethods.print("The guy who throws lightning bolts and all that jazz.");
                MyMethods.waitForInput(input);
                MyMethods.print("You: Wait... gods, you say?");
                MyMethods.print("Fobos: Yeah, gods... They're real. As real as you and me.");
            }
            else if (numOption == 3)
                MyMethods.print("Fobos: Jeez, you're a lost cause. The River Styx is where the souls of the dead are carried to the Underworld!");
            else
                System.out.println("Invalid option.");
            System.out.println("----------------------------------------------------");
            System.out.println("| 1. Did you just said the River Styx? Am I dead?  |");
            System.out.println("| 2. Who is this Hades?                            |");
            System.out.println("| 3. What is exactly the River Styx?               |");
            System.out.println("----------------------------------------------------");
            numOption = input.nextInt();
        }
        MyMethods.clear();

        MyMethods.print("Fobos: That might be a dumb question since you're here... but, you don't seem dead at all.");
        MyMethods.waitForInput(input);
        MyMethods.print("You: So why am I in this place then, can you tell me?");
        MyMethods.waitForInput(input);
        MyMethods.print("Fobos: Ah, finally the big question! I guess the gods have their reasons... ");
        MyMethods.print("And I suspect you're not a simple mortal.");
        MyMethods.waitForInput(input);
        MyMethods.print("You: What do you mean?");
        MyMethods.waitForInput(input);
        MyMethods.print("Fobos [stays quiet for a moment]: Ah, nonsense! It was nothing.");
        MyMethods.print("Fobos: If I knew I would be in a better place, don't you think?");
        MyMethods.print("You: Whatever. I won't get anywhere just standing here. Do you know a way out?");
        MyMethods.waitForInput(input);
        MyMethods.print("Fobos: If I knew I would be in a better place, don't you think?");
        MyMethods.print("See, " + playerName + ". There are more like you who have fallen for some reason and wonder the same...");
        MyMethods.print("But even after centuries, they are still roaming these lands...");
        MyMethods.print("Well, good luck with that! [laughs]\n");
        MyMethods.waitForInput(input);
        MyMethods.clear();
        MyMethods.print("You turn around and start walking. You must find a way out, otherwise you could be lost forever.");
        MyMethods.print("You head towards the withered trees and follow a stone road.");
        MyMethods.threadSleep(1000);
        MyMethods.print("Finally you discover something: next to an abandoned carriage you find an iron sword and a purple glowing flask.");
        currentPlayer.setWeaponValue(1);
        currentPlayer.setPotions(1);
        MyMethods.threadSleep(500);
        MyMethods.print("+New weapon: Rusty Sword");
        MyMethods.threadSleep(500);
        MyMethods.print("potion +1");
        System.out.println(currentPlayer.getPotions());
        input.close();
    }
}