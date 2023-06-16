import java.util.Random;
import java.util.Scanner;

public class RpgText {
    public static void main(String[] args) {

        //Creating objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        //Game Variables - Game Design

        String[] enemies = { "Skeleton", "Zombie", "Thieve", "Dog Hound"};

        int maxEnemyHealth = 85;
        int enemyAttackDamage= 28;

        //Hero Stats
        int health = 100;
        int attackDamage = 45;
        int numHealthPotions = 3;
        int healthPotionHeal = 25;
        int healthPotDrop = 50; //drop chance

        boolean running = true;

        System.out.println("As you walk through the fogged swamp under a heavy rain you see a cave....");
        System.out.println("...written in the wall, looks like it was written with blood, is saying....");
        System.out.println("---WELCOME TO YOUR DOOM---");




    }
}
