package machine;

import java.util.Scanner;

public class CoffeeMachineStatus {
    int water;
    int milk;
    int coffeeBeans;
    int cups;
    int money;

    public CoffeeMachineStatus(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public void printStatus() {
        System.out.println("");
        System.out.println(String.format("The coffee machine has:"));
        System.out.println(String.format("%d of water", water));
        System.out.println(String.format("%d of milk", milk));
        System.out.println(String.format("%d of coffee beans", coffeeBeans));
        System.out.println(String.format("%d of disposable cups", cups));
        System.out.println(String.format("%d of money", money));
        System.out.println("");
    }

    public void takeAction() {
        System.out.println(String.format("I gave you $%d", money));
        this.money = 0;
    }

    public void BuyAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int selection = sc.nextInt();

        switch (selection) {
            case 1:
                reduce(250, 0, 16, 4);
                break;
            case 2:
                reduce(350, 75, 20, 7);
                break;
            case 3:
                reduce(200, 100, 12, 6);
                break;
        }
    }

    private void reduce(int water, int milk, int coffeeBeans, int money) {
        this.water -= water;
        this.milk -= milk;
        this.coffeeBeans -= coffeeBeans;
        this.money += money;
        this.cups -= 1;
    }

    public void FillAction() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        this.water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        this.coffeeBeans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.cups += sc.nextInt();

    }
}
