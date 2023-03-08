//dumb java stuff you have to set up first
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Scanner Doggo = new Scanner(System.in); // create this thing to get user input

    System.out.println("Java Text Based Game!"); // prints to screen

    // game variables
    int room = 1;
    int jerry = 0;
    String input = "glurbaburbal!"; // dummy value for game loop
    String[] inventory = { " ", " ", " ", " " }; // use this to hold player items

    while (input != "quit") { // OMG GAME LOOP-----------------------------------------

      // print inventory
      System.out.println("Your inventory:");
      for (int i = 0; i <= 3; i++)
        System.out.println(inventory[i]);
       // create instance of Random class
      Random rand = new Random();
      jerry += rand.nextInt(1000);
      
      switch (room) {
        case 1:  
          System.out.println("You're in room 1, you can go East");
          input = Doggo.nextLine();
          if (input.equals("East"))
            room = 2;
          break;
          
        case 2:
          System.out.println("You're in room 2, you can go West or South");
          input = Doggo.nextLine();
          if (input.equals("South"))
            room = 3;
          else if (input.equals("West"))
            room = 1;
          break;

        case 3:
          System.out.println("You're in room 3, you can go North or South.");
          // check if they already have the gun, if not tell them they got it
          if (!inventory[0].equals("marshmallow gun")) {
            System.out.println("OMG you got the marshmallow gun!");
            inventory[0] = "marshmallow gun";
            input = Doggo.nextLine();
            if (input.equals("North"))
              room = 2;
            if (input.equals("South"))
              room = 4;
            
            break;
          }
          
        case 4:
          System.out.println("You're in room 4, you can go weast or North");
          input = Doggo.nextLine();
          if (input.equals("North"))
            room = 3;
          else if (input.equals("weast"))
            room = 5;
          break;
          

        case 5:
          System.out.println("You're in room 5, you can go North. or east");
          input = Doggo.nextLine(); // get user input
          // check if they already have the gun, if not tell them they got it
          if (!inventory[1].equals(jerry)) {
            System.out.println("OMG you got the Jerry.");
            inventory[1] = "Jerry = infinite";
          }
          if (input.equals("North"))
            room = 7;
          else if (input.equals("east"))
            room = 6;
          break;

        case 6:
          System.out.println("You're in room 6, you can go North.");
          input = Doggo.nextLine(); // get user input
          // check if they already have the gun, if not tell them they got it
          if (!inventory[2].equals("key")) {
            System.out.println("OMG you got key.");
            inventory[2] = "key";
            if (input.equals("North"))
              room = 7;
            break;

          }
        case 7:
          System.out.println("You're in room 7, you need a key to unlock the door!");
          input = Doggo.nextLine(); // get user input
          if (input.equals("key"))
            room = 8;
          else if (input.equals("east"))
            room = 5;
          break;
          
        case 8:
          System.out.println("you made it out!");
          input = "quit";
          break;

      }// end bracket for switch
    } // end bracket for OMG GAME
      // LOOP----------------------------------------------------
  }// end bracket for public static void main
}// end bracket for class main
