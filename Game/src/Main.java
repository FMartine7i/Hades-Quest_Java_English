import encounters.Encounters;
import narrative.Start;
import player.Player;

public class Main {

    static Player currentPlayer = new Player(10, 0, 0, 1, 0, 0, 0);

    public static void main(String[] args) {
        Start start = new Start(currentPlayer);
        Encounters encounters = new Encounters(currentPlayer);
        start.start();
        encounters.firstEncounter();
    }
}