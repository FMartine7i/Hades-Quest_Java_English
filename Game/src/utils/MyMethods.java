package utils;
import java.util.Scanner;

public class MyMethods {
    public static void waitForInput(Scanner input){
        boolean isPressed = false;

        while(!isPressed){
            System.out.println("Press 'd' or ENTER to continue...");

            if (input.nextLine().equalsIgnoreCase("d") || input.nextLine().isEmpty()){
                isPressed = true;
            }
            else
                System.out.println("Please, press 'd' or ENTER");
        }
    }

    public static void clear(){
        for (int i = 0; i < 50; i++){
            System.out.println();
        }
    }

    public static void print(String text){
        for(char c: text.toCharArray()){
            System.out.print(c);
            threadSleep(80);
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
}
