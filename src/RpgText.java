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
        String name = sc.nextLine();

        System.out.println("Arise " + name + "!!" + "open your eyes and move forward!");


        System.out.println("As you walk through the fogged swamp under a heavy rain you see a cave....");
        System.out.println("...written in the wall, looks like it was written with blood, is saying....");
        System.out.println("---WELCOME TO YOUR DOOM---");


        GAME:
        while (running){
            System.out.println("--------------------------------------------------------");

            int enemyHealth= rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t#  " + enemy + "  has appeared!!  #\n" );

            while(enemyHealth < 0 ){
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you do " + name + " ??");
                System.out.println("\t1. Attack!");
                System.out.println("\t2. Dring HP Potion");
                System.out.println("\t3. Run!");

                String input = sc.nextLine();
                if(input.equals("1")){
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken=rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                }
                else if(enemyHealth > 10){
                    int criticalhit = critChance - enemyHealth;

                }
                else if(input.equals("2")){

                }

                else if(input.equals("3")){

                }
                else{

                }

            }



        }




    }
}
