import java.util.Random;
import java.util.Scanner;

public class RpgText {
    public static void main(String[] args) {

        //Creating objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        //Game Variables - Game Design

        String[] enemies = {"Skeleton", "Zombie", "Thieve", "Dog Hound"};

        int maxEnemyHealth = 85;
        int enemyAttackDamage = 28;

        //Hero Stats
        String heroName;
        int health = 100;
        int attackDamage = 45;
        int numHealthPotions = 3;
        int healthPotionHeal = 25;
        int critChance = attackDamage + 22;
        int healthPotDrop = 50; //drop chance

        boolean running = true;

        System.out.println("You awake, not knowing where you are, what happened, but you only remember your name...");

        System.out.print("...what's your name?");
        System.out.println();
        String name = sc.nextLine();
        System.out.println("Arise " + name + "!!" + "open your eyes and move forward!");


        System.out.println("As you walk through the fogged swamp under a heavy rain you see a cave....");
        System.out.println("...written in the wall, looks like it was written with blood, is saying....");
        System.out.println("---WELCOME TO YOUR DOOM---");


        GAME:
        while (running) {
            System.out.println("--------------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("#  " + enemy + "  has appeared!!  #");

            while (enemyHealth > 0) {
                System.out.println("Your HP: " + health);
                System.out.println(">" + enemy + "'s HP: " + enemyHealth);
                System.out.println("What would you do " +  " ??");
                System.out.println("1. Attack!");
                System.out.println("2. Dring HP Potion");
                System.out.println("3. Run!");

                String input = sc.nextLine();

                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.print("> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.print("> You recieved " + damageTaken + " in retaliation. ");
                    if (health < 1) {
                        System.out.println("> You are really hurt, you cannot go on!");
                        break;

                    }

                }

                else if(enemyHealth > 10){
                    int criticalhit = rand.nextInt(attackDamage + critChance)  - enemyHealth;

                }


                else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        health += healthPotionHeal;
                        numHealthPotions--;
                        System.out.println("> You healed yourself for " + healthPotionHeal + "." + "> You now have " + health + numHealthPotions + " total.");

                    } else {
                        System.out.println("> You have no potions left, kill enemies to have a chance to recieve more.");
                    }

                } else if (input.equals("3")) {
                    System.out.println("You have runned away from " + enemy + " ! ");
                    continue GAME;

                } else {
                    System.out.println("Invalid command output!");

                }

            }
            if (health < 1) {
                System.out.print("You escaped limping out of the dungeon...");
                break;

            }
            System.out.println("----------------------------------------");
            System.out.println(" #" + enemy  + " was defeated!  #");
            System.out.println(" #  You have " + health + " HP left!");

            if(rand.nextInt(100) < healthPotDrop){
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a HP potion!   #");
                System.out.println(" # You now have " + numHealthPotions + " potion(s) left!  # ");

            }
            System.out.println("----------------------------------------");
            System.out.println(" What you would like to do next? ");
            System.out.println("1. Continue fighting.");
            System.out.println("2. Exit the cave!");

            String input = sc.nextLine();

            while(!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid command output");
                input = sc.nextLine();

            }
            if(input.equals("1")){
                System.out.println("You may continue your quest!");

            } else if (input.equals("2")) {
                System.out.println("You lived to fight another day," + name +   " , time to remember who you are!");
                break;
                
            }

        }

        //TESTE

        System.out.println("-------THANK YOU FOR PLAYING THIS SHIT GAME-----------");


    }
}
