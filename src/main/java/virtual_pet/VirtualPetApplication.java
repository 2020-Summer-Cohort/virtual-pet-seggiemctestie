package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet Argo = new VirtualPet();
        System.out.println();
        System.out.println("     _____      ");
        System.out.println("   (, /  |      ");
        System.out.println("     /---|  __   _   _");
        System.out.println("  ) /    |_/ (_(_/_(_)");
        System.out.println(" (_/          .-/     ");
        System.out.println("             (_/      ");
        System.out.println("");
        System.out.println("   The Virtual Dog");
        System.out.println("");
        System.out.println("         __");
        System.out.println("        /  \\");
        System.out.println("       / ..|\\");
        System.out.println("      (_\\  |_)   Beep Bark Boop");
        System.out.println("      /  \\@'");
        System.out.println("     /     \\");
        System.out.println(" _  /  `   |");
        System.out.println("\\\\/  \\  | _\\");
        System.out.println(" \\   /_ || \\\\_");
        System.out.println("  \\____)|_) \\_)");
        System.out.println("");
        while (Argo.gameOn()) {
            System.out.println("Don't let these stats get to 100!");
            System.out.println();
            System.out.println("Hanger: " + Argo.getHanger());
            System.out.println("Thirst: " + Argo.getThirst());
            System.out.println("Potty: " + Argo.getPotty());
            System.out.println("Bored: " + Argo.getBoredom());
            System.out.println("Tiredness: " + Argo.getTiredness());
            System.out.println("Remaining Lives: " + Argo.getRemainingLives());
            System.out.println();
            System.out.println("What do you want to do: ");
            System.out.println("1. Feed the Argo");
            System.out.println("2. Give Argo drank");
            System.out.println("3. Take Argo outside");
            System.out.println("4. Play game with Argo");
            System.out.println("5. Go night night");
            System.out.println("6. Restart");
            System.out.println("7. Give up");
            System.out.println();
            int userChoice = input.nextInt();
            if ((userChoice <= 0 || userChoice > 7) && (Argo.alive())) {
                System.out.println("You entered: " + userChoice + ", which is not a valid option");
                Argo.tick();
                Argo.updateLives();
            } else if (userChoice == 1 && (Argo.alive())) {
                System.out.println("You entered: " + userChoice + ". Feed the Argo.");
                System.out.println("He is not himself when he is hungry, but it seems like he is always hungry!");
                System.out.println();
                Argo.tick();
                Argo.feedHanger();
                Argo.feedTiredness();
                Argo.feedPotty();
                Argo.updateLives();
            } else if (userChoice == 2 && (Argo.alive())) {
                System.out.println("You chose: " + userChoice + ". Give Argo Drank.");
                System.out.println("He loves the virtual water, and drinks in 3's.");
                System.out.println();
                Argo.tick();
                Argo.drankThirst();
                Argo.drankTiredness();
                Argo.drankPotty();
                Argo.updateLives();
            } else if (userChoice == 3 && (Argo.alive())) {
                System.out.println("You chose: " + userChoice + ". Take Argo Outside. ");
                System.out.println("Yay, he went potty!.");
                System.out.println();
                Argo.tick();
                Argo.takeoutPotty();
                Argo.takeoutThirst();
                Argo.takeoutHanger();
                Argo.updateLives();
            } else if (userChoice == 4 && (Argo.alive())) {
                System.out.println("You chose: " + userChoice + ". Play game with Argo.");
                System.out.println("...You don't play game with Argo, Argo plays game with you!.");
                System.out.println();
                Argo.tick();
                Argo.gameBoredom();
                Argo.gameTiredness();
                Argo.gameHanger();
                Argo.updateLives();
            } else if (userChoice == 5 && (Argo.alive())) {
                System.out.println("You chose: " + userChoice + ". Go night night");
                System.out.println("Man, he was out like a light. Like a light.");
                System.out.println();
                Argo.tick();
                Argo.nightTiredness();
                Argo.nightHanger();
                Argo.nightThirst();
                Argo.updateLives();
            } else if (userChoice == 6) {
                System.out.println("You chose: " + userChoice + ". Restart");
                System.out.println("Just keep trying");
                Argo.restart();


            } else if (userChoice == 7) {
                System.out.println("You chose: " + userChoice + ". Quit");
                System.out.println("   _____          __  __ ______ ______      ________ _____ ");
                System.out.println("  / ____|   /\\   |  \\/  |  ____/ __ \\ \\    / /  ____|  __ \\");
                System.out.println(" | |  __   /  \\  | \\  / | |__ | |  | \\ \\  / /| |__  | |__) |");
                System.out.println(" | | |_ | / /\\ \\ | |\\/| |  __|| |  | |\\ \\/ / |  __| |  _  / ");
                System.out.println(" | |__| |/ ____ \\| |  | | |___| |__| | \\  /  | |____| | \\ \\ ");
                System.out.println("  \\_____/_/    \\_\\_|  |_|______\\____/   \\/   |______|_|  \\_\\");
                System.out.println("");
                System.out.println("Fine! Quit! Just like that. It's over.");
                System.exit(0);
            } else {
                System.out.println("   _____          __  __ ______ ______      ________ _____ ");
                System.out.println("  / ____|   /\\   |  \\/  |  ____/ __ \\ \\    / /  ____|  __ \\");
                System.out.println(" | |  __   /  \\  | \\  / | |__ | |  | \\ \\  / /| |__  | |__) |");
                System.out.println(" | | |_ | / /\\ \\ | |\\/| |  __|| |  | |\\ \\/ / |  __| |  _  / ");
                System.out.println(" | |__| |/ ____ \\| |  | | |___| |__| | \\  /  | |____| | \\ \\ ");
                System.out.println("  \\_____/_/    \\_\\_|  |_|______\\____/   \\/   |______|_|  \\_\\");
                System.out.println("");
                System.out.println("            Oh no, you have no more lives left!");
                System.out.println("Press enter 6 to restart, or enter 7 to quit");
            }
        }
    }
}