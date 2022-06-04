package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter = new VirtualPetShelter();
        VirtualPetShelter PetsToAdopt = new VirtualPetShelter();

        OrganicCat organicCat1 = new OrganicCat("Dusty ", "organicCat",10,15,20,25,30, 35);
        OrganicCat organicCat2 = new OrganicCat("Bruiser ", "organicCat",15,20,25,30,35, 40);
        OrganicCat organicCat3 = new OrganicCat("Sky ", "organicCat",20,25,30,35,40, 45);
        OrganicDog organicDog1 = new OrganicDog("Mia ", "organicDog",25,30,35,40,45,50);
        OrganicDog organicDog2 = new OrganicDog("Patsy ", "organicDog",30,35,40,45,50,55);
        OrganicDog organicDog3 = new OrganicDog("Casper ", "organicDog",40,45,50,55,65,70);
        RoboticCat roboticCat1 = new RoboticCat("Blue ","roboticCat",45,50,55,60);
        RoboticCat roboticCat2 = new RoboticCat("Grey ","roboticCat",50,55,60,65);
        RoboticCat roboticCat3 = new RoboticCat("Midnight ","roboticCat",55,65,70,75);
        RoboticDog roboticDog1 = new RoboticDog("Pudge ","roboticDog",60,65,70,75);
        RoboticDog roboticDog2 = new RoboticDog("Red ","roboticDog",65,70,75,80);
        RoboticDog roboticDog3 = new RoboticDog("Guru ","roboticDog",70,75,80,85);

        myShelter.addPet(organicCat1);
        myShelter.addPet(organicCat2);
        myShelter.addPet(organicDog1);
        myShelter.addPet(organicDog2);
        myShelter.addPet(roboticCat1);
        myShelter.addPet(roboticCat2);
        myShelter.addPet(roboticDog1);
        myShelter.addPet(roboticDog2);

        PetsToAdopt.addPet(organicCat3);
        PetsToAdopt.addPet(organicDog3);
        PetsToAdopt.addPet(roboticCat3);
        PetsToAdopt.addPet(roboticDog3);


        int userChoice;

        do{
            System.out.println("Welcome to your Pet Shelter!");
            myShelter.getShelter();
            System.out.println("");

            System.out.println("Press 1 to feed all organic pets");
            System.out.println("Press 2 to give water to all organic pets");
            System.out.println("Press 3 to to play with pets");
            System.out.println("Press 4 to add a pet");
            System.out.println("Press 5 to let your sister adopt a pet");
            System.out.println("Press 6 to let the pets outside to go potty");
            System.out.println("Press 9 to exit");
            System.out.println("");


            userChoice = input.nextInt();

            if (userChoice == 1){
//                myShelter.feed();
                System.out.println("You fed all your pets");
            }
            else if(userChoice == 2){
//                myShelter.watered();
                System.out.println("You gave water to all your pets");

            }
            else if(userChoice == 3) {
//                myShelter.played();
                System.out.println("You played with all your pets");
            }
            else if(userChoice == 4) {

                System.out.println("You went to the pound and found some animals to adopt");
                PetsToAdopt.getShelter();
                System.out.println("Which pet would you like to adopt");

                do {
                    System.out.println("Press 1 to adopt Sky");
                    System.out.println("Press 2 to adopt Casper");
                    System.out.println("Press 3 to adopt Midnight");
                    System.out.println("Press 4 to adopt Guru");
                    System.out.println("Press 5 to go back");

                    if (userChoice == 1) {

                        System.out.println("Thank you for adopting Sky");
                        myShelter.addPet(organicCat3);
                        PetsToAdopt.removePet("Sky");

                    } else if (userChoice == 2) {

                        System.out.println("Thank you for adopting Casper");
                        myShelter.addPet(organicDog3);
                        PetsToAdopt.removePet("Casper");

                    } else if (userChoice == 3) {

                        System.out.println("Thank you for adopting Midnight");
                        myShelter.addPet(roboticCat3);
                        PetsToAdopt.removePet("Midnight");

                    } else if (userChoice == 4) {

                        System.out.println("Thank you for adopting Guru");
                        myShelter.addPet(roboticDog3);
                        PetsToAdopt.removePet("Guru");
                    }

                } while (userChoice != 5);

            } else if(userChoice == 5) {
                System.out.println("Which pet would you like to remove");
                System.out.println("Your current pets are ");
                myShelter.getShelter();
                System.out.println("Type the name of the pet you want to let go");
                Scanner sc = new Scanner(System.in);
                String petName = input.nextLine();
                myShelter.removePet(petName);
                System.out.println("You let your sister adopts " + petName);
            }
            else if(userChoice == 6) {
//                myShelter.potty();
                System.out.println("You let the pets outside to go potty");
            }
//            myShelter.Tick();

        }while (userChoice != 9);

    }
}

