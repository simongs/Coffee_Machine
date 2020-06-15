package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        CoffeeMachineStatus coffeeMachineStatus = new CoffeeMachineStatus(400, 540, 120, 9, 550);

        coffeeMachineStatus.printStatus();

        System.out.println("Write action (buy, fill, take):");
        System.out.print(">");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        switch (line) {
            case "buy":
                coffeeMachineStatus.BuyAction();
                break;
            case "fill":
                coffeeMachineStatus.FillAction();
                break;
            case "take":
                coffeeMachineStatus.takeAction();
                break;
        }

        coffeeMachineStatus.printStatus();

    }

}
