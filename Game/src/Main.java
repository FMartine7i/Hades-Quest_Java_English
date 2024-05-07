import NPCs.Encounters;
import player.Player;
import utils.DialogueManager;
import utils.MyMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Player currentPlayer = new Player(10, 0, 0, 1, 0, 0, 0);
    static int karma = currentPlayer.getKarma();
    static int potions = currentPlayer.getPotions();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        start(input);
        Encounters.firstEncounter(currentPlayer, input);
        input.close();
    }

    private static void start(Scanner input){
        String option;

        MyMethods.print("............... . . . . . . .  .  .  .  .  .  .  .   .   .");
        MyMethods.print(". . . . Hades' Quest: Legacy of the Fallen God . . . .");
        MyMethods.threadSleep(2000);

        MyMethods.print("\nAll your senses feel numb. You cannot hear anything in the middle of the infinite darkness.");
        MyMethods.print("Suddenly, a green beam cuts through the shadows, gently revealing the environment.");
        MyMethods.print("Now before you, a desolate scene appears: you are locked in a stone dungeon, whose only way out");
        MyMethods.print("appears to be a bars door. Through it you can see withered trees and green waterfalls, from");
        MyMethods.print("which emerge silhouettes of corpses.");
        MyMethods.waitForInput(input);
        MyMethods.print("Beyond the bars door you see a strange little creature. Would you like to get closer? y/N");
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
        MyMethods.print("Even though it looks like a little imp, it's the only thing that doesn't seem lethal in that place.");
        MyMethods.print("'Hmm', it clears its throat, 'What do we got here?' I can't believe my eyes! A human! heh heh heh...");
        MyMethods.print("'Name's Phobos. Now tell me yours, don't be shy!'");
        MyMethods.threadSleep(300);
        System.out.print("Write your name here: ");
        currentPlayer.setName(input.nextLine());
        String playerName = currentPlayer.getName();

        while (playerName.isEmpty()){
            MyMethods.print("Phobos: You can't even remember your own name! [Laughs]");
            System.out.print("Let's do it again. Please, write your name: ");
            currentPlayer.setName(input.nextLine());
            playerName = currentPlayer.getName();

            if (!playerName.isEmpty()){
                MyMethods.print("You: Wait! I remember now. The name's " + currentPlayer.getName() + ".");
            }
        }

        MyMethods.print("Phobos: " + playerName + "? Now that's a terrible name! Heh heh heh...");
        MyMethods.threadSleep(1000);
        MyMethods.clear();
        int numOption = 0;
        List<String> responses = new ArrayList<>();

        do{
            responses.add("Where am I?");
            responses.add("What are you?");
            responses.add("Am I dreaming?");
            DialogueManager.displayDialogue(responses);
            numOption = input.nextInt();

            if (numOption == 2){
                MyMethods.print("Phobos: WHAT am I? That's rude, man!");
                MyMethods.print("...Oh, never mind. I'm just one of Lord Hades' servant. A demon condemned to roam these wastelands.");
            }
            else if (numOption == 3)
                MyMethods.print("Phobos: Definitely no! heh heh...");
            else
                System.out.println("Invalid option. Select [1-2-3]");
        }
        while (numOption != 1);

        MyMethods.print("Phobos: Lemme refresh your mind, bird-brain: now you find yourself in the domains of Lord Hades...");
        MyMethods.print("More precisely in the River Styx.");
        MyMethods.waitForInput(input);

        do{
            responses = new ArrayList<>();
            responses.add("Did you just said the River Styx? Am I dead?");
            responses.add("Who is this Hades?");
            responses.add("What is exactly the River Styx?");
            DialogueManager.displayDialogue(responses);
            numOption = input.nextInt();

            if (numOption == 2) {
                MyMethods.print("Phobos: Seems like that fall has either scrambled your brains or given you amnesia. Anyway...");
                MyMethods.print("Lord Hades is the boss around here... the big shot, y' know. He's Zeus' older brother, you know 'im? ");
                MyMethods.print("The guy who throws lightning bolts and all that jazz.");
                MyMethods.waitForInput(input);
                MyMethods.print("You: Wait... gods, you say?");
                MyMethods.print("Phobos: Yeah, gods... They're real. As real as you and me.");
            }
            else if (numOption == 3)
                MyMethods.print("Phobos: Jeez, you're a lost cause. The River Styx is where the souls of the dead sail into the Underworld!");
            else
                System.out.println("Invalid option. Select [1-2-3]");
        }
        while (numOption != 1);
        MyMethods.clear();

        MyMethods.print("Phobos: That might be a dumb question since you're here... but, you don't seem dead at all.");
        MyMethods.waitForInput(input);
        MyMethods.print("You: So why am I in this place then, can you tell me?");
        MyMethods.waitForInput(input);
        MyMethods.print("Phobos: Ah, finally the big question! I guess the gods have their reasons... ");
        MyMethods.print("And I suspect you're not a simple mortal.");
        MyMethods.waitForInput(input);
        MyMethods.print("You: What do you mean?");
        MyMethods.waitForInput(input);
        MyMethods.print("Phobos [stays quiet for a moment]: Ah, nonsense! It was nothing.");
        MyMethods.print("You: Whatever. I won't get anywhere just standing here. Do you know a way out?");
        MyMethods.waitForInput(input);
        MyMethods.print("Phobos: If I knew I'd be in a better place, don't you think?");
        MyMethods.print("See, " + playerName + ". There are more like you who have fallen for some reason and wonder the same...");
        MyMethods.print("But even after centuries, they are still roaming these lands...");
        MyMethods.print("Well, good luck with that! [laughs]\n");
        MyMethods.waitForInput(input);
        MyMethods.clear();

        MyMethods.print("You turn around and start walking. You must find a way out or you might end up in oblivion.");
        MyMethods.print("Heading towards the withered trees, you follow a stone road.");
        MyMethods.threadSleep(1000);
        MyMethods.print("Finally you stumble upon something: next to an abandoned carriage you find an iron sword and a flask glowing with a purple hue.");
        currentPlayer.setWeaponValue(2);
        currentPlayer.setPotions(potions + 1);
        potions = currentPlayer.getPotions();
        MyMethods.threadSleep(500);
        MyMethods.print("+New weapon: Rusty Sword");
        MyMethods.threadSleep(500);
        MyMethods.print("Potion +1");
        MyMethods.waitForInput(input);
        MyMethods.clear();

        MyMethods.print("You hear footsteps behind you. When you turn around, you see the imp Phobos.\n");
        MyMethods.waitForInput(input);
        MyMethods.print("You: You again? I need your help to survive in this unknown place.");
        MyMethods.waitForInput(input);
        MyMethods.print("Phobos: [Laughs] Oh, I'll help you, but you'll have to give me that potion in exchange. I bet I can make some coins off it!\n");
        MyMethods.threadSleep(1000);
        responses = new ArrayList<>();
        responses.add("Give potion");
        responses.add("Threaten Phobos");
        DialogueManager.displayDialogue(responses);
        numOption = input.nextInt();

        if (numOption == 1){
            currentPlayer.setPotions(potions - 1);
            currentPlayer.setKarma(karma + 10);
            System.out.println("+Karma");
            MyMethods.threadSleep(800);
            System.out.println("Potion -1");
            MyMethods.print("\nYou: Ok, it's yours. Take it.\n");
            MyMethods.print("Phobos [Laughing] Well, thank you, pal! Now follow me...");
        }
        else if (numOption == 2){
            currentPlayer.setKarma(karma - 10);
            System.out.println("-Karma");
            MyMethods.print("\nYou: [pointing your sword at Phobos] Do not play games with me, demon! You come with or you die.\n");
            MyMethods.print("Phobos: All right, all right. Heh... I like this guy!");
        }
        else
            System.out.println("Invalid option.");

        MyMethods.print("Hear me out, dude. You should be more grateful, especially since I've got some valuable information...\n");
        MyMethods.print("You: Go ahead.\n");
        MyMethods.waitForInput(input);
        MyMethods.print("Phobos: Right now, you stand on the outskirts of the Asphodel Meadows. You must follow the River Styx to enter.");

        responses = new ArrayList<>();
        responses.add("... Continue.");
        responses.add("Asphodel Meadows?");
        responses.add("And then what? Ask for directions to Hades?");
        DialogueManager.displayDialogue(responses);
        numOption = input.nextInt();

        if (numOption == 1){
            MyMethods.print("Phobos: The idea is getting into the Hades' Palace, which is in the middle of the Asphodel, avoiding, of course, Hades itself.");
            MyMethods.print("Once you're in, ask for Persephone. She will be willing to helping you. Ah, and avoid the guards as well.");
        }
        else if (numOption == 2){
            MyMethods.print("Phobos: [Eye-rolling] The Asphodel Meadows, dude! It's where the common people go in the afterlife.");
            MyMethods.print("People who didn't do bad things, y' know, but they're not good enough to deserve Elysium. The Elysian Fields are reserved for heroes!");
            MyMethods.print("...and then there's the Tartarus. Trust me, you don't wanna go down to Tartarus. That place's reserved for really bad people... and the Titans, heh heh...\n");
            MyMethods.print("Listen, the idea is getting into the Hades' Palace, which is in the middle of the Asphodel, avoiding, of course, Hades itself.");
            MyMethods.print("Once you're in, ask for Persephone. She will be willing to help you. Ah, and avoid the guards as well.");
        }
        else if (numOption == 3){
            MyMethods.print("Phobos: You're not as dumb as you look! Well, at least not that dumb, he he.");
            MyMethods.print("What you said is correct, except for the part about seeing Hades. They said he doesn't like visitors, especially if your not dead.");
            MyMethods.print("We should look for Persephone, his wife, who is much... nicer, to say the least.\n");
        }

    }
}