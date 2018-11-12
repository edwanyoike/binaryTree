package com.BugzTests;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many random nodes between 1 - 20 do you want in the tree (the nodes will contain" +
                "keys from 1 - 100):\n");
        int nodeNums = input.nextInt();


        int value;
        Tree theTree = new Tree();
        Random fif = new Random();
        fif.ints(20);

        for(int i=0; i<nodeNums;i++)
        {
            theTree.insert(fif.nextInt(100),i);
        }

        while(true)
        {
            System.out.println("Enter option from menu");
            System.out.print("1: display tree \n2: insert \n3: find \n4: delete\n5: inorder traversal\nq: press\"q\" to quit\n  ");

            String choice = input.nextLine();

            switch(choice)
            {
                case "1":
                    System.out.print(" display tree: ");
                    theTree.displayTree();
                    break;
                case "2":
                    System.out.print("Enter value to insert: ");
                    value = input.nextInt();
                    theTree.insert(value, value );
                    break;
                case "3":
                    System.out.print("Enter key to find: ");
                    value = input.nextInt();
                    Node found = theTree.find(value);
                    if(found != null)
                    {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");

                        }
                        else
                            System.out.print("Could not find ");
                    System.out.print(value + "\n");
                    break;

                case "4":
                    System.out.print("Enter value to delete: ");
                    value = input.nextInt();
                    boolean didDelete = theTree.delete(value);
                    if(didDelete)
                        System.out.print("Deleted " + value + "\n");


                else
                    System.out.print("Could not delete ");
                System.out.print(value + "\n");
                break;


                case "5":
                    theTree.traverse(2);
                    break;

                case"q":
                    System.exit(0);
                    input.close();

                default:
                    System.out.print("Invalid entry\n");
                    break;
            } // end switch

       input.reset();
        } // end while
    } // end main()
}

