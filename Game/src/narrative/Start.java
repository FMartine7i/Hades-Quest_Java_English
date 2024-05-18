package narrative;
import player.Player;
import utils.DialogueManager;
import utils.MyMethods;
import java.util.ArrayList;
import java.util.List;

public class Start extends BaseInput {
    private final Player player;

    public Start(Player player){ this.player = player; }

    public void start(){
        String option;

        BaseInput.print("............... . . . . . . .  .  .  .  .  .  .  .   .   .");
        BaseInput.print(". . . . Hades' Quest: Legacy of the Fallen God . . . .");
        BaseInput.threadSleep(2000);

        BaseInput.print("\nAll your senses feel numb. You cannot hear anything in the middle of the infinite darkness.");
        BaseInput.print("Suddenly, a green beam cuts through the shadows, gently revealing the environment.");
        BaseInput.print("Now before you, a desolate scene appears: you are locked in a stone dungeon, whose only way out");
        BaseInput.print("appears to be a bars door. Through it you can see withered trees and green waterfalls, from");
        BaseInput.print("which emerge silhouettes of corpses.");
        MyMethods.waitForInput(input);
        BaseInput.print("Beyond the bars door you see a strange little creature. Would you like to get closer? y/N");
        BaseInput.threadSleep(300);
        option = input.nextLine();

        while (!option.equalsIgnoreCase("y")){
            if (option.equalsIgnoreCase("n"))
                BaseInput.print("You do nothing. You keep looking around but cannot find anything useful.");
            else
                BaseInput.print("You can't even remember how to answer a simple question...");
            BaseInput.print("You look at that creature one more time. Do you want to get closer?\ny/N");
            option = input.nextLine();
        }
        MyMethods.clear();

        BaseInput.print("You approach the bars and catch its attention.");
        BaseInput.print("Even though it looks like a little imp, it's the only thing that doesn't seem lethal in that place.");
        BaseInput.print("'Hmm', it clears its throat, 'What do we got here?' I can't believe my eyes! A human! heh heh heh...");
        BaseInput.print("'Name's Phobos. Now tell me yours, don't be shy!'");
        MyMethods.threadSleep(300);
        System.out.print("Write your name here: ");
        player.setName(input.nextLine());
        String playerName = player.getName();

        while (playerName.isEmpty()){
            BaseInput.print("Phobos: You can't even remember your own name! [Laughs]");
            System.out.print("Let's do it again. Please, write your name: ");
            player.setName(input.nextLine());
            playerName = player.getName();

            if (!playerName.isEmpty()){
                BaseInput.print("You: Wait! I remember now. The name's " + player.getName() + ".");
            }
        }

        BaseInput.print("Phobos: " + playerName + "? Now that's a terrible name! Heh heh heh...");
        MyMethods.threadSleep(1000);
        MyMethods.clear();
        List<String> responses = new ArrayList<>();
        responses.add("Where am I?");
        responses.add("What are you?");
        responses.add("Am I dreaming?");
        DialogueManager.displayDialogue(responses);
        int numOption = input.nextInt();
        MyMethods.clear();

        while (numOption != 1){
            if (numOption == 2){
                BaseInput.print("Phobos: WHAT am I? That's rude, man!");
                BaseInput.print("...Oh, never mind. I'm just one of Lord Hades' servant. A demon condemned to roam these wastelands.");
            }
            else if (numOption == 3)
                BaseInput.print("Phobos: Definitely no! heh heh...");
            else
                System.out.println("Invalid option. Select [1-2-3]");
            DialogueManager.displayDialogue(responses);
            numOption = input.nextInt();
            MyMethods.clear();
        }

        BaseInput.print("Phobos: Lemme refresh your mind, bird-brain: now you find yourself in the domains of Lord Hades...");
        BaseInput.print("More precisely in the River Styx.");
        MyMethods.waitForInput(input);
        responses = new ArrayList<>();
        responses.add("Did you just said the River Styx? Am I dead?");
        responses.add("Who is this Hades?");
        responses.add("What is exactly the River Styx?");
        DialogueManager.displayDialogue(responses);
        numOption = input.nextInt();
        MyMethods.clear();

        while (numOption != 1){
            if (numOption == 2) {
                BaseInput.print("Phobos: Seems like that fall has either scrambled your brains or given you amnesia. Anyway...");
                BaseInput.print("Lord Hades is the boss around here... the big shot, y' know. He's Zeus' older brother, you know 'im? ");
                BaseInput.print("The guy who throws lightning bolts and all that jazz.");
                MyMethods.waitForInput(input);
                BaseInput.print("You: Wait... gods, you say?");
                BaseInput.print("Phobos: Yeah, gods... They're real. As real as you and me.");
            }
            else if (numOption == 3)
                BaseInput.print("Phobos: Jeez, you're a lost cause. The River Styx is where the souls of the dead sail into the Underworld!");
            else
                System.out.println("Invalid option. Select [1-2-3]");
            DialogueManager.displayDialogue(responses);
            numOption = input.nextInt();
            MyMethods.clear();
        }

        BaseInput.print("Phobos: That might be a dumb question since you're here... but, you don't seem dead at all.");
        MyMethods.waitForInput(input);
        BaseInput.print("You: So why am I in this place then, can you tell me?");
        MyMethods.waitForInput(input);
        BaseInput.print("Phobos: Ah, finally the big question! I guess the gods have their reasons... ");
        BaseInput.print("And I suspect you're not a simple mortal.");
        MyMethods.waitForInput(input);
        BaseInput.print("You: What do you mean?");
        MyMethods.waitForInput(input);
        BaseInput.print("Phobos [stays quiet for a moment]: Ah, nonsense! It was nothing.");
        BaseInput.print("You: Whatever. I won't get anywhere just standing here. Do you know a way out?");
        MyMethods.waitForInput(input);
        BaseInput.print("Phobos: If I knew I'd be in a better place, don't you think?");
        BaseInput.print("See, " + playerName + ". There are more like you who have fallen for some reason and wonder the same...");
        BaseInput.print("But even after centuries, they are still roaming these lands...");
        BaseInput.print("Well, good luck with that! [laughs]\n");
        MyMethods.waitForInput(input);
        MyMethods.clear();

        BaseInput.print("You turn around and start walking. You must find a way out or you might end up in oblivion.");
        BaseInput.print("Heading towards the withered trees, you follow a stone road.");
        MyMethods.threadSleep(1000);
        BaseInput.print("Finally you stumble upon something: next to an abandoned carriage you find an iron sword and a flask glowing with a purple hue.");
        player.setWeaponValue(2);
        player.setPotions(player.getPotions() + 1);
        MyMethods.threadSleep(500);
        BaseInput.print("+New weapon: Rusty Sword");
        MyMethods.threadSleep(500);
        BaseInput.print("Potion +1");
        MyMethods.waitForInput(input);
        MyMethods.clear();

        BaseInput.print("You hear footsteps behind you. When you turn around, you see the imp Phobos.\n");
        MyMethods.waitForInput(input);
        BaseInput.print("You: You again? I need your help to survive in this unknown place.");
        MyMethods.waitForInput(input);
        BaseInput.print("Phobos: [Laughs] Oh, I'll help you, but you'll have to give me that potion in exchange. I bet I can make some coins off it!\n");
        MyMethods.threadSleep(1000);
        responses = new ArrayList<>();
        responses.add("Give potion");
        responses.add("Threaten Phobos");
        DialogueManager.displayDialogue(responses);
        numOption = input.nextInt();

        if (numOption == 1){
            player.setPotions(player.getPotions() - 1);
            player.setKarma(player.getKarma() + 10);
            System.out.println("+Karma");
            MyMethods.threadSleep(800);
            System.out.println("Potion -1");
            BaseInput.print("\nYou: Ok, it's yours. Take it.\n");
            BaseInput.print("Phobos [Laughing] Well, thank you, pal! Now follow me...");
        }
        else if (numOption == 2){
            player.setKarma(player.getKarma() - 10);
            System.out.println("-Karma");
            BaseInput.print("\nYou: [pointing your sword at Phobos] Do not play games with me, demon! You come with or you die.\n");
            BaseInput.print("Phobos: All right, all right. Heh... I like this guy!");
        }
        else
            System.out.println("Invalid option.");

        BaseInput.print("Hear me out, dude. You should be more grateful, especially since I've got some valuable information...\n");
        BaseInput.print("You: Go ahead.\n");
        MyMethods.waitForInput(input);
        BaseInput.print("Phobos: Right now, you stand on the outskirts of the Asphodel Meadows. You must follow the River Styx to enter.");

        responses = new ArrayList<>();
        responses.add("... Continue.");
        responses.add("Asphodel Meadows?");
        responses.add("And then what? Ask for directions to Hades?");
        DialogueManager.displayDialogue(responses);
        numOption = input.nextInt();

        if (numOption == 1){
            BaseInput.print("Phobos: The idea is getting into the Hades' Palace, which is in the middle of the Asphodel, avoiding, of course, Hades himself.");
            BaseInput.print("Once you're in, ask for Persephone. She will be willing to helping you. Ah, and avoid the guards as well.");
        }
        else if (numOption == 2){
            BaseInput.print("Phobos: [Eye-rolling] The Asphodel Meadows, dude! It's where the common people go in the afterlife.");
            BaseInput.print("People who didn't do bad things, y' know, but they're not good enough to deserve Elysium. The Elysian Fields are reserved for heroes!");
            BaseInput.print("...and then there's the Tartarus. Trust me, you don't wanna go down to Tartarus. That place's reserved for really bad people... and the Titans, heh heh...\n");
            BaseInput.print("Listen, the idea is getting into the Hades' Palace, which is in the middle of the Asphodel, avoiding, of course, Hades itself.");
            BaseInput.print("Once you're in, ask for Persephone. She will be willing to help you. Ah, and avoid the guards as well.");
        }
        else if (numOption == 3){
            BaseInput.print("Phobos: You're not as dumb as you look! Well, at least not that dumb, he he.");
            BaseInput.print("What you said is correct, except for the part about seeing Hades. They said he doesn't like visitors, especially if your not dead.");
            BaseInput.print("We should look for Persephone, his wife, who is much... nicer, to say the least.\n");
        }
    }
}
