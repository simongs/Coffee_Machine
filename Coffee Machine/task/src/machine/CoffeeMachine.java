package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CoffeeMachineStatus coffeeMachineStatus = new CoffeeMachineStatus(400, 540, 120, 9, 550);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
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
                case "remaining":
                    coffeeMachineStatus.printStatus();
                    break;
                case "exit":
                    return;

            }
        }

    }

}
