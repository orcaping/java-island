import java.util.Scanner;

public class Bounty {
    public static void main(String[] args) {
        // System.out.println("How many bottles did you grab?: ");
        // int bottles = new Scanner(System.in).nextInt();

        // int crewBottles = bottles;
        // if ((bottles % 2) == 1){
        //     crewBottles  = (bottles -1) / 2;
        // } else {
        //     crewBottles = bottles / 2; 
        // }
        // System.out.println("How many crew members are involved?: ");
        // int crewCount = new Scanner(System.in).nextInt();

        // int captainBottles = crewBottles;
        // int crewBottlesPerPirate = crewBottles / crewCount;

        // System.out.println("The captain gets: " + captainBottles + " bottles!");
        // System.out.println("The crew of " + crewCount + " gets a " + crewBottlesPerPirate + " each!" );

        System.out.println("Number of bottles in total?");
        int bottles = new Scanner(System.in).nextInt();

        int captainBottles = bottles / 2;
        int crewBottles = bottles - captainBottles;

        System.out.println("Bottles for the captain: " + captainBottles);
        System.out.println("Bottles for all crew members: " + crewBottles);

        System.out.println("Number of crew members?");
        int crewMembers = new Scanner(System.in).nextInt();
        System.out.println(" Fair share without remainder? " + (crewBottles % crewMembers == 0));

    }
}
