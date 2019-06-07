package io.zipcoder.polymorphism;

import java.util.*;


public class MainApplication {

    private static void petTypes(int number){
        System.out.println("Is pet # " + number + " a dog, cat, or bird ?");
    }



    public static void main(String[] args) {
        sortBy mySort = new sortBy();

        Scanner input = new Scanner(System.in);
        int numberOfPets = 0;

        System.out.print("How many pets do you have: ");
        while (numberOfPets <= 0) {
            while (!input.hasNextInt()) {
                System.out.println("That's not a valid number!");
                input.next();
            }
            numberOfPets = input.nextInt();
            if (numberOfPets == 0) {
                System.out.println("That's too bad, pets are great!");
                break;
            } else if (numberOfPets < 0) {
                System.out.println("That's not a valid number!");
            }
        }
        System.out.println("Thanks.");


        ArrayList<Pet> petList = new ArrayList<Pet>(numberOfPets);

        for (int i = 0; i < numberOfPets; i++) {

            petTypes(i + 1);
            String petType = input.next().toLowerCase();

            if (petType.equals("dog")) {
                System.out.print("Enter your dog's name:\n");
                String petName = input.next();
                Dog dog = new Dog(petName);
                petList.add(dog);
            } else if (petType.equals("cat")) {
                System.out.print("Enter your cat's name:\n");
                String petName = input.next();
                Cat cat = new Cat(petName);
                petList.add(cat);
            } else if (petType.equals("bird")) {
                System.out.print("Enter your bird's name:\n");
                String petName = input.next();
                Bird bird = new Bird(petName);
                petList.add(bird);
            } else {
                System.out.println("That is not a valid pet type.");
                i--;
            }
        }
        System.out.println("Pets sorted by Name: ");
        for (Pet each: mySort.sortByName(petList)){
            System.out.println(each.getName());
        }


      //print the petList
        System.out.println("Pets say: ");
        for (Pet each: petList){

            System.out.println(each.getName() + " says " + each.speak());
        }

    }
    
}
