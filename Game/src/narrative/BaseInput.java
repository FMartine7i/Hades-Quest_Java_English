package narrative;
import java.util.Scanner;

public class BaseInput {
    protected Scanner input = new Scanner(System.in);

    public static void print(String text){
        for(char c: text.toCharArray()){
            System.out.print(c);
            threadSleep(60);
        }
        System.out.println();
    }

    public static void threadSleep(int num){
        try{
            Thread.sleep(num);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void waitForInput(Scanner input){
        boolean isPressed = false;
        threadSleep(800);

        while(!isPressed){
            System.out.println("Press ENTER to continue...");

            if (input.nextLine().isEmpty()){
                isPressed = true;
            }
            else
                System.out.println("Please, press 'd' or ENTER");
        }
    }
}
