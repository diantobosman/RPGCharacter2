import Character.*;
import Item.Armor;
import Item.Weapons;
import Item.Weapons.*;

import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the CharacterTest.");
        PickCharacter();
    }

    public static void PickCharacter() {

        System.out.println("Please type the character that you would like to creat: MAGE, RANGER, ROGUE, WARRIOR");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        if(choice.equals("MAGE")) {
            TestMage();
        }

        else if(choice.equals("RANGER")) {
            TestRanger();
        }
        else if(choice.equals("ROGUE")) {
            TestRogue();
        }
        else if(choice.equals("WARRIOR")) {
            TestWarrior();
        }
        else System.out.println("This character does not exist.");
    }

    public static void TestMage() {
        while (true) {
            System.out.println("Welcome to the test. Would you like to create a mage?");
            Continue();
            Mage mage = new Mage();
            System.out.println("Mage created. It had the following properties: ");

            System.out.println("Name: " + mage.getName());

            System.out.println("Strength: " + mage.getAttributes()[0]);
            System.out.println("Dexterity: " + mage.getAttributes()[1]);
            System.out.println("Intelligence: " + mage.getAttributes()[2]);
            System.out.println("Total: " + mage.getTotalPrimaryAttributes());

            System.out.println("Would you like to level up your mage?");
            Continue();

            mage.levelUp();
            System.out.println("Mage leveled up. It had the following properties: ");
            System.out.println("Strength: " + mage.getAttributes()[0]);
            System.out.println("Dexterity: " + mage.getAttributes()[1]);
            System.out.println("Intelligence: " + mage.getAttributes()[2]);
            System.out.println("Total: " + mage.getTotalPrimaryAttributes());
            break;
        }
    }

    public static void TestRanger() {
        while (true) {
            System.out.println("Welcome to the test. Would you like to create a Ranger?");
            Continue();
            Ranger ranger = new Ranger();
            System.out.println("Ranger created. It had the following properties: ");

            System.out.println("Name: " + ranger.getName());

            System.out.println("Strength: " + ranger.getAttributes()[0]);
            System.out.println("Dexterity: " + ranger.getAttributes()[1]);
            System.out.println("Intelligence: " + ranger.getAttributes()[2]);
            System.out.println("Total: " + ranger.getTotalPrimaryAttributes());

            System.out.println("Would you like to level up your mage?");
            Continue();

            ranger.levelUp();
            System.out.println("Mage leveled up. It had the following properties: ");
            System.out.println("Strength: " + ranger.getAttributes()[0]);
            System.out.println("Dexterity: " + ranger.getAttributes()[1]);
            System.out.println("Intelligence: " + ranger.getAttributes()[2]);
            System.out.println("Total: " + ranger.getTotalPrimaryAttributes());
            break;
        }
    }

    public static void TestRogue() {
        while (true) {
            System.out.println("Welcome to the test. Would you like to create a rogue?");
            Continue();
            Rogue rogue = new Rogue();
            System.out.println("Rogue created. It had the following properties: ");

            System.out.println("Name: " + rogue.getName());

            System.out.println("Strength: " + rogue.getAttributes()[0]);
            System.out.println("Dexterity: " + rogue.getAttributes()[1]);
            System.out.println("Intelligence: " + rogue.getAttributes()[2]);
            System.out.println("Total: " + rogue.getTotalPrimaryAttributes());

            System.out.println("Would you like to level up your mage?");
            Continue();

            rogue.levelUp();
            System.out.println("Rogue leveled up. It had the following properties: ");
            System.out.println("Strength: " + rogue.getAttributes()[0]);
            System.out.println("Dexterity: " + rogue.getAttributes()[1]);
            System.out.println("Intelligence: " + rogue.getAttributes()[2]);
            System.out.println("Total: " + rogue.getTotalPrimaryAttributes());
            break;
        }
    }

    public static void TestWarrior() {
        while (true) {
            System.out.println("Welcome to the test. Would you like to create a warrior?");
            Continue();
            Warrior warrior = new Warrior();
            System.out.println("Warrior created. It had the following properties: ");

            System.out.println("Name: " + warrior.getName());

            System.out.println("Strength: " + warrior.getAttributes()[0]);
            System.out.println("Dexterity: " + warrior.getAttributes()[1]);
            System.out.println("Intelligence: " + warrior.getAttributes()[2]);
            System.out.println("Total: " + warrior.getTotalPrimaryAttributes());

            System.out.println("Would you like to level up your warrior?");
            Continue();

            warrior.levelUp();
            System.out.println("Warrior leveled up. It had the following properties: ");
            System.out.println("Strength: " + warrior.getAttributes()[0]);
            System.out.println("Dexterity: " + warrior.getAttributes()[1]);
            System.out.println("Intelligence: " + warrior.getAttributes()[2]);
            System.out.println("Total: " + warrior.getTotalPrimaryAttributes());
            break;
        }
    }

    // Use method to check if user wants to continue or not.
    public static void Continue() {
        while (true) {
            System.out.println("Would you like to continue? Please press Y.");
            Scanner input = new Scanner(System.in);
            String c = input.nextLine();
            if (c.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}



